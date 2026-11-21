# JBL Atelier — V1 (Axelor Open Platform)

Application AOP/AOS pour un **atelier de réparation de matériel de jardinage**
(tondeuses, tronçonneuses, débroussailleuses, motoculteurs, taille-haies...).

Cible : **Axelor Open Platform 8.2.6** (plugin Gradle `com.axelor.app` 8.2.6, Java 21, Tomcat 10.1 / Jakarta EE 10)
+ modules publiés **AOS 9.2.1** (`com.axelor.apps:axelor-*:9.2.1`, construits sur AOP 8.2).

> **Migration AOP 10.0 — bloquée sans licence commerciale.** AOP 10.0 (release 2026-10-23)
> est une édition unique sous licence Axelor (Guardian) : le plugin Gradle `com.axelor.app`
> et les artifacts AOS 10.x ne sont PAS publiés sur le dépôt public `maven-public`, mais sur
> `https://repository.axelor.com/nexus/repository/maven-enterprise/` (credentials requis).
> Dernières versions open source disponibles : plugin **8.2.6**, AOS **9.2.1** (9.2.2-SNAPSHOT en dev).
>
> **Pour migrer en 10.0 avec une licence Guardian :**
> 1. Décommenter le dépôt `maven-enterprise` dans `settings.gradle` et renseigner
>    `axelorMavenUsername` / `axelorMavenPassword` (gradle.properties ou `-P...`).
> 2. `settings.gradle` : `id 'com.axelor.app' version '10.0.+'`
> 3. `gradle.properties` : `axelorBaseVersion = 10.0.+` (AOS 10.x construit sur AOP 10.0)
> 4. XSD XML : passer en `_10.0.xsd` (domain-models, object-views, data-import, data-queries)
> 5. `./gradlew generateCode` puis `./gradlew build` — corriger les breaking changes
>    (voir `docs.axelor.com/adk/10.0` : générateur de code en merge, Hibernate 6.6 /
>    Jakarta Persistence 3.1, nouveaux événements d'auth tracés).
> Le bloc commenté dans `settings.gradle` est prêt à l'emploi.

## V1 : on ne réinvente plus la roue

Le module ne contient plus que le **cœur métier atelier** (`JblRepairOrder` + `JblRepairLine`) ;
tout le reste vient de l'écosystème Axelor :

| Objet | Module AOS | Entité native |
|---|---|---|
| Fichier client / fournisseur | axelor-base | `Partner` (`isCustomer` / `isSupplier`) |
| Pièces détachées | axelor-base | `Product` (`productTypeSelect = 'storable'`) |
| Matériel client | **JBL (custom)** | `JblEquipment` (code séquentiel `MAT-00001`, marque, modèle, n° série, client) |
| Devis | **axelor-sale** | `SaleOrder` / `SaleOrderLine` (totaux HT/TVA/TTC, validité, PDF natifs) |
| Facture + compta + paiements | **axelor-account** | `Invoice` / `InvoiceLine` / `Payment` / `Move` (ventilation, lettrage) |
| Stock | **axelor-stock** | `StockMove` / `StockMoveLine` / `StockLocation` / `StockLocationLine` / `Inventory` |
| Numérotation OR / matériel | axelor-base | `MetaSequence` `jbl.repair.order.seq` → `OR-00001`, `jbl.equipment.seq` → `MAT-00001` (data-init) |
| Fiche d'ordre de réparation | **JBL (custom)** | `JblRepairOrder` + `JblRepairLine`, liés à `JblEquipment`, `SaleOrder`, `Invoice`, `StockMove` |

**Modules AOS embarqués (strict nécessaire)** : `axelor-base`, `axelor-sale` (+ `axelor-crm` transitif), `axelor-account`, `axelor-stock`, `axelor-purchase`.
Retirés du classpath : `axelor-intervention` (remplacé par `JblEquipment` custom — il tirait contract/RH/project/banque), `axelor-supplychain` (le pont OR → StockMove → Invoice est fait par `RepairOrderServiceImpl`).

> **Pourquoi `axelor-purchase` est embarqué alors que le code JBL ne l'utilise pas** :
> `axelor-stock` contient la vue d'extension `views/CallTenderSupplier.xml` dont le
> `model="com.axelor.apps.purchase.db.CallTenderSupplier"`. Sans le jar purchase, `ViewLoader`
> lève `IllegalArgumentException: Invalid view, model not found` pendant l'installation de
> stock, ce qui **abote la boucle d'installation des modules** (`ModuleManager.installModules`
> → forEach) : `axelor-jbl`, bien que « pending », n'est jamais installé et ses menus/vues
> n'existent pas en base. Symptôme : boot OK, app active, mais 0 ligne `meta_menu`/`meta_view`
> pour `axelor-jbl`. `axelor-purchase` ne dépend que de `axelor-base` (aucun tirage supplychain).
>
> Piège data-init : les `importId` des CSV (`jbl_permissions.csv`, `jbl_meta_sequence.csv`)
> doivent être uniques **dans toute la table** (contrainte `uk_...` sur `import_id`) —
> ceux des modules AOS occupent déjà 1..N, utiliser des valeurs hautes (ex: 9101+).

