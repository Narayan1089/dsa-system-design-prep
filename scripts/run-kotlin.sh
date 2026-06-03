#!/usr/bin/env bash
# Run a Kotlin file (requires kotlin on PATH — brew install kotlin)
set -euo pipefail

FILE="${1:?Usage: run-kotlin.sh path/to/File.kt}"
if [[ ! -f "$FILE" ]]; then
  echo "File not found: $FILE" >&2
  exit 1
fi

if ! command -v kotlin >/dev/null 2>&1; then
  echo "kotlin not found. Install: brew install kotlin" >&2
  exit 1
fi

DIR="$(cd "$(dirname "$FILE")" && pwd)"
BASE="$(basename "$FILE")"
cd "$DIR"

if ! grep -qE 'fun main\s*\(' "$BASE"; then
  echo "No fun main() in $BASE — add a main or run a practice/walkthrough file." >&2
  exit 1
fi

echo "→ kotlin $BASE"
kotlin "$BASE"
