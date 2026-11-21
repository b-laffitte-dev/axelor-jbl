# ADK — Versions, releases & migrations (synthèse)

Source : `references/raw/adk-10.0.md` (`releases.html`, `migrations/*`, `changelogs/changelog-10.0|8.x`).

## Release 10.0 (2026-10-23)

- Une seule édition (licence commerciale Axelor) : toutes les anciennes features
  Enterprise (assistants/agents IA, Studio, global search, collaboration temps réel,
  import/export, SSO avancé) sont dans la plateforme.
- Générateur de code : **merge** des attributs des champs d'entité au lieu de les
  remplacer. Collaboration de vues (voir qui consulte/édite). Tri client des grilles
  o2m/m2m. Pagination de grille customisable.

## Migration 8.2 → 10.0 (points majeurs)

- Upgrade dépendances (voir changelog). Nouveaux événements d'authentification tracés
  (user, provider, IP, date, 2FA, user-agent).
- (Le projet reste en **8.2.6** : ne pas appliquer ces migrations sans décision explicite.)

## Migration 8.1 → 8.2 (projet concerné : AOP 8.2.6)

- Champs chiffrés : dérivation de clé renforcée (PBKDF2), ciphertext auto-descriptif.
- Politique de mot de passe : min **8 caractères** (obligatoire), différent de
  l'ancien (obligatoire), ne doit pas contenir le login.

## Migration 8.0 → 8.1

- Audit tracking (logs d'audit, flush adaptatif `application.audit.logs.flush-threshold`),
  index `mail_message.received_on`, script de migration complet fourni.

## Migration 7.x → 8.0

- Jakarta EE 10 / Tomcat 10.1, Java 21 ; contraintes UNIQUE à ajouter proprement
  (pas de doublons existants) ; voir guide complet.

## Changelogs

- `changelog-10.0.html` : features/changes/fixes de chaque release 10.0.x (ex. : binding
  `ReportConfigurerImpl` pour les rapports custom).
- `changelog-8.2.html`, `changelog-8.1.html`, `changelog-8.0.html` : idem pour 8.x
  (upgrades de dépendances : Shiro, Swagger, Greenmail, Jackson...).
- Anciens changelogs 5.0→7.4 disponibles dans `references/raw/adk-10.0.md` (section
  `changelogs/`).

## Règle pour le projet

- Versions épinglées : plugin `com.axelor.app` **8.2.6**, axelor-base **9.2.1**
  (`gradle.properties`). Pas de wildcard `8.2.+` sur axelor-base. Toute montée de
  version AOP se fait via le guide de migration correspondant (8.2 → 10.0) et après
  revue d'impact (Jakarta, XSD, API supprimées).
