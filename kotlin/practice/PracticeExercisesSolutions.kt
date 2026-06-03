/**
 * Solutions — peek after trying PracticeExercises.kt
 * Run: ./run practice/PracticeExercisesSolutions.kt
 */
fun main() {
    val s = PracticeExercisesSolutions()
    println("reverse = ${s.reverse(intArrayOf(1, 2, 3)).contentToString()}")
    println("hasDup = ${s.hasDuplicate(intArrayOf(1, 2, 3, 2))}")
    println("twoSum = ${s.twoSum(intArrayOf(2, 11, 8, 15), 26).contentToString()}")
}

class PracticeExercisesSolutions {

    fun reverse(arr: IntArray): IntArray {
        return IntArray(arr.size) { i -> arr[arr.size - 1 - i] }
    }

    fun hasDuplicate(arr: IntArray): Boolean {
        val seen = hashSetOf<Int>()
        for (n in arr) {
            if (n in seen) return true
            seen.add(n)
        }
        return false
    }

    fun twoSumBruteForce(arr: IntArray, target: Int): IntArray {
        for (i in arr.indices) {
            for (j in i + 1 until arr.size) {
                if (arr[i] + arr[j] == target) return intArrayOf(i, j)
            }
        }
        return intArrayOf()
    }

    fun twoSum(arr: IntArray, target: Int): IntArray {
        val seen = hashMapOf<Int, Int>()
        for (i in arr.indices) {
            val need = target - arr[i]
            seen[need]?.let { return intArrayOf(it, i) }
            seen[arr[i]] = i
        }
        return intArrayOf()
    }
}
