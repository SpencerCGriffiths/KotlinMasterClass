package org.example.ObjectOrientatedProgramming

fun main() {
    val otis = Dog()
    val fluffy = Cat("White") //<- using the override
}
// Declaring an Interface
// Interface does not have a constructor

interface Animal {
//    val colour: String = "black" //<- this shows an error, you cannot directly declare the value

    val colour: String
        get() = "Black" // <- here you can specify what the get achieves which in theory sets a default value

    val legs: Int
    fun speak(): String

    fun walk(): Int { // This is a concrete function -> does not need to be implemented in the classes
        var steps = 0
        for (step in 0 .. 20 step 2) {
            steps += step
        }
        return steps
    }
}

// Create a class that will implement the interface
// The values have to be implemented in a class and make the members concrete

class Dog : Animal { // <- Similar to extending a class in Scala
    override val legs: Int = 4
    override fun speak(): String {
        return "Woof"
    }
}

class Cat(override val colour: String) : Animal {
    override val legs: Int = 4
    override fun speak(): String {
        return "Meow"
    }
    override fun walk(): Int { // <- we can override implementations
        return 10000
    }
}

// SAM - Single Abstract Method


fun interface Person { // Must have exactly one abstract function
    fun colour (): String
    //    fun hairColor(): String //<- Creates an error as can only have one abstract function
}

class Male : Person { //<- Male is implementing the Person interface
    override fun colour(): String {
        return "black"
    }
}

// val maleImplemented = Male()
// maleImplemented.colour()

// Rather than create another class we can use a lambda

val personImplemented = Person {"Yellow"}