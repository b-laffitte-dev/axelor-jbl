# ADK 10.0 — Web client, Studio & IA (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/web-client/*`, `dev-guide/studio/*`, `dev-guide/ai/*`).

## Web client

- Frontend officiel unique : **React + Bootstrap**. Le client est générique : le dev
  travaille surtout en XML (vues/actions) + Java serveur.
- **Widgets** (`web-client/widgets`) : chaque champ de domaine a un widget (String,
  Email, Phone, Date, DateTime, Boolean, Rating, NavSelect, MultiSelect, SuggestBox,
  Binary/Image, Json, CodeEditor...), surchargeable via l'attribut `widget="..."`.
- **View attributes** (`web-client/view-attributes`) : surcharge UI d'attributs de vue
  (Administration → View Management → View Attributes) évalués sur `onNew`/`onLoad`,
  avec condition JS et rôles.
- **View processors** : `ViewProcessor` (découverts auto au démarrage, exécutés après
  `MetaService.findView`) pour modifier la structure d'une vue en Java — à utiliser
  avec prudence.
- **Thèmes** : `MetaTheme` (JSON) administrables (Administration → Theme management) ou
  `MetaThemeService` custom.
- **Personnalisation avancée** : ressources web par module dans `src/main/webapp`
  (copiées via `./gradlew copyWebapp`, ordre de dépendance axelor-web → modules → app).
- Collaboration temps réel sur les vues (présence édition), quick menus (barre du
  haut), raccourcis clavier (Ctrl+S save, Ctrl+E edit, Ctrl+D duplicate, Ctrl+Delete,
  Alt+F recherche, Ctrl+/ global search...).

## Studio (low-code)

- Activé par `features.studio = true` ; menu Studio pour le groupe `admins`.
- **Projet** versionné en **révisions** ; une révision contient des **ressources**
  (custom model, vue, action, menu, sélection, query, workflow, dashboard) chacune
  éditable dans un **designer** visuel. Ce que Studio déploie = exactement les métadonnées
  qu'un module embarque.
- Cycle de vie : Draft → (activation → visible) → Lock → Publish ; **Build** (job)
  pour compiler ce qui ne peut pas être live (entités JPA, WAR) ; export/import,
  dépôts **git** et synchro continue (Build Jobs & Repositories).
- Modèles : custom model (JSON, rapide) vs entité JPA (build nécessaire) vs enum ;
  champs custom (`attrs.*`) sur modèles existants.
- Vues : mêmes types que le XML (form, grid, cards, kanban, calendar, tree, chart,
  custom, dashboard) ; designers dédiés. Actions : mêmes kinds que le chapitre Actions.
- Analytics : chart views classiques + **data dashboards** (custom views composés de
  data widgets `DataDashboard`/`DataDashlet`/`DataWidget`/`DataChart`/`DataTable` branchés
  sur des queries nommées) — préférer les data dashboards pour du nouveau.
- AI assistant dans Studio : décrit en chat, il crée les ressources et ouvre le designer.

## IA embarquée (10.0 — édition commerciale incluse dans la plateforme)

- Chat intégré à l'app ; l'assistant répond, lit/édite des enregistrements via des
  **tools**, RAG via **knowledge bases**, expertise à la demande via **skills**.
- Configuration = **données** seedées depuis `src/main/resources/ai/` (YAML) et éditables
  en UI : providers (`AiProvider` = connexion vendeur LLM, ex. `openai/...`), modèles
  (`AiModel`), agents (`AiAgent` : prompt système + modèle + tools/skills/knowledge/
  sub-agents + droits + réglages), **tools** (`AiTool` : schéma JSON d'entrée, approbation
  utilisateur requise ou non ; client-side : ask_to_input/open_view/refresh_view... ;
  server-side : update_record, search...), **procedures** (`AiProcedure` : exécute un
  formulaire headless — donc onChange/onSave/workflows s'appliquent), **knowledge
  bases** (embeddings, `search_knowledge`), **skills** (`AiSkill` : description toujours
  visible, instructions/références chargées à la demande via `use_skill`).
- **Agent Builder** : agent qui construit des agents (décrit en chat, sauve skill +
  procédures + tools).
- **Sécurité IA** : 3 contrôles à chaque lecture/écriture (permissions Shiro de
  l'utilisateur, bornes de l'agent, approbation humaine) ; policies d'usage
  (`AiUsagePolicy` : limites tokens par rôle/groupe/user) ; logs d'audit de chaque appel.
- Chat : streaming token par token, chaque tool call rendu en carte ; commandes
  slash ; compaction de conversation.
