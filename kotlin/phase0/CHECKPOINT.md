# Phase 0 checkpoint

## The test

Set a **10-minute timer**. From a **blank file** (or `Checkpoint.kt` with `PRACTICE_MODE = true`), implement:

1. `fun reverseString(s: String): String`
2. `fun findDuplicates(nums: List<Int>): List<Int>` — values that appear more than once (any order)
3. `fun secondLargest(nums: List<Int>): Int?` — null if fewer than 2 distinct values
4. `fun factorial(n: Int): Int` — recursive, `n >= 0`

**Rules:** No AI, no autocomplete, no opening `CheckpointSolutions.kt`.

Run practice: `./run week4/Checkpoint.kt` (with `PRACTICE_MODE = true`)  
Run answers (after trying): `./run week4/CheckpointSolutions.kt`

## Pass criteria

- All 4 compile and pass tests in `Checkpoint.kt`
- Finished in **≤ 10 minutes** (or ≤ 15 min on first honest attempt — repeat until ≤ 10)
- You can **explain** each solution in 2 sentences without reading code

## If you fail

| Gap | Repeat |
|-----|--------|
| Syntax (`fun`, `?`, loops) | Week 1 lessons |
| Classes / extensions | Week 2 |
| Manual loops over lists | Week 3 |
| Blank-file panic | Week 4 drills daily for another week |

## Then

Start **Phase 1** — NeetCode-style array/hashmap problems in `kotlin/arrays/`, `kotlin/hashing/`.
