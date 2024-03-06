package academy.learnprograming.collections

fun main() {

    val immutableMap = mapOf(
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
        16 to Car("Cyan", "Mazda", 2014),
        8 to Car("Magenta", "Subaru", 2015),
        4 to Car("Maroon", "Jeep", 2016),
        9 to Car("Olive", "Dodge", 2017),
        1 to Car("Teal", "Nissan", 2018),
        12 to Car("Navy", "Kia", 2019),
        5 to Car("Indigo", "Volvo", 2020)
    )

    println(
        "Print color of all Ford cards: ${
            immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color }.toList()
        }"
    )

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filter: $it"); it[0] == 'J' }
        .map { println("map: $it"); it.uppercase() }
        .toList()

    // use sequence to avoid intermediate collections
    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filter sequence: $it"); it[0] == 'J' }
        .map { println("map sequence: $it"); it.uppercase() }
        .toList()

}
