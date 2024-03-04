package academy.learnprograming.challenge4

import kotlin.random.Random

fun main() {

    printFrom5To500()
    printFromMinus500To0()

    fibonacci(13)

    printNumbers()

    initializeVariable()
    initializeVariableWithWhen()

}

// Print numbers from 5 to 500 with step 5
fun printFrom5To500() {
    (5..500).step(5).forEach { print(it) }
}

//Print numbers form -500 to 0
fun printFromMinus500To0() {
    (-500..0).forEach { println(it) }
}

// Intialize a variable with a value based on a condition
fun initializeVariable() {
    val num = Random.nextInt()
    val dnum = (if (num > 100) {
        -234.567f
    } else if (num < 100) {
        4444.555f
    } else {
        0.0
    })
    println("Initialized by if condition: $dnum")
}

// Initialize a variable with a value based on a condition using when
fun initializeVariableWithWhen() {
    val num = Random.nextInt()
    val dnum = when {
        num > 100 -> -234.567f
        num < 100 -> 4444.555f
        else -> 0.0
    }
    println("Initialized by when condition: $dnum")
}

// Function to print fibonacci numbers using for loop.
// num - number of fibonacci numbers to print
fun fibonacci(num: Int) {
    var current = 0
    var previous = 1
    for (i in 1..num) {
        print("$current ")
        val sum = current + previous
        current = previous
        previous = sum
    }
}

/*
* Prints only 1, 11, 100, 99, 99, 98, 2
* */
fun printNumbers() {
    for (i in 1..5) {
        if (i > 2) {
            continue
        }
        println("i=$i")
        for (j in 11..20) {
            if (j > 11 || i > 1) {
                continue
            }
            println("j=$j")
            for (k in 100 downTo 90) {
                if (k < 98) {
                    continue
                }
                println("k=$k")
            }
        }
    }
}