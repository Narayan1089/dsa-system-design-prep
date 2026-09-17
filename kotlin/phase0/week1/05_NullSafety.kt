/**
 * Week 1 — 05 Null safety (?., !!, ?:, let)
 */
fun main() {
    var nullable: String? = ""
    println(nullable?.length) // safe call → 5

    nullable = null
    println(nullable?.length) // null, no crash

    // Elvis — default if null
    val len = nullable?.length ?: 0
    println("len = $len")

    // let — run block if not null
    val name: String? = "Ada"
    name?.let { println("Hi $it") }

    // NOT null assertion !! — crashes if null (avoid in real code)
    val sure = name!!
    println(sure)

    demoFindUser(1)
    demoFindUser(99)
}

fun findUser(id: Int): String? =
    if (id == 1) "Narayan" else null

fun demoFindUser(id: Int) {
    val user = findUser(id)
    if (user != null) {
        println("Found: $user")
    } else {
        println("User $id not found")
    }
}
