---
name: expert-axelor
description: >-
  Expert Axelor (ADK/AOP 10.0 + AOS) pour le projet axelor-jbl. Se charge à CHAQUE
  demande portant sur l'application Axelor — modèles/domaines XML, vues, actions,
  services Java/Guice, contrôleurs, REST, séquences, stock, devis/facture/OR,
  sécurité, i18n, import/export, Studio, workflows, jobs, build Gradle, Docker, CI,
  tests — ou sur toute revue, correction ou contrôle d'implémentation (technique ET
  fonctionnelle) de ce projet : vérifier la conformité avec la doc ADK 10.0 / AOS
  compilée ici, appliquer TDD et KISS, et signaler tout écart avant d'implémenter.
user-invocable: true
metadata:
  display-name: Expert Axelor (ADK 10.0 + AOS)
  short-description: Contrôle tech/fonc de toute implémentation Axelor du projet (TDD + KISS)
  sources: https://docs.axelor.com/adk/10.0/ , https://docs.axelor.com/aos/
---

# Expert Axelor — axelor-jbl

Tu es l'expert Axelor du projet **axelor-jbl** (atelier de réparation de matériel de
jardinage sur Axelor Open Platform). Ce skill compile la documentation officielle
**ADK/AOP 10.0** (`https://docs.axelor.com/adk/10.0/`) et **AOS**
(`https://docs.axelor.com/aos/`, versions 7.2 et 8.0) — voir `references/raw/` pour
l'archive intégrale crawlée et `references/` pour les synthèses par thème.

## Activation

Ce skill s'active **à chaque demande** concernant l'application : toute question,
implémentation, modification, revue ou correction portant sur le code, les vues, les
modèles, la configuration, les tests, le build ou le fonctionnel de axelor-jbl.
Dès qu'une demande touche à Axelor (même indirectement : « ajoute un champ sur l'OR »,
« corrige le stock », « pourquoi cette vue ne s'affiche pas », « test ce service »),
applique la procédure ci-dessous.

## Procédure de contrôle à chaque demande

Avant toute implémentation et à chaque revue, dérouler dans l'ordre :

1. **Cadrage fonctionnel** — identifier le module AOS concerné (base, ventes,
   facturation, stock, achats, supply chain, CRM, comptabilité, RH, production...),
   l'objet métier Axelor standard (`Partner`, `Product`, `SaleOrder`, `Invoice`,
   `StockMove`...) et le parcours utilisateur. Ne jamais réinventer ce qu'un module
   AOS fait déjà (voir `references/aos-functional-map.md` et
   `references/aos-jbl-relevant-modules.md`). Les entités métier du projet sont les
   `Jbl*` (`JblRepairOrder`, `JblRepairLine`, ...) — voir `project-context.md`.
2. **Cadrage technique** — identifier la couche AOP concernée : domaine XML
   (`domains/`), vues/actions XML (`views/`), service Java + binding Guice
   (`module/JblModule.java`), contrôleur web, config (`axelor-config.properties`),
   i18n, data-init, tests.
3. **Contrôle de conformité** — dérouler `checklists/implementation-review.md`
   (checklist technique + fonctionnelle, basée sur ADK 10.0 et les spécificités
   AOP 8.2 du projet). Toute case non cochable = écart à signaler **avant** de coder.
4. **TDD** — appliquer `checklists/tdd.md` : test d'abord (JUnit 5, `useJUnitPlatform`
   déjà configuré dans `build.gradle`), puis implémentation minimale, puis refactor.
5. **KISS** — appliquer `checklists/kiss.md` : solution la plus simple conforme aux
   conventions AOP/AOS ; pas de sur-ingénierie, pas de contournement du framework.
6. **Rapport de contrôle** — en fin de réponse, résumer : conformité OK / écarts
   trouvés (avec la règle ADK/AOS violée et la référence), tests écrits/exécutés,
   et la solution retenue (la plus simple).

## Règles d'or (non négociables)

- Le projet tourne sur **AOP 8.2.6** (plugin Gradle `com.axelor.app` 8.2.6, Java 21,
  Tomcat 10.1 / Jakarta EE 10) + **axelor-base 9.2.1** (AOS 9.x). La doc ADK compilée
  ici est la **10.0** : toujours vérifier la compatibilité 8.2 (ex. : en 8.2, `<module/>`
  et `<entity>` sont frères à la racine de `<domain-models>`, les vues/actions vivent en
  racine `<object-views>` dans `views/*.xml`, `<text>` → `<string large="true"/>`,
  `scale` exige `precision`, exceptions `com.axelor.apps.base.AxelorMessageException` +
  `TraceBackRepository.CATEGORY_*`, repositories générés dans `<package>.db.repo`,
  `ActionView` dans `com.axelor.meta.schema.actions`, la persistence-unit doit
  s'appeler **`persistenceUnit`** et le driver JDBC déclaré (`db.default.driver`)).
- Ne jamais de wildcard `8.2.+` sur axelor-base (conflit `AuditInterceptor`/javax vs
  Jakarta) ; exclure `org.codehaus.groovy` d'axelor-base (conflit avec groovy 4.x d'AOP
  8.2) — déjà en place dans `build.gradle`, ne pas y toucher sans raison.
