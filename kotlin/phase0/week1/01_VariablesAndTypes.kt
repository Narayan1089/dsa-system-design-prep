/**
 * Week 1 — 01 Variables & types
 * Run: ../run week1/01_VariablesAndTypes.kt
 */
fun main() {
    // val = read-only (like final), var = mutable
    val name = "Narayan"
    var count = 0
    count += 1

    val age: Int = 25
    val price: Double = 19.99
    val active: Boolean = true
    val grade: Char = 'A'

    println("$name, age $age, count $count")

    // Type inference — compiler guesses type
    val inferred = 42 // Int

    // String templates
    println("sum = ${10 + 20}")

    // Explicit conversion (no implicit int → double)
    val a = 5
    val b = 2.0
    val avg = a / b // 2.5 — a promoted
    println("avg = $avg")
}
