/**
 * Week 4 CHECKPOINT
 *
 * 1. Set PRACTICE_MODE = true
 * 2. Implement the 4 practice_* functions below (no AI, 10 min timer)
 * 3. Run: ../run week4/Checkpoint.kt
 *
 * Criteria: kotlin/phase0/CHECKPOINT.md
 * Solutions: CheckpointSolutions.kt (peek only after trying)
 */
const val PRACTICE_MODE = false

fun main() {
    val reverse: (String) -> String
    val dups: (List<Int>) -> List<Int>
    val second: (List<Int>) -> Int?
    val fact: (Int) -> Int

    if (PRACTICE_MODE) {
        reverse = ::practiceReverseString
        dups = ::practiceFindDuplicates
        second = ::practiceSecondLargest
        fact = ::practiceFactorial
        println("PRACTICE MODE — 10 min timer, no AI\n")
    } else {
        reverse = ::practiceReverseString
        dups = ::practiceFindDuplicates
        second = ::practiceSecondLargest
        fact = ::practiceFactorial
        println("STUDY MODE — fill practice_* below, then set PRACTICE_MODE = true")
        println("To see working answers first: ../run week4/CheckpointSolutions.kt\n")
    }

    runCheckpointTests(reverse, dups, second, fact)
}

fun runCheckpointTests(
    reverse: (String) -> String,
    dups: (List<Int>) -> List<Int>,
    second: (List<Int>) -> Int?,
    fact: (Int) -> Int,
) {
    var passed = 0
    val total = 5

    if (check("reverse", reverse("hello"), "olleh")) passed++
    if (check("dups", dups(listOf(1, 2, 2, 3, 1)).sorted(), listOf(1, 2))) passed++
    if (check("second largest", second(listOf(10, 5, 10, 3)), 10)) passed++
    if (check("second largest (null)", second(listOf(5)), null)) passed++
    if (check("factorial", fact(5), 120)) passed++

    println("\nResult: $passed / $total passed")
    if (passed == total && PRACTICE_MODE) {
        println("Checkpoint passed — you can start Phase 1 (LeetCode).")
    } else if (passed < total) {
        println("Keep practising. See CHECKPOINT.md and week4/01_LogicDrills.kt")
    }
}

fun check(name: String, actual: Any?, expected: Any?): Boolean {
    val ok = actual == expected
    println("${if (ok) "PASS" else "FAIL"}  $name → $actual (expected $expected)")
    return ok
}

// ==================== YOUR CODE (fill in) ====================

/** Reverse string — loop from end to start */
fun practiceReverseString(s: String): String {
    val out = StringBuilder()
    for(i in s.length-1 downTo 0){
        out.append(s[i])
    }
    // TODO
    return out.toString()
}

/** Return values that appear more than once (any order) */
fun practiceFindDuplicates(nums: List<Int>): List<Int> {
    val freq = mutableMapOf<Int, Int>()
    for (n in nums) freq[n] = (freq[n] ?:0) +1
    val dupList = mutableListOf<Int>()
    for((k,v) in freq) {
        if(v >1 ) dupList.add(k)

    }
    // TODO: frequency map, then collect keys where count > 1
    return dupList
}

/** Second largest distinct value, or null if fewer than 2 distinct values */
fun practiceSecondLargest(nums: List<Int>): Int? {
    var distinct = mutableListOf<Int>()
    var seen = mutableSetOf<Int>()
    
    for(n in nums) {
        if(n !in seen) {
            distinct.add(n)
            seen.add(n)
        }
    }
    
    var max = distinct[0]
    var second = distinct[0]

    if (distinct.size < 2) return null
    
    for(n in distinct) {
        if(n > max) {
            second = max
            max = n
        } else if (n > second) {
            second = n
        }
    }    // TODO
    return second
}

/** factorial(n), recursive, n >= 0 */
fun practiceFactorial(n: Int): Int {
   if (n <= 1) return 1
    return n * practiceFactorial(n - 1)
}
