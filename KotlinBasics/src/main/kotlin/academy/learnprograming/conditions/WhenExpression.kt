package academy.learnprograming.conditions

import java.math.BigDecimal

fun main() {
    val num = 120
    val x = 99

    when (num) {
        in 100..199 -> println("in range 100 - 199")
        200 + x -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }
    val var1: Any = BigDecimal.valueOf(123, 55)

    when (var1) {
        is String -> println(var1.uppercase())
        is BigDecimal -> println(var1.negate())
    }

    val value = when (var1) {
        is String -> var1.uppercase()
        is BigDecimal -> var1.negate()
        else -> "NaN"
    }
    println(value)

    val s = Season.SPRING
    println(
        when (s) {
            Season.AUTUMN -> "Warm"
            Season.SUMMER -> "Mosquito"
            Season.WINTER -> "Birthday"
            Season.SPRING -> "Eastern"
        }
    )

    val num1 = 50
    println(
        when {
            num < num1 -> "Num < num2"
            num > num1 -> "Num > num2"
            else -> "Num probably is equal num2"
        }
    )

}

enum class Season {
    WINTER, SPRING, SUMMER, AUTUMN;
}