class Buch(val titel: String, val autor: String) {
    // Primärer Konstruktor
}

fun main() {
    val buch = Buch("Harry Potter", "J K Rowling");
    println(buch.titel)
    println(buch.autor)
}