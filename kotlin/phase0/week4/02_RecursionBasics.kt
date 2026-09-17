/**
 * Week 4 — 02 Recursion basics
 */
fun main() {
    println("factorial(5) = ${factorial(5)}")
    println("sum [1,2,3,4] = ${sumList(listOf(1, 2, 3, 4))}")
    printDown(3)
}

fun factorial(n: Int): Int {
    if (n <= 1) return 1
    return n * factorial(n - 1)
}

fun sumList(nums: List<Int>): Int = sumFrom(nums, 0)

fun sumFrom(nums: List<Int>, index: Int): Int {
    if (index == nums.size) return 0
    return nums[index] + sumFrom(nums, index + 1)
}

fun printDown(n: Int) {
    if (n == 0) return
    println("n = $n")
    printDown(n - 1)
}
