package org.example.introducingObjects

fun main() {
    val numbers1 = listOf<Int>(1,2,3,4,5) // This shows us declaring the type for the list as well as the list itself
    val numbers2 = listOf(1,2,3,4,5) // But the type can be inferred

    println(numbers1) //[1, 2, 3, 4, 5]
    println(numbers2) //[1, 2, 3, 4, 5]

    // Everything is 0 indexed
    println(numbers1[0])
    println(numbers2[2])

    // Some functions are available for list type
    println(numbers1.first()) // 1
    println(numbers2.last()) // 5
    println(numbers2.take(n= 3)) // [1, 2, 3]

    val numbers3 = listOf(1,2,1,3,1)
    println(countOccurrences(numbers3,1))

    //numbers3 += 1 // Not possible as not a mutable list

    val numbers4 = mutableListOf(1,2,3)
    println(numbers4)
    numbers4.addAll(listOf(4,5,6))
    println(numbers4)
    numbers4.add(7)
    println(numbers4)
    numbers4.remove(7)
    println(numbers4)
    numbers4.removeAt(0)
    println(numbers4)
    numbers4.clear()
    println(numbers4)

    val numbers5: List<Int> = mutableListOf<Int>(1,2,3,4,5) // A mutable List can be returned as a type list
//    val numbers6: MutableList<Int> = listOf(1,2,3,4,5) // A list can not be returned as a type of immutable list.

    var myList = listOf(1,2,3,4,5)
    print(myList)
    myList += 4 // creates a new list rather than change the list. You cannot change a immutable list
    print(myList)

}

fun countOccurrences(list: List<Int>, number: Int): Int {
    var occurrences = 0

    for (e in list) {
        if (number == e) {

        occurrences ++
        }
    }
    return occurrences
}


