/**
 * Warm-up drills — do these BEFORE LeetCode. See easy-ramp.md
 *
 * 15 tiny functions. No LeetCode account, no medium-difficulty pressure.
 * Drills 3-7 build Group Anagrams one piece at a time.
 *
 * Run: cd kotlin/phase1 && ./run Warmup.kt
 * Answers: WarmupSolutions.kt — peek only after a real 15-minute attempt.
 *
 * Goal: 15/15, all from blank, no AI.
 */

fun main() {
    var passed = 0
    val total = 15

    println("--- Block 1: frequency maps ---")
    if (t("1 countChars 'hello'", countChars("hello"), mapOf('h' to 1, 'e' to 1, 'l' to 2, 'o' to 1))) passed++
    if (t("2 firstUnique 'loveleetcode'", firstUnique("loveleetcode"), 'v')) passed++

    println("\n--- Block 2: map value = LIST (the Group Anagrams shape) ---")
    if (t(
            "3 groupByLength",
            groupByLength(listOf("eat", "tea", "at", "bat")),
            mapOf(3 to listOf("eat", "tea", "bat"), 2 to listOf("at"))
        )
    ) passed++
    if (t(
            "4 groupByFirstChar",
            groupByFirstChar(listOf("eat", "tea", "tan", "ear")),
            mapOf('e' to listOf("eat", "ear"), 't' to listOf("tea", "tan"))
        )
    ) passed++
    if (t("5 sortedKey 'tea'", sortedKey("tea"), "aet")) passed++
    if (t("6 countKey 'tea'", countKey("tea"), "a1e1t1")) passed++
    if (t(
            "7 groupBySortedKey  <- this IS LC 49",
            norm(groupBySortedKey(listOf("eat", "tea", "tan", "ate", "nat", "bat"))),
            norm(listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat")))
        )
    ) passed++

    println("\n--- Block 3: counting -> Top K (preps LC 347) ---")
    if (t(
            "8 bucketsByCount",
            bucketsByCount(mapOf(1 to 3, 2 to 2, 3 to 1), 3),
            listOf(emptyList(), listOf(3), listOf(2), listOf(1))
        )
    ) passed++
    if (t("9 topKFrequent k=2", topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2).sorted(), listOf(1, 2))) passed++

    println("\n--- Block 4: two pointers (preps LC 26/283/167) ---")
    if (t("10 reverseInPlace", reverseInPlace(intArrayOf(1, 2, 3, 4)).toList(), listOf(4, 3, 2, 1))) passed++
    if (t("11 removeDuplicatesSorted", removeDuplicatesSorted(intArrayOf(1, 1, 2, 2, 3)), 3)) passed++
    if (t("12 hasPairSum sorted target 9", hasPairSum(intArrayOf(2, 7, 11, 15), 9), true)) passed++

    println("\n--- Block 5: window + search ---")
    if (t("13 maxWindowSum k=2", maxWindowSum(intArrayOf(1, 12, -5, -6, 50), 2), 44)) passed++
    if (t("14 runLengthEncode 'aaabbc'", runLengthEncode("aaabbc"), "a3b2c1")) passed++
    if (t("15 binarySearch find 7", binarySearch(intArrayOf(1, 3, 5, 7, 9), 7), 3)) passed++

    println("\nResult: $passed / $total")
    when {
        passed == total -> println("All green. Open easy-ramp.md -> Ladder 1, Block A.")
        passed >= 10 -> println("Close. Redo the failures from blank tomorrow before LeetCode.")
        else -> println("Not yet. These are the gap. Stay here — do NOT open LeetCode.")
    }
}

fun t(name: String, actual: Any?, expected: Any?): Boolean {
    val ok = actual == expected
    println("${if (ok) "PASS" else "FAIL"}  $name -> $actual" + if (ok) "" else "  (expected $expected)")
    return ok
}

/** Sort groups + contents so order never fails a correct answer. */
fun norm(groups: List<List<String>>): List<List<String>> =
    groups.map { it.sorted() }.sortedBy { it.joinToString(",") }

// ==================== YOUR CODE ====================

