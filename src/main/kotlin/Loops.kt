class Loops {
}

fun main() {
    testWithDoWhile()
}
fun testFor() {
    val numbers = listOf(1, 2, 3, 4, 5)

    for (number in numbers) {
        println(number)
    }
}

fun testWhile() {
    var zahl = 1

    while (zahl <= 5) {
        println(zahl)
        zahl++
    }
}

fun testWithDoWhile() {
    var zahl = 1

    do {
        println("Zahl: $zahl")
        zahl++
    } while (zahl < 1)
}

fun forWithBreak() {
    for (i in 1..5) {
        if (i == 3) {
            break  // Beende die Schleife, wenn i gleich 3 ist
        }
        println(i)
    }
}

fun forWithContinue() {
    for (i in 1..5) {
        if (i == 3) {
            continue  // Überspringe den Schleifendurchlauf, wenn i gleich 3 ist
        }
        println(i)
    }
}