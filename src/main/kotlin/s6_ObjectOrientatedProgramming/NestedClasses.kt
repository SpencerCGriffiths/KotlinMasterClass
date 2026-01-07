package org.example.ObjectOrientatedProgramming
// Nested Classes
// A class within the name space of an outer class
// The outer class owns the nested class
// Can clarify your code

class Airport(private val code: String) {

    // Nested Class
    open class Plane{
        fun contact(airport: Airport) {
            println(airport.code) // Can access the private val as within scope
        }
    }

    class Example{
        val airport: Airport = Airport(code = "ENG")
        val plane = Plane() // You can not name Airport if you're inside the class

    }

    private class PrivatePlane: Plane() {
        // As it is private. It is invisible outside of the Airport class.
        // This class can only be used within the class and be upcasted to a public type
        fun secretCode() { // This will not be accessible outside of the class
            println("Secret Code")
        }
    }

    fun privatePlaneWatching(): Plane = PrivatePlane() // Upcast to a plane, when called it represents the upcast Plane

}

// This again is a example of a local class. Programmer will not be accessible outside the class
fun myFunction() {
    open class Programmer
    class Kotlin: Programmer()
    val programmer: Programmer = Kotlin()
}

// An interface can have a nested class
interface ncPerson {
    val height: Height

    data class Height(val cm: Int)
}

// That class can then be used to instantiate other classes that inherit from the interface
class John(height: Int): ncPerson {
    override val height = ncPerson.Height(cm = height)
}

// Here a Class can have a nested enum class
class Ticket(
    private val name: String,
    private var seat: Seat
) {

    enum class Seat {
        Eco,
        Premium,
        Business,
        First
    }


    fun upgrade()  {
        // This function will increase the seat by one class
        // ordinal is returning the index
        seat = Seat.values()[seat.ordinal + 1]
    }

    fun printSeat(){
        println(seat)
    }
}

// Nested Enum class
// Enums cannot be nested in a function or inherit e.g.
/**
open class Example0
enum class EnumExample: Example0
*/
fun main() {
    // Create an airport
    val airport: Airport = Airport(code = "ENG")
    // We can create a plan by calling Plane off the airport class as it is nested
    val plane = Airport.Plane() // You can import Airport to make this simpler
    plane.contact(airport = airport)

    val result: Airport.Plane = airport.privatePlaneWatching() // Upcast to a plane, when called it represents the upcast Plane


    val myTicket = Ticket(name = "Spencer", seat = Ticket.Seat.First)
    myTicket.printSeat()
    myTicket.upgrade()
    myTicket.printSeat()
}


