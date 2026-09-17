/**
 * Week 2 — 02 Interfaces & inheritance (open, override)
 */
fun main() {
    val shapes: List<Shape> = listOf(Circle(2.0), Rectangle(3.0, 4.0))
    for (s in shapes) {
        println("${s.name}: area = ${s.area()}")
    }

    val repo: UserRepository = InMemoryUserRepository()
    println(repo.findById(1))
}

interface Shape {
    val name: String
    fun area(): Double
}

class Circle(private val radius: Double) : Shape {
    override val name = "Circle"
    override fun area() = 3.14159 * radius * radius
}

class Rectangle(private val w: Double, private val h: Double) : Shape {
    override val name = "Rectangle"
    override fun area() = w * h
}

interface UserRepository {
    fun findById(id: Int): String?
}

class InMemoryUserRepository : UserRepository {
  private val users = mapOf(1 to "Ada", 2 to "Bob")

    override fun findById(id: Int): String? = users[id]
}
