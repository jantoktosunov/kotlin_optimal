package lession3

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}


fun main() {
    val calculator = Calculator()

    val sum1 = calculator.add(5, 10)
    println("Sum of 5 and 10: $sum1")

    val sum2 = calculator.add(2.5, 3.7)
    println("Sum of 2.5 and 3.7: $sum2")

    val sum3 = calculator.add(1, 2, 3)
    println("Sum of 1, 2, and 3: $sum3")
}