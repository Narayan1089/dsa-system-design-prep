/**
 * LC 217 — Pattern: HashSet
 * Pasted from phase1/Practice.kt (your solve).
 */
class ContainsDuplicate {
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
}
