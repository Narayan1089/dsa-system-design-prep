# Before LeetCode — do this first

Do **not** jump to LeetCode until every item below is checked.

---

## 1. Pass Phase 0 checkpoint (required)

```bash
cd kotlin/phase0
# Open Checkpoint.kt → set PRACTICE_MODE = true
./run week4/Checkpoint.kt
```

| Task | Done? |
|------|-------|
| All 4 functions pass (`reverse`, `findDuplicates`, `secondLargest`, `factorial`) | ☐ |
| Finished in ≤ 10 min (or ≤ 15 min, then retry until ≤ 10) | ☐ |
| Can explain each solution out loud without reading code | ☐ |

**Not passing?** Repeat Week 3–4 drills. Do not start LeetCode on a shaky base.

---

## 2. Quick syntax refresh (30 min, same day)

Run once — no notes, just confirm you remember:

```bash
./run week3/02_FrequencyAndDedup.kt
./run collections/MapsAndLists.kt
./run practice/HashMapTwoSumWalkthrough.kt
```

You should recognize:
- `for (i in arr.indices)`
- `mutableMapOf`, `hashSetOf`, `map[key] = (map[key] ?: 0) + 1`
- `?.let`, `?:`, `IntArray` vs `List<Int>`

---

## 3. Set up how you will practice (15 min)

| Decision | Your choice |
|----------|-------------|
| Platform | LeetCode (recommended) |
| Language | **Kotlin** on LeetCode |
| AI autocomplete | **Off** while solving (turn on only for review after) |
| Time per easy | 20–25 min max, then read solution |
| Log every problem | `phase1/PROBLEM_LOG.md` |

---

## 4. Learn the problem-solving ritual (use on every question)

1. **Understand** — restate in your own words, 1 example, edge cases  
2. **Brute force** — say time/space out loud  
3. **Optimize** — which pattern? (hash map, two pointer, etc.)  
4. **Code** — no autocomplete  
5. **Test** — empty input, one element, duplicates  
6. **Log** — pattern, time, what you missed  

---

## 5. Phase 1 Week 5–6 scope only (don't jump ahead)

Start with **arrays + hashmap** only. See `week5-6-problem-list.md`.

Target: **2–3 problems/day**, not 10. Quality > volume.

---

## 6. What you do NOT need before LeetCode

- Trees, graphs, DP (Week 7+)
- Jetpack Compose
- Backend / Spring
- System design deep dives

**One track. Arrays/hash first.**

---

## Ready?

When checkpoint passes + syntax refresh done → open `phase1/README.md` and start problem #1.
