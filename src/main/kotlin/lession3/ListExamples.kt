package lession3

fun main() {
    val immutableList = listOf("apple", "banana", "cherry")

    // Accessing elements
    val firstFruit = immutableList[0]
    val lastFruit = immutableList.last()

    // Trying to modify the list will result in a compilation error
    //immutableList.add("date")

    val mutableList = mutableListOf("apple", "banana", "cherry")

    // Accessing elements
    val first = mutableList[0]
    val last = mutableList.last()

    // Modifying the list
    mutableList.add("date")
    mutableList[1] = "blueberry"
    // The list is now ["apple", "blueberry", "cherry", "date"]
}