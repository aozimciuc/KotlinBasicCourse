package academy.learnprograming.accessmodifiers

val CONSTANT = 100

fun main() {
    val emp = Employee("John")
    println(emp.firstName)
    val emp1 = Employee("Bob", false)
    println("${emp1.firstName} ${emp1.fullTime}")

    val demo2 = Demo2("private field")


    val emp2 = Employee1("Alice")
    emp2.fullTime
    emp2.fullTime = false

    println("Constant value is: $CONSTANT")

    val car = Car("#ff0000", "VW", 2016)
    println("Data class: $car")
    val car1 = Car("#ff0000", "VW", 2016)
    println(car == car1)
    val car2 = car.copy(year = 2018)
    println(car2)
}

private class Employee constructor(val firstName: String, val fullTime: Boolean = true) {

}

private class Employee1 constructor(val firstName: String) {

    var fullTime: Boolean = true
        get() {
            println("Using custom get for: $field")
            return field
        }
        set(value) {
            println("Using custom setter for: $field")
            field = value
        }

    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }
}


private class Demo {
    val dummy: String

    init {
        dummy = "test"
    }
}

private class Demo1 {
    val dummy: String

    constructor() {
        dummy = "hello"
    }
}

private class Demo2(private var dummy: String) {}

data class Car(val color: String, val model: String, val year: Int) {}
