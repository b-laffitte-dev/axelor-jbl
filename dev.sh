#!/usr/bin/env bash
# ---------------------------------------------------------------------------
# JBL Atelier - lancement en mode dev avec hot reload
#
# Usage :
#   ./dev.sh              # démarre DB + app en mode dev (hot reload)
#   ./dev.sh --no-db      # ne démarre pas la base (elle tourne déjà)
#   ./dev.sh --no-watch   # lance sans surveiller les sources Java
#   ./dev.sh --help       # affiche l'aide
#
# Prérequis :
#   - JDK 21 (détecté automatiquement : JAVA_HOME, /private/tmp/jbl-tools/jdk21,
#     /Library/Java/JavaVirtualMachines, sdkman, homebrew)
#   - Gradle 8.x (détecté automatiquement, sinon wrapper généré via gradle wrapper)
#   - Docker + Docker Compose (pour PostgreSQL)
# ---------------------------------------------------------------------------
set -euo pipefail

# --- Couleurs ---------------------------------------------------------------
RED='\033[0;31m'; GREEN='\033[0;32m'; YELLOW='\033[1;33m'
BLUE='\033[0;34m'; CYAN='\033[0;36m'; BOLD='\033[1m'; NC='\033[0m'

info()  { echo -e "${BLUE}[dev]${NC} $*"; }
ok()    { echo -e "${GREEN}[dev]${NC} $*"; }
warn()  { echo -e "${YELLOW}[dev]${NC} $*"; }
error() { echo -e "${RED}[dev]${NC} $*" >&2; }

# --- Répertoire du projet ---------------------------------------------------
PROJECT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$PROJECT_DIR"

APP_PORT="${APP_PORT:-8080}"
DB_PORT="${DB_PORT:-5432}"
START_DB=true
WATCH_JAVA=true

# --- Parse des arguments ----------------------------------------------------
for arg in "$@"; do
  case "$arg" in
    --no-db)    START_DB=false ;;
    --no-watch) WATCH_JAVA=false ;;
    --help|-h)
      sed -n '2,14p' "${BASH_SOURCE[0]}" | sed 's/^# \{0,1\}//'
      exit 0
      ;;
    *) error "Option inconnue : $arg (voir --help)"; exit 1 ;;
  esac
done

# --- 1. Trouver un JDK 21 ---------------------------------------------------
find_jdk21() {
  local candidates=(
    "${JAVA_HOME:-}"
    "/private/tmp/jbl-tools/jdk21/Contents/Home"
    "$HOME/.sdkman/candidates/java/current"
    "/opt/homebrew/opt/openjdk@21"
    "/usr/local/opt/openjdk@21"
  )
  # Bundles macOS .jdk
  for jdk in /Library/Java/JavaVirtualMachines/*.jdk/Contents/Home; do
    candidates+=("$jdk")
  done

  for dir in "${candidates[@]}"; do
    if [[ -n "$dir" && -x "$dir/bin/java" ]]; then
      local ver
      ver="$("$dir/bin/java" -version 2>&1 | head -1 | sed -E 's/.*version "([0-9]+).*/\1/')"
      if [[ "$ver" == "21" ]]; then
        echo "$dir"
        return 0
      fi
    fi
  done
  return 1
}

if JDK_HOME="$(find_jdk21)"; then
  export JAVA_HOME="$JDK_HOME"
  export PATH="$JAVA_HOME/bin:$PATH"
  ok "JDK 21 trouvé : $JAVA_HOME ($("$JAVA_HOME/bin/java" -version 2>&1 | head -1))"
else
  error "Aucun JDK 21 trouvé. Installe Temurin 21 (ex: brew install --cask temurin@21)"
  error "ou définis JAVA_HOME vers un JDK 21."
  exit 1
fi

# --- 2. Trouver Gradle (ou générer le wrapper) ------------------------------
find_gradle() {
  if [[ -x "$PROJECT_DIR/gradlew" ]]; then
    echo "$PROJECT_DIR/gradlew"
    return 0
  fi
  if command -v gradle &>/dev/null; then
    echo "gradle"
    return 0
  fi
  for g in /private/tmp/jbl-tools/gradle-*/bin/gradle "$HOME"/.sdkman/candidates/gradle/current/bin/gradle \
           /opt/homebrew/opt/gradle/bin/gradle /usr/local/opt/gradle/bin/gradle; do
    if [[ -x "$g" ]]; then echo "$g"; return 0; fi
  done
  return 1
}

