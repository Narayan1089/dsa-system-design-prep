#!/usr/bin/env bash
# Compile and run a Kotlin file (requires kotlinc + kotlin on PATH — brew install kotlin)
set -euo pipefail

FILE="${1:?Usage: run-kotlin.sh path/to/File.kt}"
if [[ ! -f "$FILE" ]]; then
  echo "File not found: $FILE" >&2
  exit 1
fi

if ! command -v kotlinc >/dev/null 2>&1; then
  echo "kotlinc not found. Install: brew install kotlin" >&2
  exit 1
fi

DIR="$(cd "$(dirname "$FILE")" && pwd)"
BASE="$(basename "$FILE")"
STEM="${BASE%.kt}"
cd "$DIR"

if ! grep -qE 'fun main\s*\(' "$BASE"; then
  echo "No fun main() in $BASE — add a main or run phase1/Practice.kt." >&2
  exit 1
fi

# File.kt → FileKt; week3-drills.kt → Week3_drillsKt; 01_Foo.kt → _01_FooKt
FACADE="${STEM//-/_}"
if [[ "$FACADE" =~ ^[0-9] ]]; then
  FACADE="_${FACADE}Kt"
else
  FIRST="$(printf '%s' "${FACADE:0:1}" | tr '[:lower:]' '[:upper:]')"
  FACADE="${FIRST}${FACADE:1}Kt"
fi

JAR="$(mktemp /tmp/${STEM}.XXXXXX.jar)"
trap 'rm -f "$JAR"' EXIT

echo "→ kotlinc $BASE"
kotlinc "$BASE" -include-runtime -d "$JAR"
kotlin -classpath "$JAR" "$FACADE"
