package lession3

fun main() {
    // Creating a Map
    val countries = mapOf(
        "US" to "United States",
        "CA" to "Canada",
        "MX" to "Mexico"
    )

    // Accessing values in a Map
    val usCountry = countries["US"] // "United States"
    val unknownCountry = countries["UK"] // null

    println("$usCountry, $unknownCountry")
}