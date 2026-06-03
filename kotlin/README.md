# DSA in Kotlin

Same topic layout as `dsa/` (Java), without the hello-world basics track.

## Topics

| Folder | Files |
|--------|--------|
| `arrays/` | Two Sum, Maximum Subarray |
| `hashing/` | Contains Duplicate |
| `collections/` | Maps, lists, sets (Kotlin stdlib) |
| `practice/` | Exercises + HashMap Two Sum walkthrough |
| `stack/`, `queue/`, … | Placeholders for future problems |

## Run (needs Kotlin installed)

```bash
brew install kotlin   # or SDKMAN / IntelliJ bundled JDK+Kotlin
```

From `kotlin/`:

```bash
./run practice/HashMapTwoSumWalkthrough.kt
./run practice/PracticeExercises.kt
```

From repo root:

```bash
bash scripts/run-kotlin.sh kotlin/practice/PracticeExercises.kt
```

Files with `fun main()` run directly. Solution-only files (e.g. `arrays/TwoSum.kt`) are for LeetCode-style copy or tests.

## Java vs Kotlin quick map

| Java | Kotlin |
|------|--------|
| `int[]` | `IntArray` |
| `new int[] { a, b }` | `intArrayOf(a, b)` |
| `HashMap<K,V>` | `hashMapOf()` / `HashMap()` |
| `for (int i = 0; …)` | `for (i in arr.indices)` |
| `map.get(k) != null` | `map[k]?.let { }` or `k in map` |
| `List<Integer>` | `mutableListOf<Int>()` |
