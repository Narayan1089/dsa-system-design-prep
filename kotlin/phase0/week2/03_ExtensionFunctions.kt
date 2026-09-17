/**
 * Week 2 — 03 Extension functions (add methods without subclassing)
 */
fun main() {
    println("kotlin".capitalizeFirst())
    println(listOf(1, 2, 3).secondOrNull())
    println(listOf(1).secondOrNull())

    val s = "  hello  "
    println(s.trimAndUpper())
}

fun String.capitalizeFirst(): String {
    if (isEmpty()) return this
    return this[0].uppercaseChar() + substring(1)
}

fun <T> List<T>.secondOrNull(): T? =
    if (size >= 2) this[1] else null

fun String.trimAndUpper(): String = this.trim().uppercase()
