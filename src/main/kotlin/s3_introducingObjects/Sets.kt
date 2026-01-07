package org.example.introducingObjects

// Sets are an unordered collection of elements without duplicates

fun main() {
    val mySet = setOf(1,2,2,3,3,4,6,4)
    println(mySet) //[1, 2, 3, 4, 6] <- does not support duplicates

    println(mySet.contains(element = 2)) //true

    println(2 in mySet) //true

    println(mySet.containsAll(elements = setOf(1,3,6))) //true

    println(mySet.containsAll(elements = setOf(1,3,5))) //false

    println(mySet subtract setOf(6,11)) //[1, 2, 3, 4] // Uses infix function {command click subtract} so does not require dot notation, check later notes

    println(mySet intersect setOf(6,11)) //[6]

    println(mySet union setOf(6,11)) //[1, 2, 3, 4, 6, 11]

    val myList = listOf(1,2,2,3,3,4,6,4) // Immutable
    val myList2 = mutableListOf(1,2,2,3,3,4,6,4) // Mutable

    println(myList) //[1, 2, 2, 3, 3, 4, 6, 4]

    println(myList.toSet()) //[1, 2, 3, 4, 6] // Converts to a Set

    println(myList.distinct()) //[1, 2, 3, 4, 6] // Just removes duplicates

}