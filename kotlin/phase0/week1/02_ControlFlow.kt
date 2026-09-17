/**
 * Week 1 — 02 Control flow (if, when, ternary-style)
 */
fun main() {
    val score = 85
    if (score >= 90) {
        println("A")
    } else if (score >= 80) {
        println("B")
    } else {
        println("C or below")
    }

    // when = powerful switch
    val day = 3
    when (day) {
        1 -> println("Mon")
        2 -> println("Tue")
        3 -> println("Wed")
        else -> println("Other")
    }

    // when as expression
    val label = when {
        score >= 90 -> "Excellent"
        score >= 60 -> "Pass"
        else -> "Fail"
    }
    println(label)

    // if as expression (no ? : but same idea)
    val status = if (score >= 60) "Pass" else "Fail"
    println(status)
}
