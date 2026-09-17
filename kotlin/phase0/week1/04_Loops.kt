/**
 * Week 1 — 04 Loops
 */
fun main() {
    println("for range 0..4:")
    for (i in 0..4) print("$i ")
    println()

    println("until 5 (0..4):")
    for (i in 0 until 5) print("$i ")
    println()

    println("downTo:")
    for (i in 3 downTo 1) print("$i ")
    println()

    val nums = listOf(10, 20, 30)
    println("for each: ${nums.joinToString()}")
    for ((index, value) in nums.withIndex()) {
        println("  [$index] = $value")
    }

    var n = 3
    while (n > 0) {
        print("$n ")
        n--
    }
    println()

    // repeat
    repeat(3) { i -> println("repeat $i") }
}
