package academy.learnprograming.collections

fun main() {

    val immutableMap: Map<Int, Car> = mapOf(1 to Car("green", "Toyota", 2015), 2 to Car("red", "Ford", 2016))
    println(immutableMap.javaClass) // class java.util.LinkedHashMap
    println(immutableMap)

    val mutableMap = mutableMapOf("Jane" to Car("green", "Toyota", 2015), "John" to Car("red", "Ford", 2016))
    println(mutableMap.javaClass) // the same as java.util.LinkedHashMap
    println(mutableMap)

    val mutableMapHashMap = hashMapOf("Mary" to Car("green", "Toyota", 2015), "Elena" to Car("red", "Ford", 2016))
    println(mutableMapHashMap.javaClass) // class java.util.HashMap
    println(mutableMapHashMap)

    // distribute key/value to different variables
    for ((key, value) in mutableMap) {
        println(key)
        println(value)
    }

    // as Pair class is a data class it has component1() and component2() functions
    val colorRed = Pair("red", "#FF0000")
    // distribute colorRed values to different variables
    val (colorName, colorValue) = colorRed
    println("$colorName: $colorValue")

    // as Car class is a data class it has component1(), component2() and component3() functions
    val car = Car("metallic", "Toyota", 2015)
    val (color, model, year) = car
    println("color: $color, model: $model, year: $year") // color: metallic, model: Toyota, year: 2015

    // as CarImproved class has component1(), component2() and component3() functions
    val carImproved = CarImproved("metallic", "Toyota", 2015)
    val (color1, model1, year1) = carImproved
    println("color: $color1, model: $model1, year: $year1") // color: metallic, model: Toyota, year: 2015

}

data class Car(val color: String, val model: String, val year: Int)

class CarImproved(private val color: String, private val model: String, private val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}
