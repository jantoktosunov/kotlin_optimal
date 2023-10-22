open class Animal(val name: String, val age: Int) {
    open fun sprechen() {
        println("Das Tier macht Geräusche")
    }
}

class Dog(name: String, age: Int) : Animal(name, age) {
    override fun sprechen() {
        println("$name bellt")
    }
}

fun tierSpricht(animal: Animal) {
    animal.sprechen()
}

fun main() {
    val animal = Animal("Tier1", 10)
    val dog = Dog("Rex", 10)

    tierSpricht(animal)
    tierSpricht(dog)
}