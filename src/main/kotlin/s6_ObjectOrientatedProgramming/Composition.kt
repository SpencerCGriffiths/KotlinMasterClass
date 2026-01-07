package org.example.ObjectOrientatedProgramming


// Use composition instead of inheritance unless you have very clear plan

// This is how inheritance could mess up the code:

// Building an Animal game and thinking of functionality. Have 2 animals and improve later

interface TopCAnimal {
    fun eat() {}
    fun run() {}
}

class cDog() : TopCAnimal  {
    override fun eat() { super.eat() }

    override fun run() { super.run() }
    fun bark() {}
}
class cCat() : TopCAnimal {

    override fun eat() { super.eat() }

    override fun run() { super.run() }

    fun hiss() {}
}

interface cRobot{
    fun move() {}
}

class cCleaningRobot : cRobot {
    fun clean() {}
}

class cServiceRobot : cRobot {
    fun repair() {}
}

// When you start expaning with new features and want to use old methods you run in to problem e.g.:

class cCleaningRobotDog: cRobot, TopCAnimal {
    // To access the bark function for dog and clean for robot we have to then make those classes open
    // We also then need to extend those classes here also. But you can only inherit from one class so which do you choose?

}

// This can be resolved with composition

class cParent {
    fun getFood() { println("Getting Some Food") }
}

class cChild {
    private val parent = cParent() // initialise the class within the class. We then have access to its values, properties and function
    val getFood = parent.getFood()
    // Using this method allows you to access everything from multiple classes
}

class cChild2(private val parent: cParent) { // You can also just pass it as the parameter to access the value
    val getFood = parent.getFood()
}



// Consider starting with composition and change to inheritance in the future.


// Here is how you can resolve the conflict with composition:
class cCleaningRobotDog2 {
    private val dog = cDog()
    private val cleaningRobot = cCleaningRobot()

    fun run() {
        dog.run()
    }

    fun bark() {
        dog.bark()
    }

    fun clean() {
        cleaningRobot.clean()
    }
}
fun main() {

}

