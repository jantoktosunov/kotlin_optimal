package lession3

fun Int.square(): Int {
    return this * this
}

fun String.addText(a: String):String {
    return this + a;
}

fun main() {
    val number = 5 //Int

    val squared = number.square()
    println("The square of $number is $squared")
}