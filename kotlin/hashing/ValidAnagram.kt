/**
 * LC 242 — Pattern: frequency map
 * Pasted from phase1/Practice.kt
 */
class ValidAnagram {

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
}
