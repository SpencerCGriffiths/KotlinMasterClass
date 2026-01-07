package org.example.s7_ExceptionHandling

//Exceptions
// A normal problem has enough info to cope with the issue
// An exception can not continue processing
// throw an exception from the site of the error


// Function designed to throw an error (casting a String to an Int)
fun errorCode() {
    val invalidNumber = "#1"
    val result = invalidNumber.toInt() // This throws an error
    // java.lang.NumberFormatException
}


fun averageSalary(amount: Int, months: Int): Int {
    return amount / months
}

fun averageSalarySafe(amount: Int, months: Int): Int? =
    if(amount == 0 || months == 0 ) null else amount / months

// we can also throw custom excpetions
fun averageSalaryOrException(amount: Int, months: Int): Int {
    if(amount == 0 || months == 0 ) {
        throw IllegalArgumentException("Cannot have 0 amount or 0 months")
    } else {
        return amount / months
    }

}

fun main() {
//  errorCode() // This is calling the function to throw an error
    val result = averageSalary(amount = 3000, months = 2)
    println(result)
//  val zeroError = averageSalary(amount = 100, months = 0)
    val resultSafe = averageSalarySafe(amount = 0, months = 0)
    println(resultSafe)
    val resultException = averageSalaryOrException(amount = 0, months = 0)
    println(resultException)

}