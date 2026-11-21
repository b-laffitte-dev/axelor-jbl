# Contexte projet — axelor-jbl

## Qu'est-ce que c'est

Application **AOP/AOS** pour un **atelier de réparation de matériel de jardinage**
(tondeuses, tronçonneuses, débroussailleuses, motoculteurs, taille-haies...).

- Plateforme embarquée : **Axelor Open Platform 8.2.6** (plugin Gradle
  `com.axelor.app` 8.2.6 dans `settings.gradle`), **Java 21**, **Tomcat 10.1 /
  Jakarta EE 10**, PostgreSQL.
- Module métier : **axelor-base 9.2.1** (AOS 9.x, construit sur AOP 8.2) via
  `axelorBaseVersion` dans `gradle.properties`. Le code importe aussi `axelor-sale`
  (`SaleOrder`), `axelor-account` (`Invoice`), `axelor-stock` (`StockMove`) tirés
  d'axelor-base/AOS.
- WAR : `axelor-jbl.war` ; build : `./gradlew build` / `run` ; dev hot-reload :
  `./dev.sh` (DB Docker + `./gradlew run`, login `admin`/`admin`).
- CI : `.github/workflows/ci.yml` (JDK 21 + Gradle, `gradle clean build`, docker
  GHCR, smoke test sur `:8080`).

## Arborescence

```text
axelor-jbl/
├── build.gradle / settings.gradle / gradle.properties
├── src/main/resources/
│   ├── axelor-config.properties          # config appli + PostgreSQL (db.default.*)
│   ├── META-INF/persistence.xml          # persistence-unit nommée "persistenceUnit"
│   ├── domains/Jbl.xml                   # entités Jbl* (génération de code AOP)
│   ├── views/                            # Selects.xml, JblRepairOrder.xml, Actions.xml, Menus.xml (racine <object-views>)
│   ├── data-init/                        # input-config.xml + CSV (dont jbl_sequence.csv)
│   └── i18n/messages_fr.properties
└── src/main/java/com/axelor/apps/jbl/
    ├── module/JblModule.java             # bindings Guice (AxelorModule)
    ├── service/RepairOrderService.java + RepairOrderServiceImpl.java
    ├── db/repo/JblRepairOrderManagementRepository.java
    └── web/JblRepairOrderController.java # ActionRequest/ActionResponse
```

## Entités métier du projet (package `com.axelor.apps.jbl.db`)

- `JblRepairOrder` (fiche d'OR) : `name` (unique, readonly, `sequence="jbl.repair.order.seq"`),
  `statusSelect` (selection `jbl.repair.order.status.select`), `partner` →
  `base.Partner` (client), `equipment`, `receptionDate`, `plannedDate`, `technician`
  → `auth.User`, `company` → `base.Company`, `diagnosis`, `workDone`,
  `repairLineList` (o2m → `JblRepairLine`, mappedBy), `totalHT`, liens vers
  `sale.SaleOrder` (devis), `account.Invoice` (facture), `stock.StockMove`.
- `JblRepairLine` : `repairOrder` (m2o), `lineTypeSelect` (pièce / main d'œuvre /
  forfait), `product` → `base.Product`, `description`, `quantity`, `unitPriceHT`,
  `totalHT`.

Workflow : **Devis → OR → Facture** (`SaleOrder` brouillon→envoyé→accepté ; OR
brouillon→en cours→terminée→facturée/annulée). La consommation des pièces au
passage « terminée » crée des mouvements de stock (blocage si stock insuffisant).

## Conventions et pièges AOP 8.2 (à respecter impérativement)

- Domaines : en AOP 8.2, `<module name="..." package="..."/>` est un **marqueur** et
  les `<entity>` sont des éléments **frères** à la racine de `<domain-models>`
  (XSD `domain-models_8.2.xsd`).
- Vues/actions : en 8.2, elles vivent dans `views/*.xml` à racine `<object-views>`
  (XSD `object-views_8.2.xsd`).
- `<text>` n'existe plus → `<string large="true"/>` ; `scale` exige `precision` sur
  les décimaux (ex. `precision="19" scale="2"`).
- Exceptions : `com.axelor.apps.base.AxelorMessageException` +
  `TraceBackRepository.CATEGORY_*` (pas `AxelorException` seul pour les messages
  utilisateur).
- Repositories générés dans `<package>.db.repo` (ex. `JblRepairOrderRepository`),
  repository custom = `repository="abstract"` + classe `...ManagementRepository`.
- `ActionView` : `com.axelor.meta.schema.actions.ActionView`.
- `persistence.xml` : l'unité doit s'appeler **`persistenceUnit`** et le driver JDBC
  déclaré (`db.default.driver`), sinon « No suitable driver » au démarrage.
- Versions épinglées : ne **pas** remettre de wildcard `8.2.+` sur axelor-base
  (axelor-base 8.2.x publié référence `com.axelor.auth.AuditInterceptor`, absent du
  core 8.2.6, et tire des addons javax incompatibles Jakarta). Exclusion
  `org.codehaus.groovy` d'axelor-base et driver PostgreSQL embarqués dans
  `build.gradle` : ne pas toucher sans raison.
- `axelor-studio` / `axelor-message` restent dans le classpath (référencés par
  axelor-base 9.x au démarrage) mais leurs menus sont masqués (nettoyage SQL
  `scripts/clean-demo-data.sql`).
- Après toute modif de `domains/*.xml` : `./gradlew generateCode` (le build le fait,
  mais en dev hot-reload XML seul ne régénère pas le code Java).
- En dev, le hot-reload XML (vues/domaines/i18n) est actif ; les changements Java
  nécessitent un redémarrage (`dev.sh` surveille `src/main/java` via fswatch/polling).

## Rôle du skill dans ce projet

Toute évolution (nouveau champ, nouvelle entité, nouveau bouton, correction de
service, changement de vue, config, test) doit passer par le contrôle
`checklists/implementation-review.md` + TDD (`checklists/tdd.md`) + KISS
(`checklists/kiss.md`) décrits dans `SKILL.md`.