if GRADLE_CMD="$(find_gradle)"; then
  ok "Gradle trouvé : $GRADLE_CMD"
else
  error "Gradle introuvable et pas de ./gradlew."
  error "Installe Gradle 8.x (brew install gradle) ou lance 'gradle wrapper' une fois."
  exit 1
fi

# Générer le wrapper si on n'a qu'un gradle système (pour les prochains lancements)
if [[ "$GRADLE_CMD" != "$PROJECT_DIR/gradlew" && ! -x "$PROJECT_DIR/gradlew" ]]; then
  info "Génération du wrapper Gradle (./gradlew)..."
  "$GRADLE_CMD" --no-daemon --console=plain wrapper --gradle-version 8.14.5 -q || \
    warn "Échec de la génération du wrapper (on continue avec $GRADLE_CMD)"
  if [[ -x "$PROJECT_DIR/gradlew" ]]; then
    GRADLE_CMD="$PROJECT_DIR/gradlew"
    ok "Wrapper généré : ./gradlew"
  fi
fi

# --- 3. Démarrer PostgreSQL via Docker Compose ------------------------------
# AOP lit les variables d'env au format AXELOR_CONFIG_<CLÉ> (points -> underscores, majuscules)
# pour surcharger axelor-config.properties : db.default.url -> AXELOR_CONFIG_DB_DEFAULT_URL
export AXELOR_CONFIG_DB_DEFAULT_URL="jdbc:postgresql://localhost:${DB_PORT}/axelor_jbl"

DB_STARTED=false
if [[ "$START_DB" == true ]]; then
  if ! command -v docker &>/dev/null; then
    warn "Docker non disponible — on suppose que PostgreSQL tourne déjà sur le port $DB_PORT."
  else
    # Détecter si le port hôte est déjà occupé (par ex. une autre stack docker)
    port_busy=false
    if command -v lsof &>/dev/null; then
      lsof -iTCP:"$DB_PORT" -sTCP:LISTEN -n -P &>/dev/null && port_busy=true
    elif command -v nc &>/dev/null; then
      nc -z localhost "$DB_PORT" 2>/dev/null && port_busy=true
    fi

    if [[ "$port_busy" == true ]]; then
      # Port hôte déjà pris : on démarre la DB sur un port alternatif (5433, 5434...)
      alt_port=5433
      while (command -v nc &>/dev/null && nc -z localhost "$alt_port" 2>/dev/null) || \
            (command -v lsof &>/dev/null && lsof -iTCP:"$alt_port" -sTCP:LISTEN -n -P &>/dev/null); do
        alt_port=$((alt_port + 1))
      done
      warn "Le port $DB_PORT est déjà occupé — la DB JBL démarre sur le port $alt_port."
      DB_PORT="$alt_port"
      export AXELOR_CONFIG_DB_DEFAULT_URL="jdbc:postgresql://localhost:${DB_PORT}/axelor_jbl"
      # Override temporaire du mapping de port via un fichier compose additionnel
      printf 'services:\n  db:\n    ports:\n      - "%s:5432"\n' "$DB_PORT" > .docker-compose.dev-port.yml
      docker compose -f docker-compose.yml -f .docker-compose.dev-port.yml up -d db
    else
      info "Démarrage de PostgreSQL sur le port $DB_PORT (docker compose up -d db)..."
      docker compose up -d db
    fi

    info "Attente que PostgreSQL soit prêt..."
    ready=false
    for i in $(seq 1 30); do
      if docker compose exec -T db pg_isready -U axelor -d axelor_jbl &>/dev/null; then
        ok "PostgreSQL prêt sur le port $DB_PORT."
        ready=true
        break
      fi
      sleep 1
    done
    [[ "$ready" == true ]] || warn "PostgreSQL pas encore prêt après 30 s — l'app va réessayer."
    DB_STARTED=true
  fi
fi

