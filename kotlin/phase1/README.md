# Phase 1 — DSA (Weeks 5–10)

**Prerequisite:** Phase 0 checkpoint passed (`phase0/week4/Checkpoint.kt`).

> ## ⚠ Start here instead: [`easy-ramp.md`](easy-ramp.md)
>
> The NeetCode map throws you at a **medium (Group Anagrams) by problem #4**.
> That's why it felt brutal. `easy-ramp.md` is the same destination with ~36
> easies first, and each medium sitting right after the easies that teach it.
>
> ```bash
> cd kotlin/phase1
> ./run Warmup.kt      # 15 custom drills — do these before LeetCode
> ```
>
> Come back to `neetcode150-map.md` after Ladder 1.

## Weekly focus

| Weeks | Topics | Folder |
|-------|--------|--------|
| 5–6 | Arrays, strings, hashmap, two-pointer, sliding window | `../arrays/`, `../hashing/`, `../two-pointers/`, `../sliding-window/` |
| 7–8 | Trees, graphs (BFS/DFS) | `../trees/`, `../graphs/` |
| 9 | 1D DP basics | `../dp/` |
| 10 | Mixed review + timed mocks | `PROBLEM_LOG.md` |

## Daily routine (~1–1.5 hr)

1. **5 min** — re-read yesterday's pattern in your log  
2. **25–35 min** — new problem (no AI)  
3. **10 min** — test edge cases, fix bugs  
4. **10 min** — log in `PROBLEM_LOG.md`  
5. **Optional** — if stuck after 25 min, read hint → retry 10 min → then read solution  

## How to solve on LeetCode (Kotlin)

1. Create `Solution` class (LeetCode gives template)  
2. Start with brute force if unsure  
3. Copy working solution to this repo under the right topic folder  
4. Add a one-line comment: `// Pattern: hashmap — value → index`  

## Local practice

One file: `Practice.kt`. Implement the next method, then `./run`.

After it passes, paste that function into `kotlin/<topic>/` (code only, no `main`). Do not add a new folder per problem.

## Problem order

**Primary:** [`neetcode150-map.md`](neetcode150-map.md) — all 150 in order → repo folders by week.  
**First 20 only:** [`week5-6-problem-list.md`](week5-6-problem-list.md) — warm-up if Week 5 feels heavy.

## Rules (same as Phase 0)

- Explain approach **out loud** before coding  
- No AI during solve  
- Log every problem — patterns matter more than count  
- Target ~150–200 total over 6 weeks, not 500 random  

## After each problem

Update `PROBLEM_LOG.md`:

```markdown
| Date | Problem | Pattern | Time | Solved alone? | Notes |
```

## Stuck?

| Symptom | Action |
|---------|--------|
| Forgot syntax | `phase0/week3/` + `collections/MapsAndLists.kt` |
| Know pattern, can't code | Re-do `practice/PracticeExercises.kt` |
| Always need solution | Repeat Week 5 easy list only until 5 solos in a row |
