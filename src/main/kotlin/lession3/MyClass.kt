package lession3

class MyClass {
    companion object {
        val someConstant = 42
        fun calculate(a: Int, b: Int): Int {
            return a + b
        }
        fun createInstance(): MyClass {
            return MyClass()
        }
    }

    fun instanceMethod() {
        println("This is an instance method")
    }
}

fun main() {
    var myclass = MyClass.createInstance()
    println(MyClass.someConstant)
    val a = MyClass()
    //print(a.calculate(10, 20))
}