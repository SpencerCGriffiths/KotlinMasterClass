package org.example.s7_ExceptionHandling

import java.io.File

// Check Instructions
// Confirm certain constraints are satisfied
// Express non-obvious requirements
// Use instead of explicitly throwing exceptions


// REQUIRE
// validate the function arguments at runtime

data class ciPerson(
    val name: String,
    val age: Int
) {
    init {
        // first param boolean
        // second param is a lambda
        require(value = name.length < 20) {
            "Your Name is too long"
        }

        // Can use with a single param as well
        // Just offers a default message
        require(value = name.length < 20)


        requireNotNull(value = name.length < 20)
    }
}


// RequireNotNull
fun multiplyWithTen(number: Int?) : Int {
    // Casts to a not nullable type
    requireNotNull(value = number) {
        "We need a non null number"
    }
    return number
}

// A check
// used post condition (might not trust the result)
// Throws an illegal state exception


fun writetoFile() {
    val myFile = File("MyFile.txt")

    // Check the file exists and if not throw an illegal state exception
    check(value = myFile.exists()) {
        "File doesn't exist"
    }

    // if it exists then write to it
    myFile.writeText("Hello, World!")
}



fun main() {
    // throws the Illegal Argument Exception from the require due to length of name!
    val person = ciPerson(name = "SuperDuperLongName12345", age = 10)

}