# --- 4. Nettoyage propre à la sortie ----------------------------------------
APP_PID=""
cleanup() {
  echo ""
  info "Arrêt en cours..."
  if [[ -n "$APP_PID" ]] && kill -0 "$APP_PID" 2>/dev/null; then
    info "Arrêt de l'application (PID $APP_PID)..."
    kill "$APP_PID" 2>/dev/null || true
    # Attendre l'arrêt gracieux, puis forcer si besoin
    for i in $(seq 1 10); do
      kill -0 "$APP_PID" 2>/dev/null || break
      sleep 1
    done
    kill -9 "$APP_PID" 2>/dev/null || true
  fi
  if [[ "$DB_STARTED" == true ]] && command -v docker &>/dev/null; then
    info "Arrêt de PostgreSQL (docker compose stop db)..."
    if [[ -f .docker-compose.dev-port.yml ]]; then
      docker compose -f docker-compose.yml -f .docker-compose.dev-port.yml stop db &>/dev/null || true
      rm -f .docker-compose.dev-port.yml
    else
      docker compose stop db &>/dev/null || true
    fi
  fi
  ok "Arrêté. À bientôt !"
}
trap cleanup EXIT INT TERM

# --- 5. Lancer l'application en mode dev ------------------------------------
run_app() {
  info "Lancement de JBL Atelier en mode dev (hot reload) sur http://localhost:$APP_PORT ..."
  info "Login par défaut : admin / admin"
  info "Hot reload actif : les vues XML, domaines et i18n sont rechargés sans redémarrage."
  if [[ "$WATCH_JAVA" == true ]]; then
    info "Surveillance des sources Java activée (recompilation + redémarrage auto)."
  fi
  echo ""
  "$GRADLE_CMD" --console=plain run &
  APP_PID=$!
}

# --- 6. Boucle de hot reload pour le code Java -------------------------------
# AOP recharge à chaud les ressources (vues/domaines/i18n) en mode dev.
# Pour le code Java, on surveille src/main/java et on relance gradle run.
watch_java() {
  local src_dir="$PROJECT_DIR/src/main/java"
  [[ -d "$src_dir" ]] || return 0

  # fswatch (macOS : brew install fswatch) ou fallback sur une boucle find/poll
  if command -v fswatch &>/dev/null; then
    fswatch -o -r -e "\.class$" "$src_dir" | while read -r _; do
      warn "Changement détecté dans src/main/java — recompilation + redémarrage..."
      if [[ -n "$APP_PID" ]] && kill -0 "$APP_PID" 2>/dev/null; then
        kill "$APP_PID" 2>/dev/null || true
        wait "$APP_PID" 2>/dev/null || true
      fi
      sleep 1
      run_app
      wait "$APP_PID" 2>/dev/null || true
    done
  else
    # Fallback portable : poll toutes les 2s sur la somme des mtimes
    warn "fswatch non installé (brew install fswatch) — surveillance Java par polling (toutes les 2s)."
    local last_sum=""
    while true; do
      local sum
      sum="$(find "$src_dir" -name '*.java' -exec stat -f '%m %p' {} \; 2>/dev/null | sort | md5 2>/dev/null || \
             find "$src_dir" -name '*.java' -exec stat -c '%Y %n' {} \; 2>/dev/null | sort | md5)"
      if [[ -n "$last_sum" && "$sum" != "$last_sum" ]]; then
        warn "Changement détecté dans src/main/java — recompilation + redémarrage..."
        if [[ -n "$APP_PID" ]] && kill -0 "$APP_PID" 2>/dev/null; then
          kill "$APP_PID" 2>/dev/null || true
          wait "$APP_PID" 2>/dev/null || true
        fi
        sleep 1
        run_app
        wait "$APP_PID" 2>/dev/null || true
      fi
      last_sum="$sum"
      sleep 2
    done
  fi
}

# --- 7. Go -------------------------------------------------------------------
run_app

if [[ "$WATCH_JAVA" == true ]]; then
  # Lance la surveillance en arrière-plan, attend l'app au premier plan
  watch_java &
  WATCH_PID=$!
  wait "$APP_PID" 2>/dev/null || true
  # Si l'app s'arrête (Ctrl+C géré par le trap), on quitte
  [[ -n "${WATCH_PID:-}" ]] && kill "$WATCH_PID" 2>/dev/null || true
else
  wait "$APP_PID" 2>/dev/null || true
fi
