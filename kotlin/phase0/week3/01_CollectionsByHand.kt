/**
 * Week 3 — 01 filter / map / sort BY HAND (no .filter/.map in drills)
 */
fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    println("evens: ${filterEven(nums)}")
    println("doubled: ${mapDouble(nums)}")
    println("sorted desc: ${sortDescending(listOf(3, 1, 4, 1, 5))}")
}

/** Keep only even numbers — manual loop */
fun filterEven(nums: List<Int>): List<Int> {
    val out = mutableListOf<Int>()
    for (n in nums) {
        if (n % 2 == 0) out.add(n)
    }
    return out
}

/** Each element * 2 — manual loop */
fun mapDouble(nums: List<Int>): List<Int> {
    val out = mutableListOf<Int>()
    for (n in nums) {
        out.add(n * 2)
    }
    return out
}

/** Bubble sort descending — understand before using .sorted() */
fun sortDescending(nums: List<Int>): List<Int> {
    val arr = nums.toMutableList()
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] < arr[j]) {
                val tmp = arr[i]
                arr[i] = arr[j]
                arr[j] = tmp
            }
        }
    }
    return arr
}
