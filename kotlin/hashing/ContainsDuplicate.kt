/**
 * Contains Duplicate — HashSet, same idea as dsa/hashing/ContainsDuplicate.java
 */
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = hashSetOf<Int>()
        for (n in nums) {
            if (n in seen) return true
            seen.add(n)
        }
        return false
    }
}
