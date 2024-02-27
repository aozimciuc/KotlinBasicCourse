package academy.learnprograming.challenge2

import academy.learnprograming.functions.upperFirstAndLast

@Suppress("UNUSED_VARIABLE")
fun main() {
    val floatVar = -3847.384f
    val floatVar1: Float = -3847.384f

    val floatVar2: Float? = -3847.384f

    val shorts = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray1 = Array(5) { i -> i + 1 }.map { i -> i.toShort() }

    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }

    val charArray = charArrayOf('a', 'b', 'c')
    val x: String? = "I AM UPPERCASE"
    val lowercase = x?.lowercase() ?: "I'm give up"

    val y: String? = "I AM UPPERCASE"
    println(y?.upperFirstAndLast())

    val lowercase1 = y?.let { it.replace("i am", "I'm not").lowercase() }

    val notNullVar: Int? = null
    notNullVar!!.toDouble()
}
