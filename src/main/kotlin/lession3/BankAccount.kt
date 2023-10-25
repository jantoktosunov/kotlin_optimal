package lession3

import java.awt.Point

class BankAccount (val balance: Double, val name: String) {
    init {
        println("Init: $balance $name")
    }

    constructor(balance: Double, name: String, isActive: Boolean) : this(balance, name) {
        println("Secondary constructor")
    }
}

fun main() {
    val sparkasseAccount = BankAccount(10000.00, "Carl")
    val dbAccount = BankAccount(1000.00, "Max Mueller", true)
}