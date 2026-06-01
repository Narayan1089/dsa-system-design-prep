#!/usr/bin/env bash
# Compile and run a single .java file (class name is read from "class Xxx {")
set -euo pipefail

FILE="${1:?Usage: run-java.sh path/to/File.java}"
if [[ ! -f "$FILE" ]]; then
  echo "File not found: $FILE" >&2
  exit 1
fi

DIR="$(cd "$(dirname "$FILE")" && pwd)"
BASE="$(basename "$FILE")"
cd "$DIR"

CLASS="$(grep -E '^[[:space:]]*(public[[:space:]]+)?class[[:space:]]+' "$BASE" | head -1 | sed -E 's/.*class[[:space:]]+([A-Za-z_][A-Za-z0-9_]*).*/\1/')"
if [[ -z "$CLASS" ]]; then
  echo "Could not find class name in $BASE" >&2
  exit 1
fi

echo "→ javac $BASE  &&  java $CLASS"
javac "$BASE"
java "$CLASS"
