/**
 * LC 49 — Pattern: HashMap key → list
 * Pasted from phase1/Practice.kt
 */
class GroupAnagrams {

    private fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val freq = mutableMapOf<Char, Int>()
        for (ch in s) freq[ch] = (freq[ch] ?: 0) + 1
        for (ch in t) {
            val count = freq[ch] ?: return false
            if (count == 1) freq.remove(ch)
            else freq[ch] = count - 1
        }
        return true
    }

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
