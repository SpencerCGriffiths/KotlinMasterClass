package org.example.s4_Usability

fun main() {
    val car = Car(tires = Tires(size =17))
    println(car.getValue()) // Tires(size=17)

    val car2 = Car2(tires = "17") // Using Generics
    println(car2.getValue()) // 17

    val car3 = Car2(tires = 17) // Using Generics
    println(car3.getValue()) // 17

    val vehicle: Vehicle = Vehicle(value = Car4())
    val car4: Any = vehicle.getValue() // This is type of any as passed to Vehicle
    //car4.start // Cannot do this as it is type Any not Car4

    val vehicle2 = Vehicle2(value = Car4())
    val car5 = vehicle2.getValue()
    car5.start() // Using a Generic rather than a Universal.


    getName("Stephen") // Generic function
    getName(11) // Generic function
    getName(true) // Generic function
}

//Classes and Functions work with specific types
// Generics allow to loosen the type constraints on functions or classes.

data class Tires(val size: Int)

class Car(private val tires: Tires) {
    fun getValue() = tires
}

// Car class is not reusable as it can only have one type

data class Tires2(val size: Int)
// <T> is the generics (this can be any type) Used as an unknown type
class Car2<T>(private val tires: T) {
    fun getValue(): T = tires
}

// This is not a universal type, A universal type is declared using Any

class Vehicle(private val value: Any) { // Using Any Universal type
    fun getValue(): Any = value
}

class Car4 {
    fun start() = "Starting the engine"
}


class Vehicle2<T>(private val value: T) { // Using Any Universal type
    fun getValue(): T = value
}

fun <T> getName(name: T): T = name // Declaring a generic name function

// Notes:
// Using Generics allows you to maintain the type of class you are declaring and the functions
// You can use the universal Any but this does not allow you to then use the properties of the class