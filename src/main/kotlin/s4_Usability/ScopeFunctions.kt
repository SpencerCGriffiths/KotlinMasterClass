package org.example.s4_Usability

// 5 Scope function, they form a temporary scope and have different use cases
// 1. let
// 2. run
// 3. with
// 4. apply
// 5. also



fun main() {

    // 1. - Let Function ->
    //
    var name: String? = "John"

    val length: Int = name?.let { // Using the let operator. If the name is not null executed the code
        println("Name is not null.") // Name is not null.
        it.length
    } ?: 0 // If it is null use the elvis operator to return this value

    println("Length is $length") // Length is 4

    // 2. - Run Function ->
    // Execute a block of code on an object an return the result of that block.
    // Used to set up or operate on object

    val adult = Adult("John", 30)

    val result = adult.run { // Block runs and allows you to amend values/produce a result from the values
        age += 35
        "Name: $name - Age: $age"
    }
    println(result) // Name: John - Age: 65

    //3. - With function ->
    // Allows you to operate on a function without the need to refer to it explicitly within the block

    val result2 = with(adult) {
        age += 35
        "Name: $name - Age: $age"
    }
    println(result2) // Name: John - Age: 100

    //4. - Apply function ->
    // Configure an object and return the object itself

    val result3 = adult.apply { // can modify mutable object properties
        name = "Harry"
        age = 40
    } // Returns the class
    println(result3) // Adult(name=John, age=40)

    //5. - Also function ->
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val sum = numbers
        .also { println("Original list: $it") } // print the original list - Add a side effect. // Original list: [1, 2, 3, 4, 5]
        .sum()

    println(sum)  // 15
}


data class Adult(var name: String, var age: Int)



// 1. execute a block of code on an object

// let function