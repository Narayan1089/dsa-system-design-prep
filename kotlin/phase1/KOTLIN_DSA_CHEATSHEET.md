# Kotlin DSA — syntax cheat sheet (Phase 1)

Keep open while solving. Full Phase 0 lessons in `phase0/`.

## Arrays

```kotlin
val a = intArrayOf(1, 2, 3)
a[i]
a.size
a.indices
a.lastIndex

for (i in a.indices) { }
for (x in a) { }
```

## List (mutable)

```kotlin
val list = mutableListOf(1, 2, 3)
list.add(4)
list[i]
list.size
```

## HashMap

```kotlin
val map = hashMapOf<Int, Int>()
map[key] = value
map[key]              // Int? — null if missing
map.getOrDefault(k, 0)
key in map

// frequency
map[x] = (map[x] ?: 0) + 1
```

## HashSet

```kotlin
val set = hashSetOf<Int>()
set.add(x)
x in set
set.size
```

## Two pointers

```kotlin
var left = 0
var right = arr.lastIndex
while (left < right) {
    // move left++ or right-- based on condition
}
```

## Sliding window

```kotlin
var left = 0
for (right in arr.indices) {
    // expand: add arr[right]
    while (windowInvalid) {
        // shrink: remove arr[left]
        left++
    }
    // update answer
}
```

## Common LeetCode signatures

```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray
    fun containsDuplicate(nums: IntArray): Boolean
    fun maxSubArray(nums: IntArray): Int
    fun lengthOfLongestSubstring(s: String): Int
}
```

## Null / optional

```kotlin
map[key]?.let { index -> ... }
return null  // for Int? return type
```

## Explain out loud template

"I'll use a **HashMap** to store **X → Y** so lookup is O(1). One pass O(n), space O(n)."
