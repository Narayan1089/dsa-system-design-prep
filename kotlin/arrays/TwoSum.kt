/**
 * Two Sum — same logic as dsa/arrays/TwoSum.java
 * LeetCode-style: class with solution method (no main).
 */
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>(nums.size * 2)
        for (i in nums.indices) {
            val need = target - nums[i]
            seen[need]?.let { return intArrayOf(it, i) }
            seen[nums[i]] = i
        }
        return intArrayOf()
    }
}
