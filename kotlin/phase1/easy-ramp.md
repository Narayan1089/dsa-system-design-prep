# Easy ramp — the gentle road to medium

**Use this instead of `neetcode150-map.md` for now.** Come back to the NeetCode
map once you finish Ladder 1.

## Why this file exists

You got stuck on **Group Anagrams (LC 49)**. That is not a you-problem — 49 is a
**medium**, and the NeetCode map puts it at position **#4**. The map assumes you
already have reps. You don't yet. This file gives you those reps.

Rule change:

> **Never meet a new pattern for the first time inside a medium.**
> Do 3–5 easies on the pattern, then the medium is just bookkeeping.

---

## Stage 0 — custom drills (no LeetCode)

`Warmup.kt` in this folder. Pure Kotlin, tiny functions, instant feedback.

```bash
cd kotlin/phase1
./run Warmup.kt
```

Drills 3–7 build **Group Anagrams from scratch**, one line at a time. Do those
first — that's the exact thing that blocked you.

**Do not open LeetCode until `Warmup.kt` prints 15/15.**

---

## Ladder 1 — arrays, hashing, strings (3 weeks, all easy unless marked)

Order matters. Each block ends with the medium it unlocks.

### Block A — array warm-ups (get fast, build confidence)

| # | LC | Problem | Pattern | Save to |
|---|-----|---------|---------|---------|
| 1 | 1929 | Concatenation of Array | index math | `arrays/ConcatenationOfArray.kt` |
| 2 | 1480 | Running Sum of 1d Array | prefix sum | `arrays/RunningSum.kt` |
| 3 | 1470 | Shuffle the Array | index math | `arrays/ShuffleTheArray.kt` |
| 4 | 1512 | Number of Good Pairs | count pairs / freq | `hashing/NumberOfGoodPairs.kt` |
| 5 | 169 | Majority Element | freq map | `hashing/MajorityElement.kt` |

These should take **10 min each**. If one takes 40 min, that's your signal to
redo `Warmup.kt`, not to push on.

### Block B — hash map reps (the Group Anagrams prep)

| # | LC | Problem | Pattern | Save to |
|---|-----|---------|---------|---------|
| 6 | 383 | Ransom Note | freq map subtract | `hashing/RansomNote.kt` |
| 7 | 387 | First Unique Character | freq map, 2 passes | `hashing/FirstUniqueCharacter.kt` |
| 8 | 349 | Intersection of Two Arrays | HashSet | `hashing/IntersectionOfTwoArrays.kt` |
| 9 | 1207 | Unique Number of Occurrences | map → set of values | `hashing/UniqueNumberOfOccurrences.kt` |
| 10 | 219 | Contains Duplicate II | map value → index | `hashing/ContainsDuplicateII.kt` |
| 11 | 205 | Isomorphic Strings | two maps | `hashing/IsomorphicStrings.kt` |
| 12 | 290 | Word Pattern | two maps + split | `hashing/WordPattern.kt` |

> **Unlocks:** ⬆ **LC 49 Group Anagrams** (medium) — retry it after #12.
> You already have working code in `Practice.kt`; this time write it blank.

### Block C — counting → Top K

| # | LC | Problem | Pattern | Save to |
|---|-----|---------|---------|---------|
| 13 | 448 | Find All Numbers Disappeared | index-as-hash | `arrays/FindAllNumbersDisappeared.kt` |
| 14 | 136 | Single Number | XOR | `bit-manipulation/SingleNumber.kt` |
| 15 | 268 | Missing Number | sum or XOR | `bit-manipulation/MissingNumber.kt` |

> **Unlocks:** ⬆ **LC 347 Top K Frequent Elements** (medium) — bucket sort.

### Block D — strings

| # | LC | Problem | Pattern | Save to |
|---|-----|---------|---------|---------|
| 16 | 344 | Reverse String | two pointers | `two-pointers/ReverseString.kt` |
| 17 | 125 | Valid Palindrome | two pointers + filter | `two-pointers/ValidPalindrome.kt` |
| 18 | 58 | Length of Last Word | scan from end | `arrays/LengthOfLastWord.kt` |
| 19 | 14 | Longest Common Prefix | vertical scan | `arrays/LongestCommonPrefix.kt` |
| 20 | 28 | First Occurrence in String | substring match | `arrays/FindTheIndexOfFirstOccurrence.kt` |
| 21 | 392 | Is Subsequence | two pointers | `two-pointers/IsSubsequence.kt` |
| 22 | 13 | Roman to Integer | map + lookahead | `math-geometry/RomanToInteger.kt` |

### Block E — two pointers on arrays

| # | LC | Problem | Pattern | Save to |
|---|-----|---------|---------|---------|
| 23 | 26 | Remove Duplicates from Sorted Array | slow/fast pointer | `two-pointers/RemoveDuplicates.kt` |
| 24 | 27 | Remove Element | slow/fast pointer | `two-pointers/RemoveElement.kt` |
| 25 | 283 | Move Zeroes | slow/fast pointer | `two-pointers/MoveZeroes.kt` |
| 26 | 88 | Merge Sorted Array | two pointers from end | `two-pointers/MergeSortedArray.kt` |
| 27 | 977 | Squares of a Sorted Array | two pointers inward | `two-pointers/SquaresOfSortedArray.kt` |

