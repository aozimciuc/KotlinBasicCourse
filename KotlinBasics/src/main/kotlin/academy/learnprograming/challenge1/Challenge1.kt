package academy.learnprograming.challenge1


fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"
    println("Check if both variables are equal: ${hello1 == hello2}")
    println(
        if (hello1 === hello2) "Variables references are the same"
        else "Variables refer to the different places"
    )

    // Declare mutable variable
    var number = 123
    number++
    assert(number == 124)
    ++number
    assert(number == 125)

    val obj = getAny()
    if (obj is String) {
        println(obj.uppercase())
    } else {
        println(obj.toString())
    }

    println(
        """
       |   1
       |  11
       | 111
       |1111
    """.trimMargin("|")
    )

    println("""|   1|  11| 111|1111""".replace("|", "\n|").trimMargin("|"))
}

fun getAny(): Any {
    val objects = listOf(
        "The type is the root of the Kotlin class hierarchy",
        mapOf("key" to "value"),
        setOf("value", "value1", "value2")
    )
    return objects.random()
}