package org.example.ObjectOrientatedProgramming

fun main() {
    val person = sCPerson("John")
    // Person initialising automatically
    //Hello, John

    val person1 = sCPerson2(name = "John", age = 30, )

    val person2 = sCPerson2(name = "John", age = 30, true)
}

// primary constructor can not directly contain the code you want to execute
// use init block

class sCPerson (name: String) {
    init {
        println("Person initialising automatically")
        println("Hello, $name") // <- this can be done without a val or var constructor
    }

    fun printName() {
        //println("Name: $name") //<- cannot access unless the constructor is a val or a var
    }

    // You can have multiple init blocks:

    init {
        println("This will trigger second as they are in order")
    }

    // Secondary Constructors:
    //
}

// Secondary Constructor:
// Here is a primary constructor with many values and some set as defaults
class sCPerson2 (
    val name: String,
    val age: Int = 0,
    val isMale: Boolean = false) {
    init {
        println("Person initialising automatically")
        println("Hello, $name") // <- this can be done without a val or var constructor
    }
}
class sCPerson3 (
    val name: String,
                ) {
    init { //<- Init should be used in the primary constructor
        println("Person initialising automatically")
        println("Hello, $name") // <- this can be done without a val or var constructor
    }

    // This is the secondary constructor. It accepts more params
    constructor(name: String, age: Int) : this(name = name) {
        println("Secondary Constructor")
    }
    // Here is a further constructor
    constructor(name: String, age: Int, isMale: Boolean) : this(name = name) { // <- You have to satisfy the primary params
        println("Secondary Constructor")
    }
}

// Similar to overloaded methods