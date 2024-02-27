package academy.learnprograming.imports

import academy.learnprograming.inheritance.CompanyCommunications
import academy.learnprograming.inheritance.Department
import academy.learnprograming.inheritance.topLevelFunction as tp

fun main() {
    tp()
    println(CompanyCommunications.currentTimestamp)
    println(Department.IT.getDepartmentInfo())
}