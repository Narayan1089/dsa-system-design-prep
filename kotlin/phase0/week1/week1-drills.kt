/**
 * Week 1 drills — try WITHOUT looking at solutions first
 * Then compare: week1-drillsSolutions.kt
 */




fun main() {
    println("max = ${maxOfThree(3, 9, 1)}")           // 9
    println("fizzBuzz(5) = ${fizzBuzz(15)}")           // 1,2,Fizz,4,Buzz
    println("countVowels = ${countVowels("hello")}")  // 2
    println("isEven = : ${isEven(3)}")
    println("Safe divide:  ${safeDivide(8,0)}")

    val bookValue = Book("Hello","Nosas", 123)
    printBookTitle(bookValue)

    val bookNo : Book? =  null
    printBookTitle(bookNo)

     val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)
    val triangle = Triangle(8.0, 3.0)

    println("Circle area: ${area(circle)}")
    println("Rectangle area: ${area(rectangle)}")
    println("Triangle area: ${area(triangle)}")

    println(4.isPrime())


}

// TODO 1: return largest of three ints
fun maxOfThree(a: Int, b: Int, c: Int): Int {
    var max = a
    if (b > max) {
        max = b
    }
    if (c > max) {
        max = c
    }
    return max
}

// TODO 2: return list 1..n, replace multiples of 3 with "Fizz", 5 with "Buzz", both with "FizzBuzz"
fun fizzBuzz(n: Int): List<String> {
    var out = mutableListOf<String>()
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

// TODO 3: count a,e,i,o,u (lower case)
fun countVowels(s: String): Int {
    val vowels = setOf('a','e','i','o','u')
    var count = 0
    for ( ch in s) {
        if( ch in vowels) count ++
    }

    return count
}

fun isEven(n : Int): Boolean {
    if(n % 2 == 0) return true
    return false
}


fun safeDivide(a: Int, b: Int): Int? {
    return if (b == 0) {
        null
    } else {
    return a/b
    }
}

data class Book(
    val title: String,
    val author : String,
    val year: Int
)

fun printBookTitle(book : Book?) {
    println(book?.title ?: "Unknown")
}

sealed class Shape()
data class Circle(val r: Double) : Shape()
data class Rectangle(val w: Double, val h: Double) : Shape()
data class Triangle(val base: Double, val height: Double) : Shape()

fun area(shape: Shape) : Double {
    return when (shape) {
        is Circle -> 3.14 * shape.r * shape.r
        is Rectangle -> shape.w * shape.h
        is Triangle -> 0.5* shape.base * shape.height
    }
}


fun Int.isPrime() : Boolean {
    if(this < 2) return false

    for (i in 2 until this) {
        if(this % i == 0) {
            return false
        }
    }

    return true
}
