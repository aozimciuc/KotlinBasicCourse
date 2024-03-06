package academy.learnprograming.lambdas

fun main() {

    run { println("I'm in a lambda!") }

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    println("The oldest employee is ${employees.minBy { e -> e.startYear }}")
    println("The oldest employee is ${employees.minBy { it.startYear }}")
    println("The oldest employee is ${employees.minBy(Employee::startYear)}")

    // run enclosing lambda function with run
    var num = 123
    run {
        num += 1
        println(num)
    }

    // run top level function
    run { topLevelFunction() }
    run(::topLevelFunction)

    println(countTo100())
    println(countTo100WithLambda())

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Doe")

    println(findByLastNameWithLambda(employees, "Wilson"))
    println(findByLastNameWithLambda(employees, "Doe"))

    println("Find the existing employee: ${findByLastNameWithLambdaAndReturn(employees, "Wilson")}")
    println("Find the existing employee: ${findByLastNameWithLambdaAndReturn(employees, "Doe")}")

    "Parent String".apply SomeString@{
        "Child String".apply {
            println(this@SomeString.lowercase())
            println(this.uppercase())
        }
    }
}

class Employee(val firstName: String, val lastName: String, val startYear: Int) {
    override fun toString(): String {
        return "Employee(firstName='$firstName', lastName='$lastName', startYear=$startYear)"
    }
}

fun topLevelFunction() = println("I'm in a top level function!")

// return string with numbers from 0 to 100, divided by commas
fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 0..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    return numbers.toString()
}

// return string with numbers from 0 to 100, divided by commas using lambda
fun countTo100WithLambda() = with(StringBuilder()) {
    for (i in 0..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

// return string with numbers from 0 to 100, divided by commas using lambda with apply
fun countTo100WithApply() = StringBuilder().apply {
    for (i in 0..99) {
        append(i)
        append(", ")
    }
    append(100)
}.toString()

// Find employee in the list by the last name
fun findByLastName(employees: List<Employee>, lastName: String) {
    for (employee in employees) {
        if (employee.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return
        }
    }
    println("No, there's no employee with the last name $lastName")
}

// Find employee in the list by the last name using lambda
fun findByLastNameWithLambda(employees: List<Employee>, lastName: String): Employee? {
    employees.forEach {
        if (it.lastName == lastName) {
            return it
        }
    }
    return null
}

// Find employee in the list by the last name using lambda with return block
fun findByLastNameWithLambdaAndReturn(employees: List<Employee>, lastName: String): Employee? {
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            return@returnBlock
        }
    }
    return null
}
