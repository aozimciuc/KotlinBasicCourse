package academy.learnprograming.functions

fun main() {
    println(labelMultiply(2, 4, "The result is:"))

    val emp = Employee("Name")
    println(emp.upperCaseName())

    println(labelMultiply(label = "Result:", operand1 = 2, operand2 = 3))
    val car1 = Car("red", "Toyota")
    val car2 = Car("blue", "Ford")
    printColors(str = "Colors:", car1, car2)
    printColors("Colors:", car1, car2)
    val cars = arrayOf(car1, car2)
    printColors("Colors:", *cars)

    println(Utils().upperFirstAndLast("this is all in lower case"))
    println("this is another string".upperFirstAndLast())

    callInlineBlock(str = "Call inline function:", block = { println("This is inside the block") })

}

fun run() = 3 * 6

fun labelMultiply(operand1: Int, operand2: Int, label: String) = "$label ${operand1 * operand2}"

class Employee(val firstName: String) {
    fun upperCaseName() = firstName.uppercase()
}

data class Car(val color: String, val model: String)

fun printColors(str: String, vararg cars: Car) {
    println(str)
    for (car in cars) {
        println(car.color)
    }
}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).uppercase()
    val middle = substring(1, length - 1)
    val upperEnd = substring(length - 1, length).uppercase()
    return "$upperFirst$middle$upperEnd"
}

inline fun callInlineBlock(block: () -> Unit, str: String) {
    println(str)
    println("Before block")
    block()
    println("After block")
}
