fun main() {
    val tag = "Info"

    when (tag) {
        "Debug" -> println("Dies ist eine Debug-Nachricht.")
        "Info" -> println("Dies ist eine Informationsnachricht.")
        "Warning" -> println("Dies ist eine Warnung.")
        "Error" -> println("Ein Fehler ist aufgetreten.")
        else -> println("Unbekannter Tag.")
    }
}