/**
 * Step-by-step Two Sum + HashMap trace (Kotlin)
 * Run: ./run practice/HashMapTwoSumWalkthrough.kt
 */
fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    twoSumWithTrace(nums, target)
}

fun twoSumWithTrace(nums: IntArray, target: Int) {
    val seen = hashMapOf<Int, Int>()
    println("nums = ${nums.contentToString()}, target = $target")
    println("Map: value → index\n")

    for (i in nums.indices) {
        val current = nums[i]
        val complement = target - current

        println("--- i = $i, nums[i] = $current ---")
        println("  complement = $target - $current = $complement")
        println("  seen before: $seen")

        val earlier = seen[complement]
        if (earlier != null) {
            println("  seen[$complement] = $earlier → pair found!")
            println("  answer: [$earlier, $i]")
            return
        }

        println("  seen[$complement] = null → put(${current}, $i)")
        seen[current] = i
        println("  seen after: $seen\n")
    }
    println("No pair found.")
}
