package academy.learnprograming.datatypes

@Suppress("UNUSED_VARIABLE")
fun main() {
    val myInt = 5
    println("myInt is Int: ${myInt is Int}")

    var myLong = 10L
    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    val myDouble = 10.33
    println("myDouble is Double: ${myDouble is Double}")

    val myFloat = 15.15f

    val myChar = 'a'
    val anotherChar = (65).toChar()
    println("anotherChar is Char: ${anotherChar is Char} '$anotherChar'")

    val myBoolean = true
    val dummy = Dummy()
    println(dummy.call(myBoolean))

    val void = callVoid()

    println(void)

    val names = arrayOf("Name1", "Name2", "name3")
    println("names is Array of String: ${names is Array<String>}")

    val longs: Array<Long> = arrayOf(1, 2, 3, 4)

    val evenNumbers = Array(5) { i -> i * 2 }
        .map { i -> i + 1024 }
        .forEach { e -> println(e) }

    val intArray = IntArray(5)
    intArray.map { i -> i + 1 }
    dummy.printInts(intArray)

    val typedArray: Array<Int> = intArray.toTypedArray()
}

fun callVoid(): Unit {
    // no-op
}

fun callInfiniteLoop() { // return Nothing
    // no-op
}

