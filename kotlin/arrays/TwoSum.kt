/**
 * LC 1 — Pattern: HashMap value → index
 * Pasted from phase1/Practice.kt
 */
class TwoSum {

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
}
