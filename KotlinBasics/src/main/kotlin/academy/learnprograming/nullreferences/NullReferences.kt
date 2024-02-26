package academy.learnprograming.nullreferences

class NullReferences {
}

fun main() {

    val myStr: String? = null
    myStr?.let { printText(it) }  // idiomatic way to call function safely
//    val anotherString = myStr!!    // throws an exception at runtime
    myStr?.lowercase()

    val anotherString = "Another string"

    println(myStr == anotherString)

    val nulls = arrayOfNulls<Int>(5)
    nulls.forEach { e -> println(e) }

    println(nulls.get(2).toString())

    val strings: Array<String> = arrayOf()

}

fun printText(text: String) {
    println(text)
}
