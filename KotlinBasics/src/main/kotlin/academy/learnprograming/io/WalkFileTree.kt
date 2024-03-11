package academy.learnprograming.io

import java.io.File

fun main() {
    // return Sequence of all files in the directory
    val fileTree = File(".").walkTopDown()

    // list all kotlin files
    File(".").walkBottomUp()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }
}
