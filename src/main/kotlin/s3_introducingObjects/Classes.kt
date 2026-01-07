package org.example.introducingObjects


// Classes - Creates a blueprint for an object

// Object - The created thing itself that can store data

fun main() {

    val house = House()
    val house2 = House()
    println(house)
    println(house.enterTheHouse()) // Method can only be called as a part of the class/object house.
    println(house2)
}

// Declaration of a class

//class MyClass constructor() <- this is the primary constructor. However, it is done implicitly hence MyClass()

class House {
    fun enterTheHouse() = "Entering the house...." // <- Member function as it is a member of this class and only accessible within it.
}