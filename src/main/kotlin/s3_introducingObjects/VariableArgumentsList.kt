package org.example.introducingObjects

/**
 * Always Use a list whenever possible
 * Only use array when required by 3rd party API.
 */

fun main() {

    val myArray = intArrayOf(6,8,9)

    // Cannot have another vararg parameter
    // vararg allows you to have any or none arguments, but all must be of the specified type.

    println(sum(1, 3, 5, 3))
    println(sum())
    // what is created is an array. Arrays are always mutable
    //println(sum(numbers = 1, 3, 5, 3)) <- Error
    println(sum(numbers = intArrayOf(1, 3, 5, 3, *myArray))) //<- works //* is a spread operator, it is spreading these values inside this array.


}

fun sum(vararg numbers: Int): Int {
    var total = 0

    for (n in numbers) {
        total += n
    }

    return total
}

