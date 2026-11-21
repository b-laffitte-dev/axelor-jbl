# JBL Atelier — V0 (Axelor Open Platform)

Application AOP/AOF pour un **atelier de réparation de matériel de jardinage**
(tondeuses, tronçonneuses, débroussailleuses, motoculteurs, taille-haies...).

Cible : **Axelor Open Platform 8.2.6** (plugin Gradle `com.axelor.app` 8.2.6, Java 21, Tomcat 10.1 / Jakarta EE 10)
+ module métier publié **axelor-base 9.2.1** (AOS 9.x, construit sur AOP 8.2).

## Fonctionnalités V0

| Objet | Implémentation |
|---|---|
| Fichier client | `Partner` (axelor-base), menu Clients filtré `isCustomer = true` |
| Fournisseur | `Partner` (axelor-base), menu Fournisseurs filtré `isSupplier = true` |
| Pièces détachées | `Product` (axelor-base), menu filtré `productTypeSelect = 'storable'` |
| Fiche d'ordre de réparation | `JblRepairOrder` + lignes `JblRepairLine` (pièce / main d'œuvre / forfait) |
| Devis | `JblQuotation` + `JblQuotationLine`, généré depuis l'OR (bouton « Confirmer ») |
| Facture | `JblInvoice` + `JblInvoiceLine`, générée depuis le devis accepté |
| Stock | `JblStock` (qte par pièce, seuil d'alerte) + `JblStockMovement` (entrées/sorties/ajustements) |
| Matériel client | `JblEquipment` (type, marque, modèle, n° de série, propriétaire) |

### Workflow d'un ordre de réparation

`Brouillon → Devis envoyé → Réparation en cours → Terminée → Facturée` (ou `Annulée`)

1. **Confirmer → générer le devis** : copie les lignes de l'OR dans un `JblQuotation`.
2. **Démarrer la réparation** : statut « en cours ».
3. **Terminer** : consomme automatiquement les pièces détachées en stock
   (mouvements de sortie `MOUV-...`, blocage si stock insuffisant).
4. Sur le devis accepté, **Générer la facture** ; à la validation de la facture,
   l'OR passe à « Facturée ».

Numérotation : `OR-2026-00001`, `DEV-2026-00001`, `FACT-2026-00001`, `MOUV-2026-00001`
(générée par `JblNumberService`, à remplacer par une `Sequence` AOP en V1).

## Arborescence

```text
axelor-jbl/
├── settings.gradle / build.gradle / gradle.properties   # build AOP (plugin com.axelor.app 8.2.+)
├── src/main/resources/
│   ├── axelor-config.properties                          # config appli + PostgreSQL
│   ├── META-INF/persistence.xml
│   ├── domains/Jbl.xml                                   # 9 entités (génération code AOP)
│   ├── views/                                            # Selects, grilles, formulaires, Menus, Actions
│   │                                                     # (depuis AOP 8.x, actions et vues vivent dans
│   │                                                     #  views/*.xml à racine <object-views>)
│   └── i18n/messages_fr.properties
└── src/main/java/com/axelor/apps/jbl/
    ├── module/JblModule.java                             # bindings Guice
    ├── service/                                          # JblNumberService, RepairOrderService,
    │                                                     # QuotationService, JblInvoiceService, JblStockService
    └── web/                                              # contrôleurs (ActionRequest/ActionResponse)
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

## Pistes pour la V1

- Remplacer la numérotation maison par les `Sequence` d'axelor-base.
- Brancher les vrais modules métier : `axelor-sale` (SaleOrder = devis), `axelor-account`
  (Invoice = facture comptable), `axelor-stock` (StockMove, emplacements, inventaires),
  `axelor-purchase` (commandes fournisseurs) — dépendances `implementation "com.axelor.apps:axelor-xxx:${axelorVersion}"`.
- Impressions PDF (devis/facture/OR) via le moteur de rapports AOP (BIRT) + modèles `.rptdesign`.
- Portail client pour suivre l'avancement de sa réparation, photos avant/après, signature électronique du devis.
- Alertes de stock sous le seuil (`minQuantity`) : tableau de bord ou job planifié.

## Note

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
