package academy.learnprograming.inheritance

import java.math.BigDecimal

fun main() {
    val laserPrinter = LaserPrinter("HP", 6)
    laserPrinter.printModelName();
    println(laserPrinter.bestSellingPrice())

    Something("test")
    SomethingElse("value")


}

abstract class Printer(val modelName: String) {
    open fun printModelName() = println(modelName)

    abstract fun bestSellingPrice(): BigDecimal
}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {
    final override fun printModelName() {
        println("Model name: $modelName")
    }

    override fun bestSellingPrice(): BigDecimal {
        return BigDecimal(100.500)
    }

}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {

    override fun bestSellingPrice(): BigDecimal {
        return BigDecimal(123.45)
    }
}

open class Something() : MySubInterface {
    var someProperty: String = "Default value"
    override var number: Int = 10

    constructor(someProperty: String) : this() {
        this.someProperty = someProperty
        println("Parent secondary constructor")
    }

    override fun mySubFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun mustImplement(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse : Something {
    constructor(someProperty: String) : super(someProperty) {
        println("Child primary constructor")
    }
}

interface MyInterface {
    val number: Int
    val number1: Int
        get() {
            return number * 404
        }

    fun myFunction(str: String): String

}

interface MySubInterface : MyInterface {

    fun mySubFunction(str: String): String

    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: MySubInterface) {
    println("Println from wantsSomeInterface: ${si.mustImplement(123)}")
}