package academy.learnprograming.collections

fun main() {

    val intSet = setOf(5, 6, 8, 78, 9, 12, 45)
    // filter odd numbers
    println(intSet.filter { it % 2 != 0 })


    val immutableMap = mapOf(1 to Car("green", "Toyota", 2015), 2 to Car("red", "Ford", 2016))
    //filter cars with red color
    println(immutableMap.filter { it.value.color == "red" })

    println("Print year of every car: ${immutableMap.map { it.value.year }}")

    val mutableMap = mutableMapOf(
        2 to Car("Red", "Toyota", 2001),
        5 to Car("Blue", "Honda", 2002),
        3 to Car("Green", "Ford", 2003),
        12 to Car("Black", "Chevrolet", 2004),
        8 to Car("White", "BMW", 2005),
        24 to Car("Silver", "Mercedes", 2006),
        12 to Car("Yellow", "Ferrari", 2007),
        4 to Car("Orange", "Lamborghini", 2008),
        11 to Car("Purple", "Porsche", 2009),
        1 to Car("Brown", "Audi", 2010),
        8 to Car("Pink", "Volkswagen", 2011),
        5 to Car("Gray", "Hyundai", 2012),
        7 to Car("Gold", "Lexus", 2013),
        16 to Car("Black", "Mazda", 2014),
        8 to Car("White", "Subaru", 2015),
        4 to Car("Maroon", "Jeep", 2016),
        9 to Car("Olive", "Dodge", 2017),
        1 to Car("Orange", "Nissan", 2018),
        12 to Car("White", "Kia", 2019),
        5 to Car("Indigo", "Volvo", 2020)
    )

    println("Red cars: ${mutableMap.filter { it.value.color.uppercase() == "RED" }}")
    println(
        "Print model of every red car: ${
            mutableMap.filter { it.value.color.uppercase() == "RED" }.map { it.value.model }
        }"
    )

    println("Group cars by color to map with a color as key and record count as value: ")
    println(mutableMap.values.groupingBy { it.color }.eachCount())

    //  Summarize cars by color
    println(
        mutableMap.entries
            .groupBy(keySelector = { it.value.color }, valueTransform = { it.key })
            .map { entry -> entry.key to entry.value.reduce { acc, i -> acc + i } }
    )

    println("Check if there is a car with a Brown color: ${mutableMap.any { it.value.color == "Brown" }}")
    println("Check if there is a car with a Red color: ${mutableMap.any { it.value.color == "Red" }}")
    println("Count cars with a white color: ${mutableMap.count { it.value.color == "White" }}")
    println("Find the first car with color White: ${mutableMap.values.find { it.color == "White" }}")

    // sorted by year
    println(mutableMap.toSortedMap().entries.sortedBy { it.value.year }.map { it.value.year })


    val ints = arrayOf(1, 5, 8, 9, 74, 4)
    val mutableList: MutableList<Int> = mutableListOf()
    ints.forEach { mutableList.add(it) }
    println("Print mutable list of integers: $mutableList")

    mutableList.clear()

    ints.forEach { mutableList.add(it * 10) }
    println("Print mutable list of integers multiplied by 10: $mutableList")

}
