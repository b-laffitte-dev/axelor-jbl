# ADK 10.0 — Services, contrôleurs & modules (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/modules/*`).

## Services & contrôleurs (`modules/coding`)

- Le code métier s'écrit en Java (Groovy/Scala/Kotlin possibles ; Groovy built-in via
  `apply plugin: groovy`).
- **Service** = interface + `Impl` (`@Singleton`, `@Inject` des repositories/services).
- **Contrôleur** = classe `web/...Controller`, méthodes `public void x(ActionRequest req,
  ActionResponse res)` ; lit le contexte (`req.getContext().asType(X.class)`), appelle le
  service, remplit la réponse (`res.setValue(...)`, `res.setError(...)`, `res.notify(...)`,
  `res.setStatus(Response.STATUS_SUCCESS)`). Méthodes utilitaires annotées `@CallMethod`
  appelables depuis `action-method`.
- **Guice** : binding dans un module `XxxModule extends AxelorModule`
  (`bind(XxxService.class).to(XxxServiceImpl.class)`), chargé via
  `META-INF/services/com.axelor.app.AxelorModule` (ou `module` du app). Le projet :
  `com.axelor.apps.jbl.module.JblModule`.
- Transactions : `@Transactional` (com.google.inject.persist) sur les méthodes service
  qui écrivent.
- Exceptions : `AxelorMessageException` + `TraceBackRepository.CATEGORY_*` pour les
  messages utilisateur (8.x).

## Événements CDI (`modules/events`)

- Sous-ensemble CDI 2.0 : observateurs `@Observes` (+ `@Priority`, qualifiers `@Named`).
  Événements built-in : login, action, request, application. Événements custom :
  objet événement + source (fire) + observateur.

## Hibernate listeners (`modules/hibernate-listeners`)

- Listener custom (pre-insert/update/delete...) + configurator
  `HibernateListenerConfigurator` bindé dans le module Guice. **À utiliser avec
  parcimonie** (coût perf à chaque opération DB).

## Scheduler Quartz (`modules/scheduler`)

- Désactivé par défaut : `quartz.enable = true`, `quartz.thread-count = 3`.
- JobStore RAM par défaut ; JDBC JobStore (`quartz.job-store.class =
  org.quartz.impl.jdbcjobstore.JobStoreTX`, tables `qrtz_*` auto) pour persistance /
  multi-instance ; clustering si cache distribué (redisson).
- Jobs exécutés dans une session **admin**, peuvent être transactionnels.
- Config UI : Administration → Jobs → Schedules (`name`, classe `org.quartz.Job`,
  `cron`, `active`, paramètres clé/valeur). Batchs AOS déclenchés par des planificateurs.

## Sécurité (`modules/security`)

- Authentification/autorisation : **Apache Shiro** + **PAC4J** (form-based par défaut,
  LDAP, SAML, OAuth, OpenID Connect, CAS...).
- `User` : `code`, `name`, `password` (chiffré), `blocked`, `activateOn`, `expiresOn`,
  `groups`, `roles`, `permissions`. **admin + groupe `admins` = accès total.**
- Autorisation : deny-all par défaut, grant sélectif. 4 objets : `Permission` (règle
  unitaire : objet + canRead/canWrite/canCreate/canRemove/canExport + `condition` +
  `conditionParams`), `Role` (many permissions + menus), `Group` (roles/permissions,
  structure orga), `User`. Niveaux d'assignation : user → rôle; user → groupe → rôle...
- Permission package-level possible (`com.axelor.sale.db.*`). En 8.2 : mots de passe
  min 8 caractères, doit différer de l'ancien, ne pas contenir le login.

## i18n (`modules/i18n`)

- Catalogues `i18n/messages*.properties` par module. Traductions de valeurs de
  sélection via l'icône drapeau. Langues supportées configurables ; fallback de
  traduction. Ne jamais mettre de libellé en dur dans le XML.

## Messaging (`modules/messaging`)

- Change tracking (audit trail en stream de messages sur les changements de fiche),
  discussions document, discussions de groupe, intégration email (SMTP/IMAP :
  `mail.smtp.*`, `mail.imap.*`).

## Rapports (`modules/reports`)

- **BIRT** intégré : designs `.rptdesign` dans `reports/` du module (ou
  `reports.design-dir` externe). Data source, stockage fichiers, `action-report` pour
  lancer un rapport depuis une fiche (bouton Rapports). Config d'impression par société.

## Global search (`modules/global-search`)

- Recherche full-text système (Hibernate Search + Elasticsearch/OpenSearch) ;
  raccourci **Ctrl+/** ; filtres par type d'entité ; résultats avec surlignage.

## Scala (`modules/scala`)

- Module Scala possible (`apply plugin: 'scala'` + `com.axelor.app-module`) ; services
  en trait Scala, contrôleurs Scala, binding Guice Scala (`AxelorModule` Scala).
