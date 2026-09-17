/**
 * Week 3 — 02 Frequency counting & deduplication (manual)
 */
fun main() {
    val nums = listOf(1, 2, 2, 3, 1, 3)
    println("freq: ${frequency(nums)}")
    println("unique: ${dD(nums)}")
    println("most common: ${mF(nums)}")

}

fun frequency(nums: List<Int>): Map<Int, Int> {
    val freq = mutableMapOf<Int, Int>()
    for (n in nums) {
        freq[n] = (freq[n] ?:0) +1
    }
    return freq


    // val freq = mutableMapOf<Int, Int>()
    // for (n in nums) {
    //     freq[n] = (freq[n] ?: 0) + 1
    //     println("freq: i $freq")
    // }
    // return freq
}

fun dedupe(nums: List<Int>): List<Int> {
    val seen = mutableSetOf<Int>()
    val out = mutableListOf<Int>()
    for (n in nums) {
        if (n !in seen) {
            seen.add(n)
            out.add(n)
        }
    }
    return out
}

fun mostFrequent(nums: List<Int>): Int {
    val freq = frequency(nums)
    var bestKey = nums[0]
    var bestCount = 0
    for ((key, count) in freq) {
        if (count > bestCount) {
            bestCount = count
            bestKey = key
        }
    }
    return bestKey
}

fun dD(nums: List<Int>): List<Int> {
    val seen = mutableSetOf<Int>()
    val out = mutableListOf<Int>()

    for (n in nums) {
        if(n !in seen) {
            seen.add(n)
            out.add(n)
        }
    }

    return out
}

fun mF(nums: List<Int>): Int {
    val freq = frequency(nums)
    var bestKey = nums[0]
    var bestCount = 0
    for ((key, count) in freq) {
        if(count > bestCount) {
            bestCount = count
            bestKey = key
        }
    }
    println("idis: "+bestCount)
    return bestKey
}

