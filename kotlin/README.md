# Kotlin track

## Start here (Phase 0 — Weeks 1–4)

**`phase0/`** — Kotlin syntax + logic without AI assist.

```bash
cd kotlin/phase0
./run week1/01_VariablesAndTypes.kt
```

Read: `phase0/README.md` and repo root `ROADMAP.md`.

---

## Before LeetCode

Read **`phase1/PRE_LEETCODE_CHECKLIST.md`** — do not skip.

## Phase 1 — DSA (after checkpoint)

**Start:** `phase1/neetcode150-map.md` — NeetCode 150 order → repo folders.

| Folder | NeetCode sections |
|--------|-------------------|
| `phase1/` | Map, log, cheat sheet |
| `arrays/`, `hashing/` | Week 5 |
| `two-pointers/`, `sliding-window/` | Week 6 |
| `stack/`, `binary-search/`, `linked-list/` | Week 7 |
| `trees/` | Week 8 |
| `heap/`, `backtracking/`, `tries/`, `graphs/` | Week 9 |
| `graphs-advanced/`, `dp/`, `greedy/`, `intervals/`, `math-geometry/`, `bit-manipulation/` | Week 10 |

```bash
./run practice/PracticeExercises.kt
```

## Run (needs Kotlin)

```bash
brew install kotlin
bash scripts/run-kotlin.sh kotlin/phase0/week1/01_VariablesAndTypes.kt
```

## Java vs Kotlin

| Java | Kotlin |
|------|--------|
| `int[]` | `IntArray` / `List<Int>` |
| `HashMap` | `hashMapOf()` / `mutableMapOf()` |
| `for (int i…)` | `for (i in list.indices)` |
| `null` checks | `?`, `?:`, `?.let` |
