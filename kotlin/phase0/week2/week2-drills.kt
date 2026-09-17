/**
 * Week 2 drills
 */
fun main() {
    val c = Counter()
    c.increment()
    c.increment()

    c.increment()
    println(c.value) // 2

    println(5.isEven())
    println(Rect(2, 3).perimeter()) // 10
}

// TODO: Counter with increment(), value read-only from outside
class Counter {
    var value: Int = 0
        private set
    fun increment() {
        value++
    }
    // your code
}

// TODO: extension on Int
fun Int.isEven(): Boolean = false {
    return this % 2 == 0
}

// TODO: Rectangle area + perimeter
class Rect(val width: Int, val height: Int) {
    fun perimeter(): Int = 0
}
