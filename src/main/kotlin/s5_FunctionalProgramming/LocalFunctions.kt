package org.example.s5_FunctionalProgramming

// defined within other functions which is why they are local.

fun main() {
    start()
//    status ok
//    wings ok
//    engine starting

    addQuotes()
    // "Name"

    val listOfNumbers = listOf(1,2,3,4,5)
    listOfNumbers.forEach customName@ {
        if(it == 3) {
            return //@forEach // Add forEach to specify the return is only for this forEach
            //@customName for the customName option
        }
        println("loop $it")
    }
    println("completed") // This will never trigger as the return has already been hit from the main function
}


fun addQuotes() {
    fun String.quoted() = "\"$this\""
    println("Name".quoted())
}
fun start() {
    val builder = StringBuilder()
    fun log(message: String) =  builder.appendLine(message)
    log("status ok")
    log("wings ok")
    log("engine starting")
    println(builder)
}

