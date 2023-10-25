package lession3

fun main() {
    // Creating a Set
    val colors = setOf("red", "green", "blue", "red") // Duplicate "red" is removed

    // Accessing elements in a Set
    println("Colors: $colors")


    // Creating a MutableSet
    val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "apple")

    println(fruits)
    // Adding elements to the MutableSet
    fruits.add("date")
    fruits.addAll(setOf("elderberry", "fig"))

    // Removing elements
    fruits.remove("banana")
    fruits.removeAll(setOf("apple", "cherry"))

    // Clearing the MutableSet
    fruits.clear()

    // Iterating over elements in a MutableSet
    fruits.forEach { fruit ->
        println("Fruit: $fruit")
    }

}