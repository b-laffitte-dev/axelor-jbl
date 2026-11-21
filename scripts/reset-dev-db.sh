#!/usr/bin/env bash
# ---------------------------------------------------------------------------
# Reset complet de la base de dev : conteneur neuf (volume supprimé) puis
# nettoyage des données/menus de démo (garde admin + Administration + JBL).
#
# Usage : ./scripts/reset-dev-db.sh [port]     (port hôte de la DB, défaut 5433)
# ---------------------------------------------------------------------------
set -euo pipefail
cd "$(dirname "$0")/.."

DB_HOST_PORT="${1:-5433}"
OVERRIDE=".docker-compose.dev-port.yml"

printf 'services:\n  db:\n    ports:\n      - "%s:5432"\n' "$DB_HOST_PORT" > "$OVERRIDE"
trap 'rm -f "$OVERRIDE"' EXIT

echo "[reset] arrêt et suppression du conteneur + volume DB..."
docker compose -f docker-compose.yml -f "$OVERRIDE" down -v

echo "[reset] recréation de la base axelor_jbl sur le port $DB_HOST_PORT..."
docker compose -f docker-compose.yml -f "$OVERRIDE" up -d db
for i in $(seq 1 30); do
  docker compose -f docker-compose.yml -f "$OVERRIDE" exec -T db pg_isready -U axelor -d axelor_jbl &>/dev/null && break
  sleep 1
done

echo "[reset] la base est vide — démarre l'app (./dev.sh) pour recréer le schéma,"
echo "[reset] puis lance le nettoyage des menus/démo :"
echo "         docker cp scripts/clean-demo-data.sql axelor-jbl-db-1:/tmp/ && \\"
echo "           docker exec axelor-jbl-db-1 psql -U axelor -d axelor_jbl -f /tmp/clean-demo-data.sql"
