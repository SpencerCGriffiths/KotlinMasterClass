package org.example.ObjectOrientatedProgramming

// Sealed Interfaces

// Restricts which classes or interfaces that can implement it, restricts it to the same file/package
// Sealed interfaces prevent external classes implementing them
// Used to prevent subclasses that violate the design.


sealed interface NetworkStatus // Secures it to this file

data object Available: NetworkStatus
data object Unavailable: NetworkStatus
data object Limited: NetworkStatus
data object Unknown: NetworkStatus

// trying to implement this outside this file is not going to work

// Makes when blocks exhaustive as they are type safe
fun isAvailable(status: NetworkStatus) {
    when (status) {
        is Available -> println("Available")
        is Unavailable -> println("Unavailable")
        is Limited -> println("Limit")
        is Unknown -> println("Unknown")
    }
}