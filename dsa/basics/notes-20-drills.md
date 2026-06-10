# Drills file 20 — how to practice

## File

`20_LoopsArraysCollectionsDrills.java` — one runnable file.

## Step 1 — Study mode (default)

```bash
cd dsa/basics
./run 20_LoopsArraysCollectionsDrills.java
```

Read each **Q1–Q16**: question, input, answer.  
Open the file and read matching `solution_*` method.

## Step 2 — Practice mode

1. Set `PRACTICE_MODE = true` at top of file.
2. Copy logic from `solution_*` into `practice_*` **without looking** — or rewrite from scratch.
3. Run again → `PASS` / `FAIL` for each exercise.

## Exercise list

| # | Topic | Skill |
|---|--------|--------|
| 1–4 | Array + loop | sum, max, count, linear search |
| 5–6 | Two pointers / indices | reverse copy, reverse in place |
| 7–8 | Medium loops | second largest, move zeroes |
| 9 | Nested loops | two sum brute |
| 10–13 | HashMap | frequency, most frequent, two sum, scan |
| 14–16 | HashSet | unique count, duplicate, common element |

## When you're comfortable

- `09_PracticeExercises.java` (fewer, mixed)
- `dsa/arrays/TwoSum.java`, `hashing/ContainsDuplicate.java`
- Then **12_Stack.java**

## Thinking tips

- Say out loud: **“What am I storing?”** (index, count, seen value)
- Draw a tiny array on paper for loops `i` / `j`
- Brute force first, then HashMap if you need O(n)
