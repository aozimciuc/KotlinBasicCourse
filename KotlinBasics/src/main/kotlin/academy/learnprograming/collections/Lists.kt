package academy.learnprograming.collections

fun main() {

    val strings = listOf("one", "two", "three", "four", "five")
    val colorList = listOf("black", "white", "green")

    println("Last element of strings: ${strings.last()}")

    // asReversed(): This function returns a reversed view of the original list.
    // It does not create a new list, but instead provides a view of the original list in reverse order.
    // This means that changes to the original list will be reflected in the reversed view and vice versa.
    // This function is more memory-efficient if you don't need to modify the list, as it doesn't create a new list.
    println("Reversed strings as immutable reflection of original list: ${strings.asReversed()}")

    // reversed(): This function returns a new list that contains all elements of the original list in the reverse order.
    // This means that changes to the original list will not affect the reversed list and vice versa.
    // This function is less memory-efficient as it creates a new list.
    println("Original list deep copy with reversed elements: ${strings.reversed()}")

    println(strings.getOrElse(5) { "No value at index 5" })

    // Create pairs of elements from two lists
    println(colorList.zip(strings))

    // Concatenate two lists
    println(colorList + strings)

    // Union of two lists, removes duplicates. Order is preserved.
    println(colorList.union(strings))

    // Remove duplicates from the single list
    // distinct() returns a new list.
    println(colorList.distinct())

    val mutableList = strings.toMutableList()
    mutableList.add("lol")
    println(mutableList)

    // Group elements of the list by the length of the string.
    // Returns a map with the length of the string as the key and the list of strings as the value.
    println(strings.groupBy { it.length })
}
