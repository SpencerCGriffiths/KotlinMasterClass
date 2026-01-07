package org.example.s5_FunctionalProgramming

// Function that accepts other functions as an argument or produce a function
// Map, any, filter etc. are all higher order functions


fun main () {
    val list1 = List(size = 10) {it} // create a list of 10 numbers

    val moreThanTwo: (Int) -> Boolean = { it > 2 }

    println(list1.any(moreThanTwo)) // Here .any() takes another function, it is a higher order function

    repeat( times = 5) { index ->
        println(index)
    }
}