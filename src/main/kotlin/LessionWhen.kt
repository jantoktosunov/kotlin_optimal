fun main() {
    val tag = "Info"

    when (tag) {
        "Debug" -> println("Dies ist eine Debug-Nachricht.")
        "Info" -> println("Dies ist eine Informationsnachricht.")
        "Warning" -> println("Dies ist eine Warnung.")
        "Error" -> println("Ein Fehler ist aufgetreten.")
        else -> println("Unbekannter Tag.")

    }


    whenWith(3)
    whenWith(5)
    whenWith(1000)
}

fun whenWith(zahl: Int) {
    //val zahl = 3

    val text = when (zahl) {
        in 1..3 -> "Die Zahl liegt zwischen 1 und 3."
        4, 5 -> "Die Zahl ist entweder 4 oder 5."
        else -> "Die Zahl ist außerhalb des erwarteten Bereichs."
    }

    println(text)
}