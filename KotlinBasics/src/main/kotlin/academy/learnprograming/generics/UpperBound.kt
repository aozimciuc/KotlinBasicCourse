package academy.learnprograming.generics

fun main() {

    val intList = mutableListOf(1, 2, 3)
    val shortList: List<Short> = mutableListOf(10, 20, 30)
    val nullableShortList: List<Short?> = mutableListOf(10, 20, 30)
    val floatList: List<Float> = mutableListOf(50.0f, 60.0f, 70.0f)
    val stringList = mutableListOf("str1", "str2", "str3")

    convertToInt(intList)
    convertToInt(shortList)
    convertToInt(nullableShortList)
    convertToInt(floatList)

    println(append(StringBuilder("string1"), StringBuilder("string2")))

    printCollection(nullableShortList)
    printCollection(stringList)

    // check if the list is of type List<String> in compile time
    if (stringList is List<String>) {
        println("This list contains strings")
    }

    val listAny: List<Any> = listOf("str1", "str2", "str3")
    if (listAny is List<*>) {
        println("This list contains elements of any type")
    }

    if (listAny is List<*>) {
        println("This list contains strings")
        val strlList = listAny as List<String>
    }
}

fun <T> printCollection(collection: Collection<T>) {
    for (item in collection) {
        println(item)
    }
}

fun <T> append(item1: T, item2: T): T where T : CharSequence, T : Appendable {
    item1.append(item2)
    return item1
}

fun <T : Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println(num?.toInt())
    }
}
