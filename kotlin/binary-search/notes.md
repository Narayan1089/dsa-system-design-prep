# Binary search

NeetCode 150 #28–34. See `phase1/neetcode150-map.md`.

```kotlin
var left = 0
var right = arr.lastIndex
while (left <= right) {
    val mid = left + (right - left) / 2
    // compare arr[mid], move left or right
}
```
