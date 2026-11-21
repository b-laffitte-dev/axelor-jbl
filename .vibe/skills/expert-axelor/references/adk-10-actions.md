# ADK 10.0 — Actions XML (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/actions/*`). En 8.x+, actions et vues dans `views/*.xml`, racine `<object-views>`.

## Concepts

- Les actions rendent les vues utiles au-delà du CRUD : valeurs par défaut, modifier
  valeurs/attributs de champs, appeler des contrôleurs, valider, ouvrir des vues.
- **Événements** (où accrocher une action) : `onNew`, `onLoad`, `onSave`, `onChange`
  (champ), `onClick` (bouton), `onSelect`... Une liste d'actions se sépare par des
  virgules : `onChange="save,mon-action,close"`. Actions spéciales de fin de chaîne :
  `new`, `close`, `validate`, `save`, `refresh`, `reload`.
- **Contexte** : l'action s'exécute contre le contexte courant (record, `_x` variables).
- **Expressions** : `eval: <groovy>`, `call: Classe.methode(args)`, `action: nom`,
  `select: <jpql>` / `select[]: <jpql>`, sinon valeur statique. Variables intégrées :
  `__date__`, `__user__`, `__company__`, `__repo__`, `id`, `version`, `_ref`...

## Types d'actions

| Action | Rôle | Exemple clé |
|---|---|---|
| `<action-group name>` | groupe d'actions `<action name if="expr"/>` | exécution conditionnelle en chaîne |
| `<action-record name model>` | construit/met à jour un record : `<field name expr if copy/>` | defaults à la création |
| `<action-attrs name>` | modifie les attributs de la vue : `<attribute for name expr if/>` (required, readonly, hidden, domain, title, value/value:set/value:add/value:del, collapse, precision, scale, css, icon, refresh, selection-in, focus, active, url, prompt, link) | rendre un champ readonly selon le statut |
| `<action-condition name>` | `<check field error if/>` — message sous le champ | cohérence de dates |
| `<action-validate name>` | `<error if message action title/>`, `<alert .../>` (demande confirmation), `<info/>`, `<notify/>` (popup 5 s) — `error` bloque la chaîne | validation avant sauvegarde |
| `<action-method name>` | `<call class="..." method="..."/>` — appelle un contrôleur Java (`@CallMethod` pour méthodes publiques) | boutons de la fiche OR |
| `<action-script name model>` | `<script language="js\|groovy" transactional="true">` — `$request`/`$response`, `__bean__(...)` | traitements complexes |
| `<action-view name model title>` | ouvre une vue (grille/form/...), définit les menus | voir `adk-10-views.md` |
| `<action-import name config>` / `<action-export name>` | import XML depuis flux (`<import file provider name/>`) / export via template (`<export name template engine="groovy\|ST"/>`) | ETL, SOAP |
| `<action-ws name service>` | appelle un web service SOAP (`<action name template engine/>`, timeouts) | provider d'`action-import` |

## Règles pratiques (projet JBL)

- Bouton de fiche = `action-method` vers le contrôleur, qui délègue au service.
- Transitions de statut : `action-record` (set `statusSelect`) + `action-validate`
  (garde-fous) + `action-attrs` (champs readonly selon statut).
- Toujours préférer `action-validate`/`action-attrs` à un script pour les contrôles
  et l'affichage.
- Les messages d'erreur utilisateur vont dans i18n (`messages_fr.properties`).
