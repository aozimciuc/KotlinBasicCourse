package academy.learnprograming.generics

fun main() {
    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    convertToInt(shortList)

}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection) {
        println(num.toInt())
    }
}

fun waterGarden(garden: Garden<Flower>) {  // Works with Garden<Flower> out of the box
    garden.flowers.forEach { println(it) }
}

fun tendRoseGarden(garden: Garden<Rose>) {  // No error with Garden<Rose> because of covariance
    waterGarden(garden)
    garden.pickFlowers(25)
}

open class Flower(val height: Int) {
    override fun toString(): String {
        return "Flower"
    }
}

class Garden<out T : Flower>(val flowers: List<T>) {  // out keyword makes T covariant
    fun pickFlowers(height: Int): List<T> {   // can use generic type T as return type
        println("I'm picking $flowers")
        return this.flowers.filter { it.height >= height }
    }

    // fun setName(flower: T) {               // Error: Type parameter T is declared as 'out' but occurs in 'in' position in type T.
    //  }                                     // Consumer cannot be in covariant position, see PECS rule
}

class Rose(height: Int, private val color: String) : Flower(height) {
    override fun toString(): String {
        return "Rose in color $color"
    }
}
