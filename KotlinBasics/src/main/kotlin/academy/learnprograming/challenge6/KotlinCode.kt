package academy.learnprograming.challenge6

fun sayHello(name: String) {
    println("Hello $name")
}

object Challenge {
    @JvmStatic
    fun doMath(x: Int, y: Int) {
        println("x + y = ${x + y}")
        println("x - y = ${x - y}")
    }
}

public object Challenge1 {
    fun doMath(x: Int, y: Int) {
        println("x + y = ${x + y}")
        println("x - y = ${x - y}")
    }
}

@Suppress("unused")
class EmployeeKotlin(val firstName: String, var lastName: String, @JvmField var startYear: Int, var salary: IntArray) {

    @JvmOverloads
    fun takesDefault(param1: String, param2: String = "Default value") {
        println("$param1 and $param2")
    }
}

class EmployeeKotlin1(val firstName: String, var lastName: String, var startYear: Int, var salary: IntArray) {

    fun takesDefault(param1: String?, param2: String? = "Default value") {
        println("$param1 and $param2")
    }
}