**App Management** : le module déclare une app `jbl` via `src/main/resources/apps/jbl.yml`
(mécanisme natif AOS, chargé par `AppService` à chaque boot — contrairement au data-init qui
ne se joue qu'au premier démarrage). L'app apparaît en carte dans *Administration → Application
Config → Apps management* (filtre `isCustom = null OR ...` ; on ne touche pas `isCustom`).
`modules: axelor-jbl` rattache les menus du module à l'app, et **`active: true`** est obligatoire :
AOP masque les menus dont le module appartient à une app inactive — sans `active: true`, le menu
« Atelier JBL » disparaît au boot. Image : `apps/img/app-jbl.png`.
- **Ne pas mettre `top="true"` sur un menuitem en AOP 8.2** : le XSD 8.2 (`MenuItem`) n'a pas cet
  attribut (apparu en 10.0) — un attribut invalide fait rejeter tout le fichier `Menus.xml` au
  chargement et aucun menu du module n'est créé. Un menu sans `parent` est déjà top-level.
Vérification en base : `SELECT code, name, active, modules FROM studio_app WHERE code = 'jbl';`
et `SELECT name, hidden, module FROM meta_menu WHERE name LIKE 'menu-jbl%';`

### Workflow d'un ordre de réparation

`OR : Brouillon → Réparation en cours → Terminée → Facturée` (ou `Annulée`)

1. **Créer l'OR** (client + matériel `JblEquipment` + lignes pièce/main d'œuvre/forfait) ; le n° `OR-00001`
   est posé automatiquement par la `MetaSequence` AOP.
2. Bouton **« Générer un devis »** : crée un `SaleOrder` (lignes copiées de l'OR) — envoi/acceptation/PDF
   gérés nativement par axelor-sale.
3. **Démarrer la réparation** : statut « en cours ».
4. **Terminer** : consomme automatiquement les pièces détachées via un `StockMove` interne
   (magasin → emplacement virtuel « Atelier ») réalisé avec `StockMoveService.realize` :
   blocage natif si stock insuffisant, niveaux de stock mis à jour.
5. Sur l'OR terminé, **« Générer la facture »** : crée une `Invoice` (axelor-account, brouillon,
   totaux calculés par `InvoiceService.compute`) ; validation/ventilation/paiement natifs.

Une **vue kanban** (`Pipeline des réparations`) est disponible sur la liste des OR
(colonnes = statuts, drag & drop pour changer de statut).

## Arborescence

```text
axelor-jbl/
├── settings.gradle / build.gradle / gradle.properties   # build AOP (plugin com.axelor.app 8.2.6)
├── src/main/resources/
│   ├── axelor-config.properties                          # config appli + PostgreSQL
│   ├── META-INF/persistence.xml
│   ├── data-init/                                        # input-config.xml + input/jbl_sequence.csv
│   │                                                     # (Sequence "jbl.repair.order.seq" => OR-2026-00001)
│   ├── domains/Jbl.xml                                   # 2 entités custom (génération code AOP)
│   ├── views/                                            # Selects, grilles, formulaires, Menus, Actions
│   │                                                     # (depuis AOP 8.x, actions et vues vivent dans
│   │                                                     #  views/*.xml à racine <object-views>)
│   └── i18n/messages_fr.properties
└── src/main/java/com/axelor/apps/jbl/
    ├── db/repo/JblRepairOrderManagementRepository.java   # numérotation via JpaSequence
    ├── module/JblModule.java                             # bindings Guice
    ├── service/RepairOrderService(Impl).java            # workflow OR : conso StockMove,
    │                                                     # création SaleOrder / Invoice
    └── web/JblRepairOrderController.java                 # contrôleur (ActionRequest/ActionResponse)
```

## Prérequis et lancement

- JDK **21**, Gradle (wrapper recommandé), PostgreSQL.
- Créer la base : `CREATE DATABASE axelor_jbl;` puis adapter `db.default.*` dans
  `src/main/resources/axelor-config.properties`.
- Depuis la racine du projet :

```sh
./dev.sh                # DB (Docker) + app en mode dev avec hot reload
./dev.sh --no-db        # si PostgreSQL tourne déjà ailleurs
./dev.sh --no-watch     # sans la surveillance des sources Java
./gradlew run           # équivalent manuel (build + démarre sur http://localhost:8080)
```

`dev.sh` détecte automatiquement le JDK 21 et Gradle (wrapper `./gradlew` généré
au besoin), démarre le service `db` du `docker-compose.yml`, puis lance
`./gradlew run`. En mode `dev`, AOP recharge à chaud les vues XML, domaines et
i18n ; le script surveille en plus `src/main/java` et relance l'app quand le
code Java change (installer `fswatch` — `brew install fswatch` — pour une
détection instantanée, sinon repli sur un polling de 2 s).

Login par défaut AOP en mode dev : `admin` / `admin`.

### Nettoyage de la base de dev (données/menus hors Atelier JBL)

