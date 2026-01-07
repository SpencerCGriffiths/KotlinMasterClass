package org.example.s7_ExceptionHandling

// Catching an exception
// Handling run time errors:


// Creating a Custom Error:
// Inherit from throwable or from Exceptions
class InvalidNumberException(
    description: String
): Exception(description)

class CustomThrowable(
    description: String
): Throwable(description)

fun throwAnError() {
    throw InvalidNumberException(
        description = "Please enter valid number"
    )
}


fun function1() {
    throw CustomThrowable(description = "random error")
}
fun function2() {
    function1()
}
fun function3() {
    function2()
}



// CATCHING with Try Catch Finally
fun function1A() {
    throw CustomThrowable(description = "random error")
}
fun function2A() {
    function1A()
}
fun function3A() {
    try {
        function2A()
    } catch (e: CustomThrowable) {
        println("Exception Caught: ${e.message}")
    } finally {
        println("Clean Up ") // Exception or not finally will always be executed
    }
}



fun main(){
    // throwAnError()

    // This calls all the other functions passing the error up the chaing from function 1
//    function3()

    // This is now being caught so it is continuing to run
    function3A()

}