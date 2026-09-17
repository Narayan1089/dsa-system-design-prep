/**
 * Week 1 — 07 Sealed classes (restricted hierarchy — great for states/results)
 */
fun main() {
    println(describe(Result.Success(42)))
    println(describe(Result.Error("network")))
    println(describe(Result.Loading))

    val r: Result = Result.Success(10)
    when (r) {
        is Result.Success -> println("value = ${r.value}")
        is Result.Error -> println("msg = ${r.message}")
        Result.Loading -> println("loading...")
    }
}

sealed class Result {
    data class Success(val value: Int) : Result()
    data class Error(val message: String) : Result()
    data object Loading : Result()
}

fun describe(r: Result): String = when (r) {
    is Result.Success -> "OK: ${r.value}"
    is Result.Error -> "ERR: ${r.message}"
    Result.Loading -> "..."
}
