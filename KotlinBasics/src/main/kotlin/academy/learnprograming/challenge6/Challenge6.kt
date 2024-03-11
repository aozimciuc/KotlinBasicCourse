package academy.learnprograming.challenge6

fun main() {
    val employee = EmployeeKotlin("Jane", "Smith", 2000, IntArray(3) { 0 })
    employee.lastName = "Jones"

    // copy elements from an array to the salary property
    System.arraycopy(arrayOf(1000, 1200, 1300).toIntArray(), 0, employee.salary, 0, 3)
}