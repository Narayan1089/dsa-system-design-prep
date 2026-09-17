/**
 * Week 2 — 01 Classes, properties, constructors
 */
fun main() {
    val dog = Dog("Rex", 3)
    dog.speak()
    println(dog.describe())

    val acc = BankAccount("Narayan", 100.0)
    acc.deposit(50.0)
    println("balance = ${acc.balance}")
}

class Dog(private val name: String, var age: Int) {
    fun speak() = println("$name says woof")

    fun describe(): String = "$name is $age years old"
}

class BankAccount(val owner: String, balance: Double) {
    var balance: Double = balance
        private set

    fun deposit(amount: Double) {
        if (amount > 0) balance += amount
    }
}
