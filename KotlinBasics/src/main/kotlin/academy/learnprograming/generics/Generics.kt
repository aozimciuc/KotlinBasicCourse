package academy.learnprograming.generics

import java.math.BigDecimal

fun main() {
    val mutableList = mutableListOf("hello")
    mutableList.printCollection()

    val decimalList = mutableListOf(BigDecimal(33.5), BigDecimal(350.5), BigDecimal(3.5))
    decimalList.printCollection()

}

fun <T> Collection<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}
