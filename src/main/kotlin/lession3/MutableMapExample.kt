package lession3

fun main() {
    // Creating a MutableMap
    val fruits: MutableMap<String, Int> = mutableMapOf(
        "apple" to 3,
        "banana" to 5,
        "cherry" to 8
    )

    // Adding and modifying key-value pairs
    fruits["strawberry"] = 6 // Add a new fruit
    fruits["banana"] = 1 // Update the quantity of bananas

// Removing key-value pairs
    fruits.remove("apple") // Remove the entry for "apple"

// Clearing the MutableMap
    //fruits.clear()

// Iterating over key-value pairs in a MutableMap
    fruits.forEach { (fruit, quantity) ->
        println("Fruit: $fruit, Quantity: $quantity")
    }
}

