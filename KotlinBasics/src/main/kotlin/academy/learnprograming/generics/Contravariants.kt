package academy.learnprograming.generics

fun main() {

    val flowerTender = object : FlowerCare<GardenFlower> { // contravariant, so it can be used with any Flower
        override fun prune(flower: GardenFlower) {
            when (flower) {
                is Chamomile -> println("I'm pruning a chamomile!")
                is Tulip -> println("I'm pruning a tulip!")
                else -> println("I'm pruning a flower!")
            }
        }
    }

    val chamomileTender = object : FlowerCare<Chamomile> {   // non-generic, so it can be used only with Chamomile
        override fun prune(flower: Chamomile) {
            println("I'm pruning a chamomile!")
        }
    }
    val chamomile = FlowerPlant(listOf(Chamomile("Monkey code"), Chamomile("Crocodile")), flowerTender)
    chamomile.tendFlower(0)

    val tulipGarden = FlowerPlant(listOf(Tulip("Bottle"), Tulip("Black tulip"), Tulip("Caterpillar")), flowerTender)
    tulipGarden.tendFlower(2)
}

class FlowerPlant<T : GardenFlower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int): T {
        return flowers[i]
    }

    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class GardenFlower(val name: String) {
}

class Chamomile(name: String) : GardenFlower(name) {
}

class Tulip(name: String) : GardenFlower(name) {
}

interface FlowerCare<in T> {  // in keyword makes T contravariant, the same as super in Java
    fun prune(flower: T)
//    fun pick(): T          // Dos not compile as producer cannot be in contravariant position (see PECS rule)
}
