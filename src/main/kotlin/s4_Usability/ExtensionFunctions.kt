package org.example.s4_Usability

// Extension Functions:

// Added a new library to project. Has everything apart from some functions.
// No access to the source code.
// Kotlin extension functions allows you to add Member functions to existing class without ownership


fun main() {
    val name: String = "Spencer"
    // standard functions i.e.
    println(name.length)

    // create your own
    println(name.h1())

    val person = Person(name = "Spencer", age = 28, address = "Serbia")
    println(person.info())
    println(person.addressInfo())
}

//Specify what you are extending
//Then name is following the .
//This takes any strings and makes it a h1
fun String.h1(): String {
    return "<h1>$this</h1>"
}


class Person(
    private val name: String,
    private val age: Int,
    val address: String
    ){
    fun info() = "My name is $name and I am $age years old"
}

// Only public variables can be accessed through the functions
fun Person.addressInfo() = "Come visit me in $address"