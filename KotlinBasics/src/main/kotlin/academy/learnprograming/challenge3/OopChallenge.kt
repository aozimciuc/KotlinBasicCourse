package academy.learnprograming.challenge3

const val DEFAULT_GEAR: Int = 10

fun main() {
    val bicycle = KotlinBicycle(cadence = 10, gear = 5, speed = 3)
    bicycle.printDescription()

    val mountBike = KotlinMountBike(seatHeight = 50, cadence = 5, gear = 18, speed = 8)
    mountBike.printDescription()

    val roadBike = KotlinRoadBike(tireWidth = 3, cadence = 8, gear = 5, speed = 6)
    roadBike.printDescription()

    val bicycle1 = KotlinBicycle(cadence = 10, speed = 3)
    bicycle1.printDescription()

    val mountBike1 = KotlinMountBike(50, 5, 8)
    mountBike1.printDescription()

    val roadBike1 = KotlinRoadBike(3, 8, 6)
    roadBike1.printDescription()

    val mountBike2 = KotlinMountBike("Black", 50, 5, 8)
    mountBike2.printDescription()

    KotlinMountBike.availableColor.forEach { println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = DEFAULT_GEAR) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

class KotlinMountBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = DEFAULT_GEAR) :
    KotlinBicycle(cadence, gear, speed) {

    companion object {
        val availableColor: List<String> = listOf("black", "red", "green")
    }

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = DEFAULT_GEAR) : this(
        seatHeight,
        cadence,
        speed,
        gear
    ) {
        assert(availableColor.contains(color))
        println("Initialized in color $color")
    }

    override fun printDescription() {
        super.printDescription()
        println("Mount bike has seat height $seatHeight")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = DEFAULT_GEAR) :
    KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("Road bike has tyre width $tireWidth")
    }
}
