/**
 * Week 1 — 06 Data classes (auto equals, copy, toString)
 */
fun main() {
    val u1 = User("Ada", 25)
    val u2 = User("Ada", 25)
    println(u1)           // User(name=Ada, age=25)
    println(u1 == u2)     // true — structural equality

    val older = u1.copy(age = 26)
    println(older)

    val (name, age) = u1  // destructuring
    println("name=$name age=$age")
}

data class User(val name: String, val age: Int)
