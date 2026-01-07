package org.example.ObjectOrientatedProgramming


// AbstractClass
// One or more functions or properties in the class need to be without implementation

fun main(){

}

// Abstract classes are always open -> they can always be inherited from
abstract class AbstractClass{
    abstract val name: String // Abstract and unimplemented
    protected var energy = 0

    // If I declare something that is not abstract this is fine
    fun speak() {
        println("Woof")
    }

    open fun speak2() = "Woof" // If it is open it can be overriden

    // An abstract function
    abstract fun eat()
}

class abstractDog : AbstractClass(){
    override val name: String = "abstractDog"

    override fun speak2(): String {
        return "Woof Woof!"
    }

    override fun eat() {
        println("Yum")
        energy += 1
    }
}

// A class can implement more than one interface but not more than one abstract class

abstract class abstractClass(private val name: String){
    open fun printName() {
        println(name)
    }
}

interface abstractInterface{
    abstract val name: String // Do not need to specify abstract as something inside an interface is auto abstract
    fun printName(name: String){
        println(name)
    }

class doubleExtension: abstractClass(name = "Confusing"), abstractInterface{
    override fun printName() {
        super<abstractClass>.printName()
    }

    override val name: String
        get() = name

    override fun printName(name: String) {
        super<abstractInterface>.printName(name)
    }
}
}

