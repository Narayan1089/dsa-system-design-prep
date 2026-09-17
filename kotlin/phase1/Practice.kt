/**
 * Phase 1 — all problems in this one file. Run: ./run
 *
 * After a problem ACs, paste that function into kotlin/<topic>/<Name>.kt
 * (no new folders). Topic files have the code only — no main.
 */

class Solution {

    // LC 217 — Pattern: HashSet  →  hashing/ContainsDuplicate.kt
    fun containsDuplicate(nums: IntArray): Boolean {
        var set = mutableSetOf<Int>()
        for (n in nums) {
            if (n !in set) {
                set.add(n)
            } else {
                return true
            }
        }
        return false
    }

    // LC 242 — Pattern: frequency map  →  hashing/ValidAnagram.kt

    /** Brute force — sort both strings, compare. O(n log n) time, O(n) space */
    fun isAnagramBruteForce(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray())
    }

    /** Best — one frequency map. O(n) time, O(1) space if alphabet fixed (26 letters) */
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val freq = mutableMapOf<Char, Int>()
        for (ch in s) {
            freq[ch] = (freq[ch] ?: 0) + 1
        }
        for (ch in t) {
            val count = freq[ch] ?: return false
            if (count == 1) freq.remove(ch)
            else freq[ch] = count - 1
        }
        return true
    }

    // LC 1 — Pattern: HashMap value → index  →  arrays/TwoSum.kt

    /** Brute force — check every pair. O(n²) time, O(1) space */
    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    /** Best — one pass HashMap. O(n) time, O(n) space */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            val need = target - nums[i]
            if (need in seen) {
                return intArrayOf(seen[need]!!, i)
            }
            seen[nums[i]] = i
        }
        return intArrayOf()
    }

    // LC 49 — Pattern: HashMap key → list  →  hashing/GroupAnagrams.kt

    /** Brute force — compare every pair with isAnagram. O(n² * k) time */
    fun groupAnagramsBruteForce(strs: Array<String>): List<List<String>> {
        val used = BooleanArray(strs.size)
        val result = mutableListOf<List<String>>()
        for (i in strs.indices) {
            if (used[i]) continue
            val group = mutableListOf(strs[i])
            used[i] = true
            for (j in i + 1 until strs.size) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j])
                    used[j] = true
                }
            }
            result.add(group)
        }
        return result
    }

    /** Best — sorted word as map key. O(n * k log k) time, O(n * k) space */
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = hashMapOf<String, MutableList<String>>()
        for (word in strs) {
            val key = word.toCharArray().sortedArray().concatToString()
            groups.getOrPut(key) { mutableListOf() }.add(word)
        }
        return groups.values.toList()
    }
}

fun main() {
    val sol = Solution()

    // println("--- Contains Duplicate ---")
    // check(" [1,2,3,1]", sol.containsDuplicate(intArrayOf(1, 2, 3, 1)), true)
    // check(" [1,2,3,4]", sol.containsDuplicate(intArrayOf(1, 2, 3, 4)), false)
    // check(" [1,1,1,3,3,4,3,2,4,2]", sol.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)), true)
    // check(" []", sol.containsDuplicate(intArrayOf()), false)
    // check(" [1]", sol.containsDuplicate(intArrayOf(1)), false)

    // println("--- Valid Anagram (frequency map) ---")
    // runAnagramTests(sol::isAnagram)

    // println("--- Valid Anagram (brute force sort) ---")
    // runAnagramTests(sol::isAnagramBruteForce)

    // println("--- Two Sum (HashMap) ---")
    // runTwoSumTests(sol::twoSum)

    // println("--- Two Sum (brute force) ---")
    // runTwoSumTests(sol::twoSumBruteForce)

    println("--- Group Anagrams (HashMap) ---")
    runGroupAnagramsTests(sol::groupAnagrams)

    println("--- Group Anagrams (brute force) ---")
    runGroupAnagramsTests(sol::groupAnagramsBruteForce)
}

fun runAnagramTests(isAnagram: (String, String) -> Boolean) {
    check(" anagram / nagaram", isAnagram("anagram", "nagaram"), true)
    check(" rat / car", isAnagram("rat", "car"), false)
    check(" '' / ''", isAnagram("", ""), true)
    check(" a / ab", isAnagram("a", "ab"), false)
    check(" ab / ba", isAnagram("ab", "ba"), true)
}

fun runTwoSumTests(twoSum: (IntArray, Int) -> IntArray) {
    checkTwoSum(" [2,7,11,15] target 9", twoSum(intArrayOf(2, 7, 11, 15), 9), intArrayOf(0, 1))
    checkTwoSum(" [3,2,4] target 6", twoSum(intArrayOf(3, 2, 4), 6), intArrayOf(1, 2))
    checkTwoSum(" [3,3] target 6", twoSum(intArrayOf(3, 3), 6), intArrayOf(0, 1))
}

fun runGroupAnagramsTests(groupAnagrams: (Array<String>) -> List<List<String>>) {
    checkGroupAnagrams(
        " classic",
        groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")),
        listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))
    )
    checkGroupAnagrams(" ['']", groupAnagrams(arrayOf("")), listOf(listOf("")))
    checkGroupAnagrams(" ['a']", groupAnagrams(arrayOf("a")), listOf(listOf("a")))
}

fun checkGroupAnagrams(label: String, got: List<List<String>>, expected: List<List<String>>) {
    fun normalize(groups: List<List<String>>) =
        groups.map { it.sorted() }.sortedBy { it.joinToString(",") }
    val ok = normalize(got) == normalize(expected)
    val tag = if (ok) "OK  " else "FAIL"
    println("$tag $label = $got  (expected $expected)")
}

fun checkTwoSum(label: String, got: IntArray, expected: IntArray) {
    val ok = got.sortedArray().contentEquals(expected.sortedArray())
    val tag = if (ok) "OK  " else "FAIL"
    println("$tag $label = ${got.contentToString()}  (expected ${expected.contentToString()})")
}

fun check(label: String, got: Any, expected: Any) {
    val ok = if (got == expected) "OK  " else "FAIL"
    println("$ok $label = $got  (expected $expected)")
}
