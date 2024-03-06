package academy.learnprograming.challenge5

fun main() {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 60)

    val peopleFromArray: Map<String, Person> = listOf(joe, jane, mary, john, jean)
        .groupBy { it.lastName }.entries
        .associate { e -> Pair(e.key, e.value.first()) }

    val people: Map<String, Person> = mapOf(
        "Jones" to joe,
        "Smith" to jane,
        "Wilson" to mary,
        "Adams" to john,
        "Smithson" to jean
    )

    println("Last names starting with 'S': ${people.filter { it.value.lastName.startsWith("S") }.count()}")

    val pairs = people.map { e -> Pair(e.value.firstName, e.value.lastName) }
    println(pairs)

    people.also { e -> e.forEach { println("${it.value.firstName} is ${it.value.age} years old") } } // also does not change the original object like peek in Java

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    val list1 = listOf(4, 6, 3, 7, 2, 5, 9, 8, 1)
    val list2 = listOf(5, 6, 7, 9, 2, 1)

    val listIntersection = list1.intersect(list2)
        .also { println("Intersection of lists `list1` and `list1` with .intersect function: $it") }
    val listIntersection1 = list1.filter { list2.contains(it) }
        .also { println("Intersection of lists `list1` and `list1` with .filter function: $it") }

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper
}

//data class Person(val firstName: String, val lastName: String, val age: Int) { }

class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

class Box<out T> {}

open class Paper {}

class Regular : Paper() {}

class Premium : Paper() {}
