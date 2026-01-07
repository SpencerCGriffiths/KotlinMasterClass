package org.example.ObjectOrientatedProgramming

// Objects

// Object keyword defines similar to a class
// Cannot create an instance it is singleton (only one)

object Singleton {
    // Cannot take parameters (constructors)
    fun printName() {
        println("Hi my name is Spencer")
    }
}

// Can add visibility modifiers
//e.g
private object SingletonPrivate { // Cannot access outside this file

}



fun main() {
    // Cannot be initialised so it is ready by default
    Singleton.printName() // Cannot be initialised so it is ready by default
}

object Counter {
    private var count: Int = 0
    fun currentCount() = count
    fun incrementCounter() {
        ++count
    }
}

fun increment() {
    Counter.incrementCounter() // Can access the instance of the counter
    // If called in other files still calls the same counter
}



// Inheritance is possible with objects:
open class oPerson(private var name: String) {
    open fun printName() {
        println("$name is $name")
    }
}

object oJohn : oPerson("John") {
    override fun printName() {
        super.printName()
    }
}


// Nested Objects are also possible:
object OuterObject {
    object NestedObject {

    }
}

class OuterClass {
    object NestedObject {

    }
}