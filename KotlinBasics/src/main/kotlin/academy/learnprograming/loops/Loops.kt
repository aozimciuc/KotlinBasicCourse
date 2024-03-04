package academy.learnprograming.loops

fun main() {
    val range = 1..5
    range.forEach { println(it) }
    range.reversed().forEach { println(it) }
    range.step(2).forEach { println(it) }
    println(3 in range)

    val charRange = 'a'..'z'
    charRange.forEach { println(it) }

    val stringRange = "ABC".."XYZ"

    println("CCC" in stringRange)
    println("CBA" in stringRange)
    println("BA" in stringRange)
    println("BBBB" in stringRange)
    println("aaa" in stringRange)

    val backwardsRange = 5.downTo(1)
    backwardsRange.forEach { println(it) }

    val str = "Hello world"
    str.forEach { println(it) }

    for (i in 0..10 step 2) {
        print(i)
    }

    for (i in 20 downTo 5 step 3) {
        println(i)
    }

    for (i in 0 until 10) {
        print(i)
    }

    val seasons = arrayOf("spring", "boot", "data", "jpa")
    for (season in seasons) {
        println(season)
    }

    for (num in seasons.indices) {
        println(seasons[num])
    }

    seasons.forEachIndexed { index, value -> println("Season $index has value $value") }

    val notASeason = "kotlin" !in seasons
    println(notASeason)

    val notInRange = 299 !in 0..256
    println("Not in range $notInRange")

    loopName@ for (i in 0..100) {
        for (j in 0..10) {
            if (j % 5 == 0) {
                break@loopName
            }
        }
    }
}