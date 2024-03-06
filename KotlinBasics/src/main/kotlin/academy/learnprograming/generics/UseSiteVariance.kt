package academy.learnprograming.generics

fun main() {
    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)

    val fordList = mutableListOf(Ford(), Ford())
    val fordList2: MutableList<Ford> = mutableListOf()
    copyCars(fordList, fordList2)
    copyCars(fordList, cars2)
}

fun <T: Car> copyCars(source : MutableList<out T>, destination : MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Car {
}

class Ford : Car() {
}
