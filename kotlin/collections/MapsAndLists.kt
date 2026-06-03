/**
 * Kotlin collections for DSA — parallel to dsa/basics/08_ArrayListAndHashMap.java
 * Run: ../run collections/MapsAndLists.kt
 */
fun main() {
    // List — mutableListOf, read with [i] or get
    val nums = mutableListOf(10, 20, 30)
    nums.add(40)
    println("list: $nums, [1]=${nums[1]}, size=${nums.size}")

    // Map — value → index (Two Sum style)
    val valueToIndex = hashMapOf<Int, Int>()
    val arr = intArrayOf(2, 7, 11, 15)
    for (i in arr.indices) {
        valueToIndex[arr[i]] = i
    }
    println("map[7] → index ${valueToIndex[7]}")

    // Safe get: null if missing
    val missing = valueToIndex[99]
    println("map[99] = $missing (null in Kotlin)")

    // Set — duplicate check
    val seen = hashSetOf<Int>()
    val withDup = intArrayOf(1, 2, 3, 2)
    var hasDup = false
    for (n in withDup) {
        if (n in seen) {
            hasDup = true
            break
        }
        seen.add(n)
    }
    println("has duplicate? $hasDup")
}
