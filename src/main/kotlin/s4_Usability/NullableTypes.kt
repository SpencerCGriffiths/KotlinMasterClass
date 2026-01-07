package org.example.s4_Usability


// kotlin provides Null safety
// Similar to Optional values in scala
// Nullable values prevent null pointer exceptions

fun main() {

    val map = mapOf(1 to "one")
    val result = map[2]
    println(result) //null // returns null rather than a nullpointerexception

    val regularString = "abc"
   // val text: String = null // This shows an error as it cannote be null
    val textNull: String? = null
//    val text2: String = textNull   //Cannot now become a nullable value
}
