abstract class Form {
    abstract fun berechneFläche(): Double
}
abstract class Formel {
    abstract fun berechneFläche(): Double
}

// Konkrete Klasse, die von der abstrakten Klasse erbt
class Kreis(val radius: Double) : Form() {
    override fun berechneFläche(): Double {
        return 3.14 * radius * radius
    }
}

fun main() {
    val circle = Kreis(10.00)
    println(circle.berechneFläche())
}