class Customer {
    private var name: String = ""

    fun setName(neuerName: String) {
        name = neuerName
    }

    fun getName(): String {
        return name
    }
}

fun main() {
    val customer = Customer()
    customer.setName("Max")
    println(customer.getName())
}