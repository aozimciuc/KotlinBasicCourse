package academy.learnprograming.io

import java.io.File
import java.io.FileInputStream

fun main() {
    val filePath = "README.md"
    readFileUsingFileInputStream(filePath)
}


fun readFileUsingFileInputStream(filePath: String) {
    val file = File(filePath)
    val fileInputStream = FileInputStream(file)

    // Use a buffer to read the contents of the file
    val buffer = ByteArray(file.length().toInt())
    fileInputStream.read(buffer)

    // Convert the byte array to a string and print it
    val fileContent = String(buffer)
    println(fileContent)

    // Always close the file input stream to release system resources
    fileInputStream.close()
}