# ADK 10.0 — Architecture application & module (synthèse)

Source : `references/raw/adk-10.0.md` (sections `dev-guide/application/*`, `getting-started/*`, `tutorial/*`).

## Application vs module

- Une **application** = configuration d'un ensemble de **modules** (packages Gradle).
- Structure type :

```text
axelor-demo/
├── build.gradle / settings.gradle / gradle.properties
└── src/main/
    ├── java/...                 # code métier
    └── resources/
        ├── axelor-config.properties
        ├── META-INF/persistence.xml
        ├── domains/*.xml        # <domain-models>
        ├── views/*.xml          # <object-views>
        ├── actions, selections, menus (dans views/ en 8.x+)
        ├── data-init/           # import de données de démarrage
        ├── i18n/messages*.properties
        └── reports/ (BIRT .rptdesign)
```

- Un **module** = sous-projet Gradle (`apply plugin: 'com.axelor.app-module'`), typiquement
  dans `modules/`. Un module contient : Models (domaine), Views, Actions, Services,
  Controllers, Reports, Schedules (jobs), i18n, Security, change tracking (messaging).

## Build & run (Gradle)

- `./gradlew build` : compile, génère le code des entités, package le WAR + la
  distribution CLI (zip/tar dans `build/distributions/`).
- `./gradlew run` (ou `--no-daemon run`) : démarre le **serveur embarqué** (dev).
- `./gradlew generateCode` : régénère entités/repositories depuis `domains/*.xml`
  (obligatoire après toute modif de domaine). `./gradlew copyWebapp` après modif de
  `src/main/webapp`.
- Plugin `com.axelor.app` (app) / `com.axelor.app-module` (module). Bloc `axelor { title; description }`.
- Dev hot-reload XML (vues, domaines, i18n) : rechargés à chaud en mode dev ; les
  changements **Java** nécessitent un redémarrage. Limite : ne détecte les changements
  XML faits qu'après le démarrage.
- CLI : l'app peut tourner en ligne de commande (`axelor ...`, ex. `axelor search index`).

## Configuration (`axelor-config.properties`)

- Fichier principal + `persistence.xml` (JPA/Hibernate). `db.default.datasource` a
  priorité sur `non-jta-data-source` ; avec un DataSource, `db.default.ddl` est ignoré
  → utiliser `hibernate.hbm2ddl.auto` ; pool Hikari (`hibernate.hikari.*`).
- Clés usuelles : `db.default.url/user/password/driver`, `application.*`,
  `quartz.enable`, `reports.design-dir`, `mail.smtp.*`, `auth.*`, `features.studio`...
- En conteneur : variables d'environnement `AXELOR_CONFIG_<CLÉ>` (ex.
  `db.default.url` → `AXELOR_CONFIG_DB_DEFAULT_URL`).
- Logging : logback auto-configuré depuis `axelor-config.properties` ; `logback.xml`
  custom possible dans `src/main/resources` ou `logging.config=/path/logback.xml`.

## Prérequis (getting-started)

- **OpenJDK 21**, **PostgreSQL 12+** (pg_hba en md5/trust pour localhost), IDE au choix
  (Eclipse Buildship, IntelliJ, VSCode). Tomcat **10.1** pour le déploiement WAR
  (Jakarta EE 10 requis par AOP 8.x/10.x).

## Tutoriel rapide (7 étapes)

1. Créer le projet Gradle (structure ci-dessus, `build.gradle`, `settings.gradle`,
   wrapper). 2. Créer un module. 3. Définir les modèles (`domains/`).
4. Définir les vues (`views/`). 5. Définir actions & menus. 6. Configurer
   (`axelor-config.properties`, `persistence.xml`). 7. Démarrer (`./gradlew run`,
   login admin/admin en dev) — ou WAR sur Tomcat.

## Autres sujets application

- **Cache** : API `AxelorCache` (style Guava/Caffeine) + `CacheBuilder`, support cache
  distribué (Redisson...) via `application.cache.provider` ; config globale et par
  composant ; invalidation en multi-nœuds.
- **Multi-tenancy** : une instance sert plusieurs tenants (schémas/DB par tenant) ;
  header `X-Tenant-ID` à chaque requête (y compris au login). Limitation : la génération
  de schéma est désactivée en multi-tenancy.
- **Scripting security policy** : contrôle des classes Java accessibles depuis les
  scripts (Groovy, JS, EL, templates Groovy) — whitelist par annotation, règles
  allow/deny (deny non surchargeable), helper `__bean__`, timeouts d'exécution.
