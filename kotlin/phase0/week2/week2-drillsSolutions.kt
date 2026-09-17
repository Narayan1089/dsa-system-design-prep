fun main() {
    val c = Counter()
    c.increment()
    c.increment()
    println(c.value)
    println(5.isEven())
    println(Rect(2, 3).perimeter())
}

class Counter {
    var value: Int = 0
        private set

    fun increment() {
        value++
    }
}

fun Int.isEven(): Boolean = this % 2 == 0

class Rect(val width: Int, val height: Int) {
    fun perimeter(): Int = 2 * (width + height)
}
