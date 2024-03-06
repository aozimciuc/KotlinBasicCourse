package academy.learnprograming.collections

fun main() {

    val strings = listOf("one", "two", "three", "four", "five")
    println(strings.javaClass)

    val emptyList: List<String> = emptyList()
    println(emptyList.javaClass)

    if (emptyList.isNotEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("value1", "value2", null, "value3")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)
    println(mutableList.javaClass)

    val array = arrayOf("black", "white", "green")
    println(listOf(array))

    // initialize list using spread operator
    println(listOf(*array))

    val intArray = intArrayOf(1, 2, 3)
    println(intArray.toList())

}