> **Unlocks:** ⬆ **LC 167 Two Sum II**, then ⬆ **LC 15 3Sum** (both medium).

### Block F — stack + window

| # | LC | Problem | Pattern | Save to |
|---|-----|---------|---------|---------|
| 28 | 20 | Valid Parentheses | stack | `stack/ValidParentheses.kt` |
| 29 | 682 | Baseball Game | stack | `stack/BaseballGame.kt` |
| 30 | 1047 | Remove All Adjacent Duplicates | stack | `stack/RemoveAllAdjacentDuplicates.kt` |
| 31 | 121 | Best Time to Buy and Sell Stock | track min | `arrays/BestTimeToBuyAndSellStock.kt` |
| 32 | 643 | Maximum Average Subarray I | fixed window | `sliding-window/MaximumAverageSubarray.kt` |

> **Unlocks:** ⬆ **LC 53 Maximum Subarray**, ⬆ **LC 3 Longest Substring Without
> Repeating** (both medium).

### Block G — binary search (pure confidence block)

| # | LC | Problem | Pattern | Save to |
|---|-----|---------|---------|---------|
| 33 | 704 | Binary Search | lo/hi | `binary-search/BinarySearch.kt` |
| 34 | 35 | Search Insert Position | lo/hi | `binary-search/SearchInsertPosition.kt` |
| 35 | 374 | Guess Number Higher or Lower | lo/hi | `binary-search/GuessNumber.kt` |
| 36 | 278 | First Bad Version | leftmost-true | `binary-search/FirstBadVersion.kt` |

> **Unlocks:** ⬆ **LC 74 Search a 2D Matrix**, ⬆ **LC 875 Koko Eating Bananas**.

---

## The mediums Ladder 1 unlocks

Only touch these once the block above them is done. **Six mediums** — that is a
real Week-5–6 haul.

| LC | Problem | Comes after | Save to |
|-----|---------|-------------|---------|
| 49 | Group Anagrams | Block B | `hashing/GroupAnagrams.kt` |
| 347 | Top K Frequent Elements | Block C | `hashing/TopKFrequentElements.kt` |
| 167 | Two Sum II | Block E | `two-pointers/TwoSumII.kt` |
| 15 | 3Sum | 167 | `two-pointers/ThreeSum.kt` |
| 53 | Maximum Subarray | Block F | `arrays/MaximumSubarray.kt` |
| 3 | Longest Substring Without Repeating | Block F | `sliding-window/LongestSubstringWithoutRepeating.kt` |

Leave **238, 36, 128, 11, 424, 567** for Ladder 2. They are on the NeetCode map
and they will still be there.

---

## Daily mix (~1 hour, 6 days/week)

| Slot | Time | What |
|------|------|------|
| 1 | 5 min | Re-solve **one** easy you already did, from blank. Speed rep. |
| 2 | 20 min | **New easy** from the current block |
| 3 | 20 min | **New easy** from the current block |
| 4 | 10 min | Log both in `PROBLEM_LOG.md` |

On the day a block ends, swap slots 2+3 for **one medium, 40 min**.

That's ~2 easies/day → Ladder 1 done in about **3 weeks**, with 6 mediums solved
along the way.

---

## Stuck protocol (this is the part that matters)

Timer, every single problem:

| Elapsed | Do this |
|---------|---------|
| 0–5 min | Restate the problem. Write 1 example by hand. No code yet. |
| 5–10 min | Write the **brute force**, out loud, even if it's O(n²). Code it. |
| 10–20 min | Optimize. Ask: "what am I looking up repeatedly?" → that's your map. |
| 20 min | **Stop.** Read the hint only (LeetCode hints tab, not the solution). |
| +10 min | Retry with hint. |
| 30 min | Read the solution. **Close it.** Re-type from memory. Log as not-solo. |

A read-then-retyped solution is worth more than 45 min of staring. What is **not**
allowed is copy-paste.

### Redo rule

Anything you didn't solve solo goes back on the stack for **+3 days** and
**+10 days**. Mark `Revisit?` in the log. Two clean solos and it's yours.

---

## Why you got stuck on Group Anagrams (the actual gap)

Every easy you'd done returns a **boolean or a number**:

```kotlin
map[ch] = (map[ch] ?: 0) + 1     // Contains Duplicate, Valid Anagram
```

Group Anagrams is the first one where the map value is a **list**:

```kotlin
val groups = hashMapOf<String, MutableList<String>>()
groups.getOrPut(key) { mutableListOf() }.add(word)
return groups.values.toList()
```

Two new ideas at once — *derive a key from an item*, and *bucket items under that
key*. Block B splits them apart. Drills 3–7 in `Warmup.kt` build exactly this
shape before any LeetCode pressure.

---

## After Ladder 1

Go back to [`neetcode150-map.md`](neetcode150-map.md) at **#5 (Top K Frequent)**
and continue normally — you'll have ~36 easies and 6 mediums behind you, and the
map will read very differently.

Ladder 2 (sketch, build it when you get there): linked-list easies
(206, 21, 141, 876, 234) → mediums 143, 19, 2. Tree easies
(104, 226, 100, 101, 112, 543) → mediums 102, 199, 98.
