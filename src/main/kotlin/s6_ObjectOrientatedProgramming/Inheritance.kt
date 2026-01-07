package org.example.ObjectOrientatedProgramming

// Inheritance - creating a new class by reusing and modifying an existing class
// Make a class similar to an existing class with a few differences
// Similar to other syntax with using a :

fun main() {

    val otis = iDog(dogName = "otis")
    val leo = iLion(lionName = "Leo")

    println(otis.energy)
    otis.eat()
    println(otis.energy)

    println(leo.energy)
    leo.eat()
    leo.printProt()
    println(leo.energy)

}

open class iParent { // Has to be open or abstract, cannot be final to be inheritted from

}

class Child: iParent() // Each class you declare is final by default

// NOTE - Every class is inherited from one class - Any()


// Implementing Params:
// the class and the functions have to be open in order to be used in the child
// Params need to be satisfied

open class iAnimal (val name: String) {
   var energy = 0

    open fun eat() {
        energy+= 1
    }

    open fun run() {
        energy-= 1
    }


    var colour = "Black"

    protected var prot = 0 // Protected cannot be accessed in child or when defined
    open fun printProt() {
        println("Current prot is $prot") // But can be accessed in a open function and called that way
    }

    private var priv = 0 // Private can be accessed in the child but not once defined

    init {
        println("Animal class initialized") // All child classes will first call the main class then call the child
    }
}

class iDog(dogName: String): iAnimal(name = dogName) {
    override fun eat() {
        energy += 2
    }
    override fun run() {
        energy -= 2
    }

    init {
        println("Dog class initialized")
    }

}

open class iLion(lionName: String): iAnimal(name = lionName) {
    override fun eat() {
        energy += 10
    }
    override fun run() {
        energy -= 10
    }

    init {
        println("Lion class initialized")
    }

     var claws = 4

}

class iSecondCat(catName: String): iLion(lionName = catName) {

    // This now inherits all the animal traits and the lion traits, it a second level
}

// Using an extension function
fun iAnimal.updateColour(colour: String) {
    this.colour = colour // Protect or Private it will not be able to be accessed
    // This function is available to all the child classes
}