/** 1. Count each character. "hello" -> {h=1, e=1, l=2, o=1} */
fun countChars(s: String): Map<Char, Int> {
    // TODO: mutableMapOf<Char, Int>(), then map[ch] = (map[ch] ?: 0) + 1
    return emptyMap()
}

/** 2. First character appearing exactly once, or null. "loveleetcode" -> 'v' */
fun firstUnique(s: String): Char? {
    // TODO: pass 1 = count, pass 2 = walk s again, return first with count 1
    return null
}

/**
 * 3. Group words by length.
 * ["eat","tea","at","bat"] -> {3=[eat,tea,bat], 2=[at]}
 *
 * THE KEY LINE: map.getOrPut(key) { mutableListOf() }.add(word)
 */
fun groupByLength(words: List<String>): Map<Int, List<String>> {
    // TODO: key is word.length
    return emptyMap()
}

/** 4. Same idea, key is the first character. */
fun groupByFirstChar(words: List<String>): Map<Char, List<String>> {
    // TODO: key is word[0]
    return emptyMap()
}

/** 5. Letters of a word sorted. "tea" -> "aet". This is the anagram fingerprint. */
fun sortedKey(word: String): String {
    // TODO: word.toCharArray().sortedArray().concatToString()
    return ""
}

/**
 * 6. Count-based fingerprint, no sorting. "tea" -> "a1e1t1"
 * Same idea as 5 but O(k) instead of O(k log k) — how you'd optimize LC 49.
 */
fun countKey(word: String): String {
    // TODO: IntArray(26), fill counts, then build "a1e1t1" skipping zeros
    return ""
}

/**
 * 7. Group anagrams. Combine 3 and 5.
 * ["eat","tea","tan","ate","nat","bat"] -> [[eat,tea,ate],[tan,nat],[bat]]
 *
 * If 3 and 5 pass, this is FOUR lines. That's the whole trick.
 */
fun groupBySortedKey(words: List<String>): List<List<String>> {
    // TODO: map<String, MutableList<String>>, key = sortedKey(word), return map.values.toList()
    return emptyList()
}

/**
 * 8. Bucket numbers by how many times they appear.
 * {1:3, 2:2, 3:1}, maxCount 3 -> [[], [3], [2], [1]]
 * Index = count. This is the O(n) trick behind Top K Frequent.
 */
fun bucketsByCount(freq: Map<Int, Int>, maxCount: Int): List<List<Int>> {
    // TODO: List of (maxCount + 1) mutable lists, then buckets[count].add(num)
    return emptyList()
}

/** 9. k most frequent values. [1,1,1,2,2,3], k=2 -> [1,2]. Use 1 + 8. */
fun topKFrequent(nums: IntArray, k: Int): List<Int> {
    // TODO: frequency map -> buckets -> walk buckets from the end until you have k
    return emptyList()
}

/** 10. Reverse in place with two pointers (no .reversed()). */
fun reverseInPlace(arr: IntArray): IntArray {
    // TODO: left = 0, right = lastIndex, swap and move inward
    return arr
}

/** 11. Sorted array — return count of distinct values. [1,1,2,2,3] -> 3 */
fun removeDuplicatesSorted(nums: IntArray): Int {
    // TODO: slow pointer marks last kept value, fast pointer scans
    return 0
}

/** 12. Sorted array — does any pair sum to target? Two pointers, no map. */
fun hasPairSum(sorted: IntArray, target: Int): Boolean {
    // TODO: sum too small -> left++, too big -> right--
    return false
}

/** 13. Max sum of any k consecutive elements. [1,12,-5,-6,50], k=2 -> 44 */
fun maxWindowSum(nums: IntArray, k: Int): Int {
    // TODO: sum first k, then slide: add nums[i], subtract nums[i - k]
    return 0
}

/** 14. Run-length encode. "aaabbc" -> "a3b2c1" */
fun runLengthEncode(s: String): String {
    // TODO: walk once, count the current run, flush when the char changes
    return ""
}

/** 15. Index of target in a sorted array, or -1. Write it without recursion. */
fun binarySearch(sorted: IntArray, target: Int): Int {
    // TODO: lo = 0, hi = lastIndex, mid = lo + (hi - lo) / 2
    return -1
}
