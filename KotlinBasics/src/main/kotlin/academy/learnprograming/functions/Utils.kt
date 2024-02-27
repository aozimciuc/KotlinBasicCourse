package academy.learnprograming.functions

class Utils {
    fun upperFirstAndLast(str: String): String {
        val upperFirst = str.substring(0, 1).uppercase()
        val middle = str.substring(1, str.length - 1)
        val upperEnd = str.substring(str.length - 1, str.length).uppercase()
        return "$upperFirst$middle$upperEnd"
    }
}