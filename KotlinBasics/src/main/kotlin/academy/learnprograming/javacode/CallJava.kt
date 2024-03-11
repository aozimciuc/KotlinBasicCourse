package academy.learnprograming.javacode

@Suppress("unused")
fun main() {

    val carJava = CarJava(null, null, null)

    // cannot set null to a non-null type
    try {
        carJava.model = null
    } catch (e: Exception) {
        println("Cannot set null to non-nullable field $e")
    }
    // @Nullable allows to set null
    carJava.color = null

    try {
        var model: String = carJava.model
        println(model)
    } catch (e: Exception) {
        println("Non-nullable field cannot be null $e")
    }

    // @Nullable allows to get null
    val year: Int? = carJava.year

    // call varargs method
    carJava.variableMethod("string1", "string2", "string3")
    val array = listOf("string1", "string2", "string3").toTypedArray()
    carJava.variableMethod(*array)
    carJava.intArrayMethod(arrayOf(1, 2, 3, 4, 5).toIntArray())

    println("Access to static field of java object ${CarJava.TOYOTA}")
    println("Access to static field of java object ${CarJava.getStaticValue()}")

    carJava.runThread { println("I run the thread") }

}

