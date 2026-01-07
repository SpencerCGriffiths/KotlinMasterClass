package org.example.s4_Usability

fun main () {
    getName(name = "Spencer") // 7

    getName(name = null) // null
}

fun getName(name: String?) {
//    println(name.length) // Warning, only safe or non null

//    if(name != null) {
//        println(name)
//    }

    // Use a safe call
    println(name?.length ?: "Default") // Safe call syntax, means if it is present do this or return a null

    // Double bang operator
    // We are not able to prove that this is not always not null
    // If it is null it will through an error.
    // println(name!!.length)

    // Using an elvis operator
    /** ?: */
    // sets a default return for a null value

    // There are also built in functions to handle the null
    //println(name.isNullOrEmpty())

}