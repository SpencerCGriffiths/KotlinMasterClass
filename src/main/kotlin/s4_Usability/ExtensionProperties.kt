package org.example.s4_Usability

fun main() {
    val name = "Spencer"
    println(name.longOrShort) //Short // Utilising the extension property below
    println(name.quoted()) //"Spencer" // Utilising the extension function below

    val numbers = listOf("one", "two", "three", "four")
    println(numbers.getFirstOrNull) // one

    val emptyNumbers = listOf<Int>()
    println(emptyNumbers.getFirstOrNull) // null

}

// The extended type comes before the

val String.longOrShort: String //Declaring extension property for strings
    get() = if (length> 10) "Long" else "Short"

fun String.quoted() = "\"$this\"" // If no parameter you can change it in to an extension property

fun String.quoted2(text: String) = "\"$this\""

val <T> List<T>.getFirstOrNull: T? //Declaring a generic property for a List of any type
    get() = if(isEmpty()) null else first()

// Not good practice to add complex logic to extension properties. Use extension functions instead.