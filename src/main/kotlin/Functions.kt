fun main() {
    val number = addiereMitLambda(1, 10)
    println(number)
}

fun addiere(zahl1: Int, zahl2: Int): Int {
    return zahl1 + zahl2
}

val addiereMitLambda: (Int, Int) -> Int = { zahl1, zahl2 -> zahl1 + zahl2 }

