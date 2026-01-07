package org.example.s4_Usability


// Enum is a collection of names
// Fixed values to determine a state, can have properties etc.


fun main() {

    val priority = Priority.LOW
    println(priority) // LOW

    val priority2 = Priority2.LOW
    println(priority2.colour) // Green


    // Convenient function for Enums. EnumOf

    val priority3 = Priority2.valueOf(value ="LOW")
    println(priority3) //LOW

//    val priority4 = Priority2.valueOf(value ="NotValid")
//    println(priority4) //No Enum constant priority NotValid (Case sensitive)

    for (pri in Priority2.values()) {
    println(pri.colour)
        //Green
        //Orange
        //Red
    }

    val priority4 = Priority2.LOW
    println(priority4.number) //1
}

enum class Priority{
    LOW,MEDIUM,HIGH // Three constants are declared
}


// Enum constants , As they are part of a enum class, can have properties.
enum class Priority2(val colour: String){
    LOW(colour = "Green"),
    MEDIUM(colour = "Orange"),
    HIGH(colour = "Red"); // Three constants are declared

    // Enum class is a specific number of instances inside the class but also behaves like a normal class
    val number: Int
        get() = when(this) {
            LOW -> 1
            MEDIUM -> 2
            HIGH -> 3
        }
}
