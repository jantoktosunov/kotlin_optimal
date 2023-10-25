package lession3

data class Currency(val sign: Char, val name: String)


fun main() {
    val currency = Currency('$', "dollar")
    //val currencyText = currency.toString()
    //println(currency)

    val money = buildString {
        append("My money:")
        append(currency)
        append(1)
    }

    println(money)
}
//equals
//hashCOde
//copy