package org.example.introducingObjects


// A constructor is used to construct something
// When declaring a class it is omitted by default
// Used to pass some information

fun main() {
    val stefan = Person2(name = "Stefan")
    println(stefan.myName)

    val unknownPerson = Person2()
    println(unknownPerson.myName)

    println(stefan.toString())
}

class Person2(val name: String = "Unknown") { // Adding a Val keyword takes a construction parameter to a class property

    val myName = name

    fun getName() {
        println(myName)
    }

    // You can override functions inside of classes.
    // Return type has to stay the same but what is returned can be different
    override fun toString(): String {
        return name
    // return super.toString()
    }
}

// Construction parameters are not available inside the object that is created or accessible on. eg:

class Person3(name: String) {
    fun getName() {
        //println(name) // <- Error as name is not available to this method
    }
}


