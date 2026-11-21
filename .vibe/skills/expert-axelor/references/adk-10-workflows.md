# ADK 10.0 — Workflows déclaratifs (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/workflows/*`). Moteur léger déclaratif,
successeur du module BPM Camunda. Identique XML et Studio designer (même format, même
validation).

## Principes

- Un workflow est lié à **un modèle**, démarre d'un **trigger** (`when`), parcourt un
  graphe de nœuds jusqu'à un `<end>`. Automatisation ("quand X arrive, faire Y") et
  approbations humaines. Conditions et scripts en **JavaScript** (sandboxé pour les
  conditions de trigger : accès champs en mémoire uniquement).
- Définitions XML dans `src/main/resources/workflows/` (`<workflow>`), validées XSD,
  chargées en `MetaWorkflow` (comme vues/actions). Studio designer = même format.
- Coût quasi nul sur la save si pas de workflow actif (set lookup) ; snapshots
  avant/après écrits en `MetaWorkflowCapture` dans la même transaction.

## Nœuds (`workflows/nodes`)

- Communs : `id` (obligatoire), `next` (arête), `name`, `title`...
- Types : `start`, `end` (`terminate="true"` pour terminer les autres chemins),
  `script` (JS, `async` défaut true sur actions), `call` (appelle un autre workflow),
  `subflow`, `task` (approval humain), `wait`, `split`/`join`, `agent` (IA),
  `email` (template, `async`), `signal`...
- `split` : choix (une branche), fan-out, race, quorum, rejet ; `join` : ferme les
  branches (wait, quorum...), s'exécute une fois.

## User tasks & approbations (`workflows/user-tasks`)

- Le nœud `task` parque le workflow jusqu'à décision : **Approvals → My Approvals**
  (assignées/réclamées/pool rôle ou groupe ; admin voit Pending Approvals).
- `outcome` : `complete` / `reject` / `condition` ; champs `completed`, `rejected`,
  `timedOut`, `comment`, `visit`, `completedBy`. Sécurité : la tâche référence le
  modèle/enregistrement concerné.

## Exécution (`workflows/execution`)

- À la save : détection des changements, snapshots, écriture capture avant commit.
- États d'un run : `running`, `waiting` (parké sur task/wait/call/subflow), `done`,
  `terminated`, `failed`. Scheduler configurable pour réveiller les runs parkés.

## Migration depuis BPM (`migrating-from-bpm`)

- Mapping mécanique nœud par nœud depuis Camunda (ex. exclusive gateway → `<split mode=...>`),
  sans prétendre compatibilité BPMN.

## Application au projet JBL

- Le workflow Devis → OR → Facture de JBL est aujourd'hui porté par des statuts
  (`statusSelect`) + boutons (`action-method`). Si on formalise un workflow déclaratif :
  modèle `JblRepairOrder`, trigger sur changement de `statusSelect`, nœuds `task`
  (validation devis, démarrage réparation) et `script` (génération facture, conso
  stock). Garder KISS : ne pas introduire de workflow tant que les statuts + actions
  couvrent le besoin.