Par défaut AOP importe des données de démo (utilisateur `demo`) et affiche les menus
de tous les modules embarqués (Studio, Messagerie, Teamwork, Calendrier, Documents...).
Les modules `axelor-studio` / `axelor-message` restent dans le classpath (axelor-base 9.x
référence leurs classes au démarrage), mais on masque leurs menus.

Pour repartir d'une base vierge et ne garder que l'essentiel (admin + Administration + JBL) :

```sh
./scripts/reset-dev-db.sh        # recrée la base vide (docker compose down -v)
./dev.sh                         # démarre l'app : schéma + modules recréés
# puis applique le nettoyage (menus cachés, user demo supprimé) :
docker cp scripts/clean-demo-data.sql axelor-jbl-db-1:/tmp/clean.sql
docker exec axelor-jbl-db-1 psql -U axelor -d axelor_jbl -f /tmp/clean.sql
```

Menus top-level visibles après nettoyage : **Administration** (axelor-base/core) et
**Atelier JBL**. Seul l'utilisateur `admin` est conservé.

## Pistes pour la suite

- Configurer les `App*` des modules embarqués (AppBase, AppSale, AppAccount, AppStock) via
  *Administration -> Apps* (l'app **Atelier JBL** y apparaît aussi, code `jbl`) : multi-société,
  devises, journaux/comptes comptables pour la ventilation des factures.
- Impressions PDF de l'OR via le moteur BIRT AOP + modèle `.rptdesign` (devis/facture ont déjà
  leurs PDF natifs).
- Pièces jointes (photos avant/après) sur `JblEquipment` via `MetaFile` (champ `notes` + attachements).
- Alertes de stock sous seuil : tableau de bord axelor-stock ou `Batch` planifié.
- Commandes fournisseurs de pièces : réintégrer `axelor-purchase` si besoin (`aos 'axelor-purchase'`).
- SAV sur site : `axelor-helpdesk` (`Ticket` avec SLA) en addon.

## Note

- `context.app = com.axelor.studio.app.service.ScriptAppService` dans `axelor-config.properties`
  est **obligatoire** dès qu'un module AOS (sale, account, stock...) est embarqué : les menus de ces
  modules évaluent `__config__.app.isApp('sale')` etc. Sans cette propriété, `__config__.app` est
  null et chaque chargement de menu logue des NPE (`Unable to evaluate menu ...`).

- Versions épinglées : plugin `com.axelor.app` **8.2.6** (settings.gradle) et `axelor-base` **9.2.1**
  (gradle.properties `axelorBaseVersion`). Ne PAS remettre de wildcard `8.2.+` sur axelor-base :
  les versions 8.2.x publiées d'axelor-base référencent `com.axelor.auth.AuditInterceptor`, absent du
  core 8.2.6 (classe supprimée en 8.2), et tirent des addons javax incompatibles Jakarta.
- `build.gradle` exclut `org.codehaus.groovy` d'axelor-base (conflit de capacité avec le
  `org.apache.groovy:4.x` d'AOP 8.2) et embarque le driver PostgreSQL (`runtimeOnly`).
- En AOP 8.2 : domaines en `<module/>` + `<entity>` frères, vues/actions en racine `<object-views>`,
  `<text>` remplacé par `<string large="true"/>`, `scale` exige `precision` sur les décimaux,
  exceptions dans `com.axelor.apps.base` (`AxelorMessageException` + `TraceBackRepository.CATEGORY_*`),
  repositories générés dans `<package>.db.repo`, `ActionView` dans `com.axelor.meta.schema.actions`.
- La persistence-unit doit s'appeler **`persistenceUnit`** et le driver JDBC doit être déclaré
  (`db.default.driver`), sinon « No suitable driver » au démarrage.

## Docker

Image multi-stage : build du WAR avec Gradle (JDK 21) puis déploiement sur
**Tomcat 10.1** (Jakarta EE 10, requis par AOP 8.x) avec le WAR en `ROOT.war`
(application servie sur `http://localhost:8080/`).

```sh
docker build -t axelor-jbl:latest .          # build de l'image seule
docker compose up -d --build                  # app + PostgreSQL, app sur :8080
```

La configuration de la base est passée par variables d'environnement au format
AOP `AXELOR_CONFIG_<CLÉ>` (ex. `db.default.url` → `AXELOR_CONFIG_DB_DEFAULT_URL`) ;
voir `docker-compose.yml`. En prod, pense à changer le mot de passe `admin` initial.

## CI (GitHub Actions)

`.github/workflows/ci.yml` :

- **build** (push + PR) : JDK 21 + Gradle 8.14.3, `gradle clean build` (compile, tests, WAR) ;
- **docker** (push uniquement) : build de l'image et push sur **GHCR**
  (`ghcr.io/<owner>/axelor-jbl`), tags `v*` (semver), `sha` court, `latest` sur `main`,
  cache BuildKit `gha` ;
- **smoke** (push sur `main`) : `docker compose up`, attend que l'app réponde sur `:8080`,
  vérifie la page servie, puis teardown.

Pour activer le push GHCR : rien à configurer côté dépôt, le `GITHUB_TOKEN` avec
`permissions: packages: write` suffit (déjà dans le workflow). Rendre le package public
se fait dans les paramètres du repo/package sur GitHub.
