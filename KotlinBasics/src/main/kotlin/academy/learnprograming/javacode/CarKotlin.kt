@file:JvmName("CarKotlinFile")

package academy.learnprograming.javacode

// @JvmField annotation is used to expose the field to Java
class CarKotlin(val model: String, val year: Int, @JvmField val color: String) {}

fun topLevelFunction() {
    println("I'm a top level function")
}

// extension function
fun String.printHello() {
    println("Hello $this")
}