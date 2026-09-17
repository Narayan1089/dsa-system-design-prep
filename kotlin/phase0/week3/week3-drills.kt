/**
 * Week 3 drills — NO .filter, .map, .groupBy, .count() on collections
 */
fun main() {
    println(sumList(listOf(1, 2, 3, 4)))                    // 10
    println(contains(listOf(1, 2, 3), 5))                   // true
    println(firstIndexOf(listOf(5, 2, 2), 2))               // 1
    println(charFrequency("aab"))                           // {a=2, b=1}
}

fun sumList(nums: List<Int>): Int {
    var sum = 0
    for (n in nums) {
        sum = n + sum
    }
    return sum
}

fun contains(nums: List<Int>, target: Int): Boolean {
    for(n in nums) {
        if(n == target) return true
    }
    return false
}

fun firstIndexOf(nums: List<Int>, target: Int): Int {
    for (i in nums.indices) {
        if(nums[i] == target) return i
    }
    return -1
}

fun charFrequency(s: String): Map<Char, Int> = emptyMap()
