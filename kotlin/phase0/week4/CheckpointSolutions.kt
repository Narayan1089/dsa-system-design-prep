/**
 * Checkpoint solutions — peek ONLY after trying Checkpoint.kt yourself.
 * Run: ../run week4/CheckpointSolutions.kt
 */
fun main() {
    println("SOLUTION REFERENCE (all should PASS)\n")
    runSolutionTests(
        ::solutionReverseString,
        ::solutionFindDuplicates,
        ::solutionSecondLargest,
        ::solutionFactorial,
    )
}

fun runSolutionTests(
    reverse: (String) -> String,
    dups: (List<Int>) -> List<Int>,
    second: (List<Int>) -> Int?,
    fact: (Int) -> Int,
) {
    var passed = 0
    if (check("reverse", reverse("hello"), "olleh")) passed++
    if (check("dups", dups(listOf(1, 2, 2, 3, 1)).sorted(), listOf(1, 2))) passed++
    if (check("second largest", second(listOf(10, 5, 10, 3)), 10)) passed++
    if (check("second largest (null)", second(listOf(5)), null)) passed++
    if (check("factorial", fact(5), 120)) passed++
    println("\nResult: $passed / 5 passed")
}

fun check(name: String, actual: Any?, expected: Any?): Boolean {
    val ok = actual == expected
    println("${if (ok) "PASS" else "FAIL"}  $name → $actual (expected $expected)")
    return ok
}

fun solutionReverseString(s: String): String {
    val out = StringBuilder()
    for (i in s.length - 1 downTo 0) {
        out.append(s[i])
    }
    return out.toString()
}

fun solutionFindDuplicates(nums: List<Int>): List<Int> {
    val freq = mutableMapOf<Int, Int>()
    for (n in nums) {
        freq[n] = (freq[n] ?: 0) + 1
    }
    val out = mutableListOf<Int>()
    for ((key, count) in freq) {
        if (count > 1) {
            out.add(key)
        }
    }
    return out
}

fun solutionSecondLargest(nums: List<Int>): Int? {
    val distinct = mutableListOf<Int>()
    val seen = mutableSetOf<Int>()
    for (n in nums) {
        if (n !in seen) {
            seen.add(n)
            distinct.add(n)
        }
    }
    if (distinct.size < 2) return null

    var max = distinct[0]
    var second = distinct[0]
    for (n in distinct) {
        if (n > max) {
            second = max
            max = n
        } else if (n > second) {
            second = n
        }
    }
    return second
}

fun solutionFactorial(n: Int): Int {
    if (n <= 1) return 1
    return n * solutionFactorial(n - 1)
}
