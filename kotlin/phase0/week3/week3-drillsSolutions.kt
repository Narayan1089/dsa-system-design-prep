fun main() {
    println(sumList(listOf(1, 2, 3, 4)))
    println(contains(listOf(1, 2, 3), 2))
    println(firstIndexOf(listOf(5, 2, 2), 2))
    println(charFrequency("aab"))
}

fun sumList(nums: List<Int>): Int {
    var sum = 0
    for (n in nums) sum += n
    return sum
}

fun contains(nums: List<Int>, target: Int): Boolean {
    for (n in nums) if (n == target) return true
    return false
}

fun firstIndexOf(nums: List<Int>, target: Int): Int {
    for (i in nums.indices) {
        if (nums[i] == target) return i
    }
    return -1
}

fun charFrequency(s: String): Map<Char, Int> {
    val freq = mutableMapOf<Char, Int>()
    for (ch in s) {
        println("hfdh: "+freq[ch])
        freq[ch] = (freq[ch] ?: 0) + 1
    }
    return freq
}
