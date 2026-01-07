package org.example.ObjectOrientatedProgramming

//Inner Classes
// A nested class but maintains a reference to the outer class

class Computer(private val model: String) {

    // inner class
    inner class HardDrive(private val size: Int) {
        fun getComputerModel() {
            println(this@Computer.model) // Here we can reference the Computer (outer class)
        }

        fun getInfo() {
            println("Computer Model $model, HDD Size $size")
        }
    }


    // A non-inner class is unable to reference the outer class values
    class NonInnerDrive(private val size: Int) {
        fun getComputerModel() {
            println(this)
        }
    }

    inner class HardDrive2(private val size: Int) {
        fun getComputerModel() {
            println(this@Computer.model) // Here we can reference the Computer (outer class)
        }

        fun getInfo() {
            println("Computer Model $model, HDD Size $size")
        }

        // Here we can declare a nested inner class in the inner class in the same way
        inner class Storage(private val system: Int = 10){
            fun getInfo(){
                println("Computer Model $model, HDD Size $size, capacity: $system")
            }
        }
    }


}

// An inner class can inherit another inner class from a different outer class

open class Computer2(private val model: String) { // Make it open so laptop can inherit

    abstract inner class HardDrive(private val size: Int) { // make abstract
        abstract val storageModel: String // Implement a abstract val to use in the next class
    }
}

// Laptop can now inherit computer as it is open and implement abstract of inner classes
class Laptop(
    val model: String,
    private val hddSize: Int,
    private val storageModel: String
): Computer2(model = model) {
    inner class Storage: Computer2.HardDrive(size = hddSize) {
        override val storageModel: String
            get() = this.storageModel
    }
}

fun main(){
    // To declare the inner class we need to declare the outer
    val hdd = Computer(model = "Dell").HardDrive(size = 100)
    hdd.getComputerModel()


    // Here we have nested nested inner class (2 layers)
    val nestedInner = Computer(model = "Dell").HardDrive2(size = 100).Storage()
    nestedInner.getInfo()


}