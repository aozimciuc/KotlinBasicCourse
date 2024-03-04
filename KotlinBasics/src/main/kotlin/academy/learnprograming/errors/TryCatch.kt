package academy.learnprograming.errors

fun main() {
    println("123".asInt())
    println("123f".asInt())
//    println("Cannot parse as Int".asInt() ?: throw IllegalArgumentException("Invalid"))
    println("NaN".asInt() ?: "Cannot parse as Int")

    notImplementedYet("Value")
}

fun String.asInt(): Int? {
    return try {
        Integer.parseInt(this)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("String was converted to Int")
    }
}

fun notImplementedYet(value: String): Nothing {
    throw IllegalArgumentException(value)
}