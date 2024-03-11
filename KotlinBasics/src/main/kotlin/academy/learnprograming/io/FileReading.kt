package academy.learnprograming.io

import java.io.Reader
import kotlin.text.Charsets.UTF_8


fun main() {

    readTextFile()
}

@Suppress("unused")
fun readTextFile() {
    // read file as resource to memory
    val reader: Reader? =
        Thread.currentThread().contextClassLoader.getResourceAsStream("testfile.txt")?.reader(UTF_8)
    val linesReadLines: List<String>? = reader?.readLines()

    // check if reader is not null then close it
    reader?.close()

    // read the entire file to memory
    val reader1: Reader? =
        Thread.currentThread().contextClassLoader.getResourceAsStream("testfile.txt")?.reader(UTF_8)
    val textReadText: String? = reader1?.readText()
    reader1?.close()


    val textCloseable = Thread.currentThread().contextClassLoader.getResourceAsStream("testfile.txt")
        ?.reader(UTF_8)
        .use { it?.readText() }

    val textBufferedReader = Thread.currentThread().contextClassLoader.getResourceAsStream("testfile.txt")
        ?.bufferedReader(UTF_8)
        .use { it?.readText() }

    val textForEachLine = Thread.currentThread().contextClassLoader.getResourceAsStream("testfile.txt")
        ?.reader(UTF_8)
        ?.forEachLine { println(it) }
}