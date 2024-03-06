package academy.learnprograming.collections

fun main() {

    // Create immutable set
    val immutableSet = setOf(1, 2, 3, 4, 5)
    println(immutableSet.javaClass) // class java.util.LinkedHashSet

    println("Add element 60: ${immutableSet.plus(60)}")
    println("Add duplicate element 3: ${immutableSet.plus(3)}")
    println("Remove element 3: ${immutableSet.minus(3)}")
    println("Original set was not changed: $immutableSet")

    println("Average of the set: ${immutableSet.average()}")
    println("Drop first 3 elements: ${immutableSet.drop(3)}")

    // Create mutable set
    val mutableSet = mutableSetOf(10, 20, 30, 40, 50, 60)
    println(mutableSet.javaClass) // class java.util.LinkedHashSet
    mutableSet.plus(70)
    println("Plus does not change the original set: $mutableSet")
    mutableSet.add(70)
    println("Element 70 has been added: $mutableSet")

    println("Intersection of two sets: ${immutableSet.intersect(mutableSet)}")
    println("Union of two sets: ${immutableSet.union(mutableSet)}")
    println("Subtracting one set from another: ${immutableSet.subtract(mutableSet)}")
    println("Subtracting one set from another: ${mutableSet.subtract(immutableSet)}")

    val hashSet = hashSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(hashSet.javaClass) // class java.util.HashSet
}
