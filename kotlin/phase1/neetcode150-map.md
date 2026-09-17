# NeetCode 150 → repo folders (official order)

> **Not the current list.** This order hits mediums immediately (#4 is Group
> Anagrams). Work [`easy-ramp.md`](easy-ramp.md) first, then resume here at
> **#5**. Keep this file as the long-term reference.

**Reference list.** Solve on [LeetCode](https://leetcode.com) in **Kotlin**.  
After each AC, save solution here + log in `PROBLEM_LOG.md`.

## File naming

```
kotlin/<topic>/<LeetCodeName>.kt
```

Example: `kotlin/hashing/ContainsDuplicate.kt`

```kotlin
// LC 217 — Pattern: HashSet
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean { ... }
}
```

---

## Week 5 — Arrays & Hashing (NeetCode #1–9)

| # | LC | Problem | Save to |
|---|-----|---------|---------|
| 1 | 217 | Contains Duplicate | `hashing/ContainsDuplicate.kt` |
| 2 | 242 | Valid Anagram | `hashing/ValidAnagram.kt` |
| 3 | 1 | Two Sum | `arrays/TwoSum.kt` |
| 4 | 49 | Group Anagrams | `hashing/GroupAnagrams.kt` |
| 5 | 347 | Top K Frequent Elements | `hashing/TopKFrequentElements.kt` |
| 6 | 271 | Encode and Decode Strings | `arrays/EncodeAndDecodeStrings.kt` |
| 7 | 238 | Product of Array Except Self | `arrays/ProductOfArrayExceptSelf.kt` |
| 8 | 36 | Valid Sudoku | `arrays/ValidSudoku.kt` |
| 9 | 128 | Longest Consecutive Sequence | `hashing/LongestConsecutiveSequence.kt` |

**Gate:** 7/9 solo before Week 6.

---

## Week 6 — Two Pointers + Sliding Window (#10–20)

| # | LC | Problem | Save to |
|---|-----|---------|---------|
| 10 | 125 | Valid Palindrome | `two-pointers/ValidPalindrome.kt` |
| 11 | 167 | Two Sum II | `two-pointers/TwoSumII.kt` |
| 12 | 15 | 3Sum | `two-pointers/ThreeSum.kt` |
| 13 | 11 | Container With Most Water | `two-pointers/ContainerWithMostWater.kt` |
| 14 | 42 | Trapping Rain Water | `two-pointers/TrappingRainWater.kt` |
| 15 | 121 | Best Time to Buy and Sell Stock | `arrays/BestTimeToBuyAndSellStock.kt` |
| 16 | 3 | Longest Substring Without Repeating Characters | `sliding-window/LongestSubstringWithoutRepeating.kt` |
| 17 | 424 | Longest Repeating Character Replacement | `sliding-window/LongestRepeatingCharacterReplacement.kt` |
| 18 | 567 | Permutation in String | `sliding-window/PermutationInString.kt` |
| 19 | 76 | Minimum Window Substring | `sliding-window/MinimumWindowSubstring.kt` |
| 20 | 239 | Sliding Window Maximum | `sliding-window/SlidingWindowMaximum.kt` |

**Gate:** Explain difference between two-pointer and sliding window in 30 sec.

---

## Week 7 — Stack, Binary Search, Linked List (#21–40)

| # | LC | Problem | Save to |
|---|-----|---------|---------|
| 21 | 20 | Valid Parentheses | `stack/ValidParentheses.kt` |
| 22 | 155 | Min Stack | `stack/MinStack.kt` |
| 23 | 150 | Evaluate Reverse Polish Notation | `stack/EvaluateReversePolishNotation.kt` |
| 24 | 22 | Generate Parentheses | `stack/GenerateParentheses.kt` |
| 25 | 739 | Daily Temperatures | `stack/DailyTemperatures.kt` |
| 26 | 853 | Car Fleet | `stack/CarFleet.kt` |
| 27 | 84 | Largest Rectangle in Histogram | `stack/LargestRectangleInHistogram.kt` |
| 28 | 704 | Binary Search | `binary-search/BinarySearch.kt` |
| 29 | 74 | Search a 2D Matrix | `binary-search/SearchA2DMatrix.kt` |
| 30 | 875 | Koko Eating Bananas | `binary-search/KokoEatingBananas.kt` |
| 31 | 153 | Find Minimum in Rotated Sorted Array | `binary-search/FindMinimumInRotatedSortedArray.kt` |
| 32 | 33 | Search in Rotated Sorted Array | `binary-search/SearchInRotatedSortedArray.kt` |
| 33 | 981 | Time Based Key-Value Store | `binary-search/TimeBasedKeyValueStore.kt` |
| 34 | 4 | Median of Two Sorted Arrays | `binary-search/MedianOfTwoSortedArrays.kt` |
| 35 | 206 | Reverse Linked List | `linked-list/ReverseLinkedList.kt` |
| 36 | 21 | Merge Two Sorted Lists | `linked-list/MergeTwoSortedLists.kt` |
| 37 | 143 | Reorder List | `linked-list/ReorderList.kt` |
| 38 | 19 | Remove Nth Node From End of List | `linked-list/RemoveNthNodeFromEnd.kt` |
| 39 | 138 | Copy List with Random Pointer | `linked-list/CopyListWithRandomPointer.kt` |
| 40 | 2 | Add Two Numbers | `linked-list/AddTwoNumbers.kt` |

---

## Week 8 — Linked List (finish) + Trees (#41–55)

| # | LC | Problem | Save to |
|---|-----|---------|---------|
| 41 | 141 | Linked List Cycle | `linked-list/LinkedListCycle.kt` |
| 42 | 287 | Find the Duplicate Number | `linked-list/FindTheDuplicateNumber.kt` |
| 43 | 146 | LRU Cache | `linked-list/LRUCache.kt` |
| 44 | 226 | Invert Binary Tree | `trees/InvertBinaryTree.kt` |
| 45 | 104 | Maximum Depth of Binary Tree | `trees/MaximumDepthOfBinaryTree.kt` |
| 46 | 543 | Diameter of Binary Tree | `trees/DiameterOfBinaryTree.kt` |
| 47 | 110 | Balanced Binary Tree | `trees/BalancedBinaryTree.kt` |
| 48 | 100 | Same Tree | `trees/SameTree.kt` |
| 49 | 572 | Subtree of Another Tree | `trees/SubtreeOfAnotherTree.kt` |
| 50 | 235 | Lowest Common Ancestor of a BST | `trees/LCAOfBST.kt` |
| 51 | 102 | Binary Tree Level Order Traversal | `trees/LevelOrderTraversal.kt` |
| 52 | 199 | Binary Tree Right Side View | `trees/RightSideView.kt` |
| 53 | 1448 | Count Good Nodes in Binary Tree | `trees/CountGoodNodes.kt` |
| 54 | 98 | Validate Binary Search Tree | `trees/ValidateBST.kt` |
| 55 | 230 | Kth Smallest Element in a BST | `trees/KthSmallestInBST.kt` |

---

## Week 9 — Trees (finish), Heap, Backtracking, Tries, Graphs start (#56–85)

| # | LC | Problem | Save to |
|---|-----|---------|---------|
| 56 | 105 | Construct Binary Tree from Preorder and Inorder | `trees/ConstructBinaryTree.kt` |
| 57 | 124 | Binary Tree Maximum Path Sum | `trees/BinaryTreeMaximumPathSum.kt` |
| 58 | 297 | Serialize and Deserialize Binary Tree | `trees/SerializeDeserializeBinaryTree.kt` |
| 59 | 1046 | Last Stone Weight | `heap/LastStoneWeight.kt` |
| 60 | 973 | K Closest Points to Origin | `heap/KClosestPointsToOrigin.kt` |
| 61 | 215 | Kth Largest Element in an Array | `heap/KthLargestElementInArray.kt` |
| 62 | 621 | Task Scheduler | `heap/TaskScheduler.kt` |
| 63 | 355 | Design Twitter | `heap/DesignTwitter.kt` |
| 64 | 78 | Subsets | `backtracking/Subsets.kt` |
| 65 | 39 | Combination Sum | `backtracking/CombinationSum.kt` |
| 66 | 46 | Permutations | `backtracking/Permutations.kt` |
| 67 | 90 | Subsets II | `backtracking/SubsetsII.kt` |
| 68 | 40 | Combination Sum II | `backtracking/CombinationSumII.kt` |
| 69 | 79 | Word Search | `backtracking/WordSearch.kt` |
| 70 | 131 | Palindrome Partitioning | `backtracking/PalindromePartitioning.kt` |
| 71 | 17 | Letter Combinations of a Phone Number | `backtracking/LetterCombinations.kt` |
| 72 | 51 | N-Queens | `backtracking/NQueens.kt` |
| 73 | 208 | Implement Trie | `tries/ImplementTrie.kt` |
| 74 | 211 | Design Add and Search Words | `tries/AddAndSearchWords.kt` |
| 75 | 212 | Word Search II | `tries/WordSearchII.kt` |
| 76 | 200 | Number of Islands | `graphs/NumberOfIslands.kt` |
| 77 | 133 | Clone Graph | `graphs/CloneGraph.kt` |
| 78 | 695 | Max Area of Island | `graphs/MaxAreaOfIsland.kt` |
| 79 | 417 | Pacific Atlantic Water Flow | `graphs/PacificAtlanticWaterFlow.kt` |
| 80 | 130 | Surrounded Regions | `graphs/SurroundedRegions.kt` |
| 81 | 994 | Rotting Oranges | `graphs/RottingOranges.kt` |
| 82 | 286 | Walls and Gates | `graphs/WallsAndGates.kt` |
| 83 | 207 | Course Schedule | `graphs/CourseSchedule.kt` |
| 84 | 210 | Course Schedule II | `graphs/CourseScheduleII.kt` |
| 85 | 684 | Redundant Connection | `graphs/RedundantConnection.kt` |

---

## Week 10 — Graphs (finish), Advanced Graphs, DP, Greedy, Intervals, Math, Bit (#86–150)

| # | LC | Problem | Save to |
|---|-----|---------|---------|
| 86 | 323 | Number of Connected Components | `graphs/NumberOfConnectedComponents.kt` |
| 87 | 261 | Graph Valid Tree | `graphs/GraphValidTree.kt` |
| 88 | 127 | Word Ladder | `graphs/WordLadder.kt` |
| 89 | 332 | Reconstruct Itinerary | `graphs-advanced/ReconstructItinerary.kt` |
| 90 | 1584 | Min Cost to Connect All Points | `graphs-advanced/MinCostToConnectAllPoints.kt` |
| 91 | 743 | Network Delay Time | `graphs-advanced/NetworkDelayTime.kt` |
| 92 | 778 | Swim in Rising Water | `graphs-advanced/SwimInRisingWater.kt` |
| 93 | 269 | Alien Dictionary | `graphs-advanced/AlienDictionary.kt` |
| 94 | 787 | Cheapest Flights Within K Stops | `graphs-advanced/CheapestFlightsWithinKStops.kt` |
| 95 | 70 | Climbing Stairs | `dp/ClimbingStairs.kt` |
| 96 | 746 | Min Cost Climbing Stairs | `dp/MinCostClimbingStairs.kt` |
| 97 | 198 | House Robber | `dp/HouseRobber.kt` |
| 98 | 213 | House Robber II | `dp/HouseRobberII.kt` |
| 99 | 5 | Longest Palindromic Substring | `dp/LongestPalindromicSubstring.kt` |
| 100 | 647 | Palindromic Substrings | `dp/PalindromicSubstrings.kt` |
| 101 | 91 | Decode Ways | `dp/DecodeWays.kt` |
| 102 | 322 | Coin Change | `dp/CoinChange.kt` |
| 103 | 152 | Maximum Product Subarray | `dp/MaximumProductSubarray.kt` |
| 104 | 139 | Word Break | `dp/WordBreak.kt` |
| 105 | 300 | Longest Increasing Subsequence | `dp/LongestIncreasingSubsequence.kt` |
| 106 | 416 | Partition Equal Subset Sum | `dp/PartitionEqualSubsetSum.kt` |
| 107 | 62 | Unique Paths | `dp/UniquePaths.kt` |
| 108 | 1143 | Longest Common Subsequence | `dp/LongestCommonSubsequence.kt` |
| 109 | 53 | Maximum Subarray | `arrays/MaximumSubarray.kt` |
| 110 | 55 | Jump Game | `greedy/JumpGame.kt` |
| 111 | 45 | Jump Game II | `greedy/JumpGameII.kt` |
| 112 | 134 | Gas Station | `greedy/GasStation.kt` |
| 113 | 846 | Hand of Straights | `greedy/HandOfStraights.kt` |
| 114 | 1899 | Merge Triplets to Form Target Triplet | `greedy/MergeTripletsToFormTarget.kt` |
| 115 | 763 | Partition Labels | `greedy/PartitionLabels.kt` |
| 116 | 678 | Valid Parenthesis String | `greedy/ValidParenthesisString.kt` |
| 117 | 57 | Insert Interval | `intervals/InsertInterval.kt` |
| 118 | 56 | Merge Intervals | `intervals/MergeIntervals.kt` |
| 119 | 435 | Non-overlapping Intervals | `intervals/NonOverlappingIntervals.kt` |
| 120 | 252 | Meeting Rooms | `intervals/MeetingRooms.kt` |
| 121 | 253 | Meeting Rooms II | `intervals/MeetingRoomsII.kt` |
| 122 | 1851 | Minimum Interval to Include Each Query | `intervals/MinimumIntervalToIncludeQuery.kt` |
| 123 | 48 | Rotate Image | `math-geometry/RotateImage.kt` |
| 124 | 54 | Spiral Matrix | `math-geometry/SpiralMatrix.kt` |
| 125 | 73 | Set Matrix Zeroes | `math-geometry/SetMatrixZeroes.kt` |
| 126 | 202 | Happy Number | `math-geometry/HappyNumber.kt` |
| 127 | 66 | Plus One | `math-geometry/PlusOne.kt` |
| 128 | 50 | Pow(x, n) | `math-geometry/PowXN.kt` |
| 129 | 43 | Multiply Strings | `math-geometry/MultiplyStrings.kt` |
| 130 | 2013 | Detect Squares | `math-geometry/DetectSquares.kt` |
| 131 | 136 | Single Number | `bit-manipulation/SingleNumber.kt` |
| 132 | 191 | Number of 1 Bits | `bit-manipulation/NumberOf1Bits.kt` |
| 133 | 338 | Counting Bits | `bit-manipulation/CountingBits.kt` |
| 134 | 190 | Reverse Bits | `bit-manipulation/ReverseBits.kt` |
| 135 | 268 | Missing Number | `bit-manipulation/MissingNumber.kt` |
| 136 | 371 | Sum of Two Integers | `bit-manipulation/SumOfTwoIntegers.kt` |
| 137 | 7 | Reverse Integer | `bit-manipulation/ReverseInteger.kt` |

> **Note:** NeetCode 150 count varies slightly by version (some lists include/exclude premium). Treat this as the **official NeetCode roadmap order**; if one problem is premium on LeetCode, skip and note in log, or use NeetCode video + implement locally.

---

## Folder tree (create file when you solve)

```
kotlin/
├── arrays/
├── hashing/
├── two-pointers/
├── sliding-window/
├── stack/
├── binary-search/      ← new
├── linked-list/
├── trees/
├── heap/               ← new
├── backtracking/       ← new
├── tries/              ← new
├── graphs/
├── graphs-advanced/    ← new
├── dp/
├── greedy/             ← new
├── intervals/          ← new
├── math-geometry/      ← new
└── bit-manipulation/   ← new
```

---

## Pace (realistic)

| Goal | Problems/week | Total in 6 weeks |
|------|---------------|----------------|
| **Recommended** | 15–18 | ~90–100 |
| Full NeetCode 150 | 25 | 150 (aggressive) |

Do **2–3/day** at recommended pace. Finish Week 5–6 before rushing to graphs.

---

## Daily workflow

1. Open this file → find next `#` not done  
2. Solve on LeetCode (Kotlin)  
3. Save to folder above  
4. Log row in `PROBLEM_LOG.md` with NeetCode `#` and LC `#`  
5. Mark revisit if shaky  

---

## Quick links

- [NeetCode 150 roadmap](https://neetcode.io/practice)  
- [NeetCode YouTube](https://www.youtube.com/@NeetCode) — watch only when stuck  
- Cheat sheet: `KOTLIN_DSA_CHEATSHEET.md`  
- Template: `templates/SolutionTemplate.kt`
