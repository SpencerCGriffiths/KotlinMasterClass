package org.example.ObjectOrientatedProgramming


// Sealed Classes
// Restricted class hierarchy

open class Vehicle

data class Car (
    val manufacturer: String,
    val model: String
) : Vehicle()


data class Bicycle (
    val manufacturer: String
): Vehicle()

fun getVehicle(vehicle: Vehicle) =
    when(vehicle) {
        is Car -> "${vehicle.manufacturer} ${vehicle.model}"
        is Bicycle -> vehicle.manufacturer
        else -> "Unknown Vehicle" // Here the else block is required as the compiler does not know that we have only two child classes.
    }


// Now with a sealed class the WHEN knows how many children and is exhaustive
sealed class Vehicle2

data class Car2 (
    val manufacturer: String,
    val model: String
) : Vehicle2()


data class Bicycle2 (
    val manufacturer: String
): Vehicle2()

// Adding an extra class will show an error so it must be added to the when
/**
data class Atv(
    val manufacturer: String
) : Vehicle2()
*/

fun getVehicle2(vehicle: Vehicle2) =
    when(vehicle) {
        is Car2 -> "${vehicle.manufacturer} ${vehicle.model}"
        is Bicycle2 -> vehicle.manufacturer
    }

// The compiler can recognise the children.


// Can implement abstract and non abstract in a sealed class i.e.
sealed class SealedClass {
    abstract val isMale: Boolean
    val legs: Int = 4
    abstract fun getName(): String
    fun eat() = "$isMale, $legs"
}


fun main() {

}

// Note this is similar to Enums and exhaustive match in Scala