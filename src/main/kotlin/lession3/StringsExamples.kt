package lession3


fun main() {
    val name = "Alice"
    val age = 30

    val message = "My name is $name and I am $age years old."
    println(message)

    println("My data is ${combineStrings(name, age)}")
}

fun combineStrings(name: String, age: Int) : String {
    return "$name $age"
}