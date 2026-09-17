/** Week 1 drill solutions — peek after trying */
fun main() {
    println(maxOfThree(3, 9, 1))
    println(fizzBuzz(5))
    println(countVowels("hello"))
}

fun maxOfThree(a: Int, b: Int, c: Int): Int {
    var max = a
    if (b > max) max = b
    if (c > max) max = c
    return max
}

fun fizzBuzz(n: Int): List<String> {
    val out = mutableListOf<String>()
    for (i in 1..n) {
        when {
            i % 15 == 0 -> out.add("FizzBuzz")
            i % 3 == 0 -> out.add("Fizz")
            i % 5 == 0 -> out.add("Buzz")
            else -> out.add(i.toString())
        }
    }
    return out
}

fun countVowels(s: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (ch in s) {
        if (ch in vowels) count++
    }
    return count
}
