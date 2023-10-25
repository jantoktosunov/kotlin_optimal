package lession3

open class Person {
    val age = 20
    public val name = "Michael"
    private val email = "michael@example.com"
    protected val familyname = "Mustermann"
    internal val id = 9941

    fun sayHello() {
        println("Hello")
    }
    public fun sayBye() {
        println("Bye")
    }
    private fun printFullName() {
        println("$name $familyname")
    }
    fun printFullData() {
        printFullName()
        println(age)
        println(email)
    }
}

fun main() {
    val person = Person()
    println(person.age)
    //println(person.email)
    //println(person.familyname)
    //println(person.printFullName())

    person.sayHello()
    person.sayBye()

    person.printFullData()

    val child = Child()
    child.printFamilyName()


}

class Child : Person() {
    fun printFamilyName() {
        println(familyname)
    }
}