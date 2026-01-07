package org.example.s4_Usability


// Data class is there to just hold data
// Adds generated functions behind the scene
// Data class has to follow these rules:
// At least one parameter and declared with a Val or Var
// Cannot be abstract, sealed or inner
// If you want to exclude a property from the

fun main() {
    val peep1 = Peep(name = "John", age = 20)
    val peep2 = Peep(name = "John", age = 20)
    println(peep1.equals(peep2)) // true
    val peep3 = peep2.copy(age = 30)
    println(peep3.toString()) // Peep(name=John, age=30)

    val peep4 = Peeple(name = "Haha")
    val peep5 = Peeple(name = "Haha")
    peep4.age = 1
    peep5.age = 100
    //*1
    println(peep4.equals(peep5)) // true
    // Although age is different as it is not in the constructor it is excluded.

    // You cannot access the second value as it is not in the primary constructor
//    val (name, age) = peep4 //Destructuring declaration initializer of type Peeple must have a 'component2()' function
    val (name, age) = peep3
    println(name) //John
    println(age) // 30
}

data class Peep(
    val name: String,
    val age: Int
)


// If you want to exclude a property from the class declare it in the object *1
data class Peeple(
    val name: String
){
    var age: Int = 0
    }

// Shift Shift, Decompile Kotlin ByteCode -> Shows behind the scenes codes and methods.