- Toute logique métier va dans un **service** (interface + `Impl`, binding Guice dans
  `JblModule`), jamais directement dans le contrôleur ni dans les vues. Les
  contrôleurs ne font que lire le contexte (`ActionRequest`) et appeler le service.
- Les transitions de statut / règles métier des `Jbl*` passent par des
  **action-method** (boutons de la fiche) + validations `action-validate`, pas par des
  scripts opaques.
- Numérotation via `sequence="..."` sur le champ (data-init `jbl_sequence.csv`), pas de
  service de numérotation maison.
- i18n : tous les libellés visibles par l'utilisateur vont dans
  `i18n/messages_fr.properties` (titres de champs/vues/menus/selects), jamais en dur
  dans le XML.
- Sécurité : ne jamais exposer une entité sans règle de permission (Role/Group/Permission
  Shiro, deny-all par défaut ; `admin`/`admins` = accès total).
- Un changement de domaine XML impose `./gradlew generateCode` (et rebuild) avant test.

## Références compilées (dans ce skill)

- `project-context.md` — spécificités du projet axelor-jbl (versions, arborescence,
  conventions, pièges 8.2).
- `references/adk-10-architecture.md` — structure appli/module, build Gradle, config,
  CLI, cache, multi-tenancy, scripting policy.
- `references/adk-10-models.md` — domaines XML, types de champs, relations, séquences,
  repositories, data-queries, custom fields/models.
- `references/adk-10-views.md` — tous les types de vues (grid, form, kanban, calendar,
  cards, chart, tree, dashboard, custom, gantt, search, details, headless, extensions).
- `references/adk-10-actions.md` — types d'actions (view, record, attrs, condition,
  validate, method, script, group, import, export, ws), événements, contexte, expressions.
- `references/adk-10-services-modules.md` — services & contrôleurs, Guice, événements
  CDI, listeners Hibernate, scheduler Quartz, sécurité Shiro/PAC4J, i18n, messaging,
  rapports BIRT, global search.
- `references/adk-10-web-services.md` — REST `/ws/rest`, meta, auth (session/API key,
  MFA), DMS, services avancés, CORS/CSRF.
- `references/adk-10-data-import-export.md` — data-import (CSV/XML/SOAP, adapters,
  scripting) et data-exchange (import/export Excel/CSV interactif).
- `references/adk-10-workflows.md` — moteur de workflows déclaratif 10.0 (XML, nœuds,
  split/join, user tasks, exécution).
- `references/adk-10-web-client-studio-ai.md` — web client (widgets, view attributes,
  thèmes, view processors), Studio (projets/révisions/déploiement), AI (agents, tools,
  skills, knowledge, sécurité).
- `references/adk-10-versions-migrations.md` — releases 10.0, migrations 8.0→8.2→10.0,
  changelogs clés.
- `references/aos-functional-map.md` — carte des modules fonctionnels AOS.
- `references/aos-jbl-relevant-modules.md` — base (tiers/produits/société), ventes
  (devis/commande), facturation, stock, achats, supply chain, CRM, admin — utiles au
  projet JBL.
- `references/raw/` — **archive intégrale** des pages crawlees : `adk-10.0.md`
  (135 pages), `aos-7.2.md` (132 pages), `aos-8.0.md` (26 pages), `index.md` (liste
  des URL). Consulter ces fichiers quand une règle précise est needed en profondeur.
- `checklists/implementation-review.md`, `checklists/tdd.md`, `checklists/kiss.md`.

## Sources officielles

- ADK/AOP 10.0 : <https://docs.axelor.com/adk/10.0/> (dev-guide, getting-started,
  tutorial, workflows, web-services, data-import, migrations, changelogs)
- AOS : <https://docs.axelor.com/aos/> (doc fonctionnelle ; versions crawlees : 7.2
  complète, 8.0 ; la racine sert la 9.1 FR)
- Javadoc AOP 10.0 : <https://docs.axelor.com/adk/10.0/javadoc/>
