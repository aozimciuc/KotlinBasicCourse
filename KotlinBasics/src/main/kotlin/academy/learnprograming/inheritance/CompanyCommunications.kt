package academy.learnprograming.inheritance

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset

fun main() {
    println(CompanyCommunications.currentTimestamp)
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyright())
    println(CompanyCommunications.currentTimestamp)
    print(CompanyCommunications.getVersion())

    println(SomeClass.accessPrivateVar())
    println(SomeClass.justAssign("this is the string"))
    println(SomeClass.upperOrLowerCase("this is the string", true).toString())

    var mutableVar = 1

    wantsSomeInterface(object : MySubInterface {
        override fun mySubFunction(str: String): String {
            TODO("Not yet implemented")
        }

        override fun mustImplement(num: Int): String {
            mutableVar++
            return "This is from mustImplement ${num * 100}"
        }

        override val number: Int
            get() = TODO("Not yet implemented")

        override fun myFunction(str: String): String {
            TODO("Not yet implemented")
        }
    })

    assert(mutableVar == 2)

    Department.entries.forEach {
        println(it.ordinal)
        println(it.getDepartmentInfo())
    }
}

object CompanyCommunications {

    val currentTimestamp: Instant = LocalDateTime.now().toInstant(ZoneOffset.UTC)

    fun getTagLine() = "Tag line"

    fun getCopyright() = "Copyright. All rights reserved"

    internal fun getVersion() = "1.0-SNAPSHOT"
}

class SomeClass private constructor(var value: String) {

    private val privateVar = 6

    companion object {
        private const val privateVar = 5

        fun accessPrivateVar() = "Access privateVar: $privateVar"

        fun justAssign(str: String): SomeClass {
            return SomeClass(str)
        }

        fun upperOrLowerCase(str: String, isUpper: Boolean): SomeClass {
            if (isUpper) {
                return SomeClass(str.uppercase())
            }
            return SomeClass(str.lowercase())
        }
    }

    fun accessPrivateVar() {
        println("Accessing privateVar: $privateVar")
    }

    override fun toString(): String {
        return value
    }
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human resources", 3),
    IT("information technologies", 2),
    ACCOUNTING("Accounting", 4),
    SALES("Sales", 10);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"
}

fun topLevelFunction() = println("Top level function")
