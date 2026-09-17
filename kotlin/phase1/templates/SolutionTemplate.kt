/**
 * LeetCode-style template — copy to topic folder when solving offline first.
 *
 * Offline run: kotlinc SolutionTemplate.kt -include-runtime -d out.jar && kotlin -classpath out.jar SolutionTemplateKt
 * Or paste into LeetCode editor (remove main + tests).
 */

// class Solution {
//     fun twoSum(nums: IntArray, target: Int): IntArray {
//         // 1. Brute force idea: ...
//         // 2. Optimized: HashMap value -> index
//         return intArrayOf()
//     }
// }

fun main() {
    // Local test — LeetCode won't have this
    val nums = intArrayOf(2, 7, 11, 15)
    println("Example: twoSum(${nums.contentToString()}, 9)")
    // println(twoSum(nums, 9).contentToString()) // after you implement
}

/**
 * CHECKLIST before submit:
 * ☐ Empty input?
 * ☐ One element?
 * ☐ Duplicates?
 * ☐ Said time/space complexity out loud?
 */
