/**
 * Practice (Kotlin) — parallel to dsa/basics/09_PracticeExercises.java
 * Run: ./run practice/PracticeExercises.kt
 */
fun main() {
    val p = PracticeExercises()

    println("sum = ${p.sumArray(intArrayOf(1, 2, 3))}")                    // 6
    println("max = ${p.findMax(intArrayOf(3, 9, 1))}")                    // 9
    println("reverse = ${p.reverse(intArrayOf(1, 2, 3)).contentToString()}") // [3,2,1]
    println("hasDup = ${p.hasDuplicate(intArrayOf(1, 2, 3, 2))}")         // true

    val sample = intArrayOf(2, 11, 8, 15)
    val target = 26
    println("twoSum (map)   = ${p.twoSum(sample, target).contentToString()}")
    println("twoSum (brute) = ${p.twoSumBruteForce(sample, target).contentToString()}")
}

class PracticeExercises {

    fun sumArray(arr: IntArray): Int {
        var sum = 0
        for (n in arr) sum += n
        return sum
    }

    fun findMax(arr: IntArray): Int {
        var max = arr[0]
        for (i in 1 until arr.size) {
            if (arr[i] > max) max = arr[i]
        }
        return max
    }

    fun reverse(arr: IntArray): IntArray {
        // TODO: return reversed copy
        return intArrayOf()
    }

    fun hasDuplicate(arr: IntArray): Boolean {
        // TODO: hashSetOf
        return false
    }

    /** O(n²) — every pair (i, j) with j > i */
    fun twoSumBruteForce(arr: IntArray, target: Int): IntArray {
        for (i in arr.indices) {
            for (j in i + 1 until arr.size) {
                if (arr[i] + arr[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    /** O(n) — one pass + map */
    fun twoSum(arr: IntArray, target: Int): IntArray {
        val seen = hashMapOf<Int, Int>()
        for (i in arr.indices) {
            val need = target - arr[i]
            if (need in seen) {
                return intArrayOf(seen[need]!!, i)
            }
            seen[arr[i]] = i
        }
        return intArrayOf()
    }
}
