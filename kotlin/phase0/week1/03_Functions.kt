/**
 * Week 1 — 03 Functions
 */
fun main() {
    greet("Kotlin")
    println("add(3,4) = ${add(3, 4)}")
    println("sum ${listOf(1, 2, 3)} = ${sumList(listOf(1, 2, 3))}")

    // Default args
    println(power(2))      // 2^2
    println(power(2, 3))   // 8

    // Named args
    println(createUser(name = "Ada", age = 30))
}

fun greet(name: String) {
    println("Hello, $name!")
}

fun add(a: Int, b: Int): Int = a + b  // single-expression function

fun sumList(nums: List<Int>): Int {
    var total = 0
    for (n in nums) total += n
    return total
}

fun power(base: Int, exp: Int = 2): Int {
    var result = 1
    repeat(exp) { result *= base }
    return result
}

fun createUser(name: String, age: Int = 18): String = "$name ($age)"
