/**
 * Week 4 — Daily logic drills (blank-file style)
 * Do each from scratch in a NEW file before checking solutions.
 */
fun main() {
    println("reverse: ${reverseString("hello")}")
    println("dups: ${fD(listOf(1, 2, 2, 3, 1,4,4,3,4,5))}")
    println("2nd largest: ${secondLargest(listOf(6,8))}")
    println("sum 1..5: ${sumRange(1, 5)}")
}

fun reverseString(s: String): String {
    val out = StringBuilder()
    for (i in s.length - 1 downTo 0) {
        out.append(s[i])
    }
    return out.toString()
}

fun findDuplicates(nums: List<Int>): List<Int> {
    val freq = mutableMapOf<Int, Int>()
    for (n in nums) freq[n] = (freq[n] ?: 0) + 1
    val out = mutableListOf<Int>()
    for ((k, v) in freq) {
        if (v > 1) out.add(k)
    }
    return out
}

fun secondLargest(nums: List<Int>): Int? {
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

fun sumRange(from: Int, to: Int): Int {
    var sum = 0
    for (i in from..to) sum += i
    return sum
}

fun fD(nums: List<Int>) : List<Int> {
    val freq = mutableMapOf<Int, Int>()
    for (n in nums) {
        freq[n] = (freq[n] ?: 0)+1
    }
    var out = mutableListOf<Int>()
    for((k,v) in freq) {
        if(v > 1) {
            out.add(k)
        }
    }

return out
}
