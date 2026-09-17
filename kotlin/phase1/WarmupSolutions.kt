/**
 * Answers for Warmup.kt — read only after a real 15-minute attempt.
 *
 * Read it, close it, retype from memory in Warmup.kt. Do not copy-paste.
 *
 * Run: cd kotlin/phase1 && ./run WarmupSolutions.kt
 */

fun main() {
    println("countChars       = ${countChars("hello")}")
    println("firstUnique      = ${firstUnique("loveleetcode")}")
    println("groupByLength    = ${groupByLength(listOf("eat", "tea", "at", "bat"))}")
    println("groupByFirstChar = ${groupByFirstChar(listOf("eat", "tea", "tan", "ear"))}")
    println("sortedKey        = ${sortedKey("tea")}")
    println("countKey         = ${countKey("tea")}")
    println("groupBySortedKey = ${groupBySortedKey(listOf("eat", "tea", "tan", "ate", "nat", "bat"))}")
    println("bucketsByCount   = ${bucketsByCount(mapOf(1 to 3, 2 to 2, 3 to 1), 3)}")
    println("topKFrequent     = ${topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2)}")
    println("reverseInPlace   = ${reverseInPlace(intArrayOf(1, 2, 3, 4)).toList()}")
    println("removeDuplicates = ${removeDuplicatesSorted(intArrayOf(1, 1, 2, 2, 3))}")
    println("hasPairSum       = ${hasPairSum(intArrayOf(2, 7, 11, 15), 9)}")
    println("maxWindowSum     = ${maxWindowSum(intArrayOf(1, 12, -5, -6, 50), 2)}")
    println("runLengthEncode  = ${runLengthEncode("aaabbc")}")
    println("binarySearch     = ${binarySearch(intArrayOf(1, 3, 5, 7, 9), 7)}")
}

fun countChars(s: String): Map<Char, Int> {
    val freq = mutableMapOf<Char, Int>()
    for (ch in s) freq[ch] = (freq[ch] ?: 0) + 1
    return freq
}

fun firstUnique(s: String): Char? {
    val freq = countChars(s)
    for (ch in s) if (freq[ch] == 1) return ch
    return null
}

fun groupByLength(words: List<String>): Map<Int, List<String>> {
    val groups = mutableMapOf<Int, MutableList<String>>()
    for (word in words) groups.getOrPut(word.length) { mutableListOf() }.add(word)
    return groups
}

fun groupByFirstChar(words: List<String>): Map<Char, List<String>> {
    val groups = mutableMapOf<Char, MutableList<String>>()
    for (word in words) groups.getOrPut(word[0]) { mutableListOf() }.add(word)
    return groups
}

fun sortedKey(word: String): String = word.toCharArray().sortedArray().concatToString()

fun countKey(word: String): String {
    val counts = IntArray(26)
    for (ch in word) counts[ch - 'a']++
    val sb = StringBuilder()
    for (i in counts.indices) {
        if (counts[i] > 0) sb.append('a' + i).append(counts[i])
    }
    return sb.toString()
}

fun groupBySortedKey(words: List<String>): List<List<String>> {
    val groups = mutableMapOf<String, MutableList<String>>()
    for (word in words) groups.getOrPut(sortedKey(word)) { mutableListOf() }.add(word)
    return groups.values.toList()
}

fun bucketsByCount(freq: Map<Int, Int>, maxCount: Int): List<List<Int>> {
    val buckets = List(maxCount + 1) { mutableListOf<Int>() }
    for ((num, count) in freq) buckets[count].add(num)
    return buckets
}

fun topKFrequent(nums: IntArray, k: Int): List<Int> {
    val freq = mutableMapOf<Int, Int>()
    for (n in nums) freq[n] = (freq[n] ?: 0) + 1
    val buckets = bucketsByCount(freq, nums.size)
    val result = mutableListOf<Int>()
    for (count in buckets.lastIndex downTo 1) {
        for (num in buckets[count]) {
            result.add(num)
            if (result.size == k) return result
        }
    }
    return result
}

fun reverseInPlace(arr: IntArray): IntArray {
    var left = 0
    var right = arr.lastIndex
    while (left < right) {
        val tmp = arr[left]
        arr[left] = arr[right]
        arr[right] = tmp
        left++
        right--
    }
    return arr
}

fun removeDuplicatesSorted(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var slow = 0
    for (fast in 1 until nums.size) {
        if (nums[fast] != nums[slow]) {
            slow++
            nums[slow] = nums[fast]
        }
    }
    return slow + 1
}

fun hasPairSum(sorted: IntArray, target: Int): Boolean {
    var left = 0
    var right = sorted.lastIndex
    while (left < right) {
        val sum = sorted[left] + sorted[right]
        when {
            sum == target -> return true
            sum < target -> left++
            else -> right--
        }
    }
    return false
}

fun maxWindowSum(nums: IntArray, k: Int): Int {
    if (nums.size < k) return 0
    var windowSum = 0
    for (i in 0 until k) windowSum += nums[i]
    var best = windowSum
    for (i in k until nums.size) {
        windowSum += nums[i] - nums[i - k]
        if (windowSum > best) best = windowSum
    }
    return best
}

fun runLengthEncode(s: String): String {
    if (s.isEmpty()) return ""
    val sb = StringBuilder()
    var count = 1
    for (i in 1..s.length) {
        if (i < s.length && s[i] == s[i - 1]) {
            count++
        } else {
            sb.append(s[i - 1]).append(count)
            count = 1
        }
    }
    return sb.toString()
}

fun binarySearch(sorted: IntArray, target: Int): Int {
    var lo = 0
    var hi = sorted.lastIndex
    while (lo <= hi) {
        val mid = lo + (hi - lo) / 2
        when {
            sorted[mid] == target -> return mid
            sorted[mid] < target -> lo = mid + 1
            else -> hi = mid - 1
        }
    }
    return -1
}
