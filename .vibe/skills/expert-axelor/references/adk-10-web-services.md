# ADK 10.0 — Web services (synthèse)

Source : `references/raw/adk-10.0.md` (`dev-guide/web-services/*`).

## Principes

- Endpoints JSON sous **`/ws/`** (ex. `http://localhost:8080/<app>/ws/`).
- Requête :

```json
{ "model": "", "offset": 0, "limit": 40, "sortBy": [], "data": {}, "records": [], "fields": [] }
```

- Réponse : `{ "status": 0, "offset": 0, "total": N, "data": [...] }` (`status != 0` =
  erreur). Le champ `version` sert au contrôle d'optimisme (modifications non
  conflictuelles).
- CSRF : header `X-CSRF-Token` (cookie `CSRF-TOKEN`) pour les POST ; CORS configurable.

## REST (`/ws/rest/:model`)

- `GET /ws/rest/:model?offset&limit&sortBy&fields` — liste (search).
- `GET /ws/rest/:model/:id` — read.
- `POST /ws/rest/:model` (body `data`) — create.
- `PUT /ws/rest/:model/:id` (body `data` + `version`) — update.
- `DELETE /ws/rest/:model/:id` — delete → `{ "status":0, "data":[id] }`.
- `POST /ws/rest/:model/search` — recherche avancée (filtres JSON).

## Meta (`/ws/meta`)

- `GET /ws/meta/models` — liste des modèles.
- `GET /ws/meta/fields/:model` — propriétés des champs d'un modèle.

## Auth (`/ws` + `/callback`)

- 2 méthodes : **session** (cookie) ou **API key**.
- Login : `POST /callback` body `{ "username": "...", "password": "..." }`.
- MFA (TOTP / email / recovery) configurable ; événements d'authentification tracés
  (user, provider, IP, date, 2FA, user-agent).
- SSO : SAML / OAuth / OIDC / CAS via PAC4J (config `auth.provider.*`).

## Avancés (`/ws/rest/...`)

- `POST /ws/rest/:model/:id/fetch` — read partiel (fields demandés).
- `POST /ws/rest/:model/:id/remove` — delete avancé ; `POST /ws/rest/:model/search` —
  search avancé.
- **Action service** : `POST /ws/action` body `{ "action": "mon-action,com.axelor...Controller:maMethode", "data": { "context": {...} } }`
  → exécute des actions XML ou des méthodes contrôleur côté serveur, retourne
  `{ "status":0, "data":[...] }`.

## DMS (`/ws/dms`)

- `GET /ws/dms/files?parent=&pattern=` — lister ; téléchargement ; `POST` upload ;
  lister/ajouter/supprimer des pièces jointes (`MetaFile`/`DMSFile`).
