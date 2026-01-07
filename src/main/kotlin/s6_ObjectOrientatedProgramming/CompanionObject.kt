package org.example.ObjectOrientatedProgramming

// Companion Object
// All functions and properties inside are all about the class


class Example {
    fun callMe() = "Calling a function"


    // everything declared in the companion object is available to the outer class
    // all the values outside the companion object are not accessible to it
    // you can only have a single companion object per class
    companion object {
        fun callMe2() = "Calling a function"
        val result = this // Refers to the inner companion object not the outer class
    }

    val result = callMe2() // Can access everything from inside the companion object

}

class Numbers {
    companion object {
        var number = 0
    }
    fun increment() {
        ++number
    }
}

fun main() {
    val example = Example()
    example.result

    // We can also call the methods functions etc. but just calling the class, it does not need to be instantiated.
    //e.g.
    // the default name is Companion, you can name it:
    Example.callMe2()
    Example.Companion.result

    val number1 = Numbers()
    val number2 = Numbers()
    number1.increment()
    number2.increment()
    number1.increment()
    // the variable from the companion object
    println(Numbers.number) //3
    // They all share the same companion Object (a singleton)
    // No matter how many classes they are all incrementing the same object

}