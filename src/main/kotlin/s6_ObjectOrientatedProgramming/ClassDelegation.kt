package org.example.ObjectOrientatedProgramming


// Delegation pattern uses composition behind the scenes
// You can implement an interface by owning an object that implements that interface and delegates responsibility to that object
// BY keyword for the delegation pattern


interface Programmer {
    var working: Boolean
    fun work()
    fun getPaid()
}


class KotlinProgrammer(private val amount: Int) : Programmer {
    override var working: Boolean = false
    override fun getPaid() {
        if(working) {
            println("Getting the money $$amount")
        } else {
            println("No money! you need to work first")
        }
        working = false
    }
    override fun work() {
        println("Programming with Kotlin")
        working = true
    }
}

// Using the by work to delegate
// This class does not need to implement the function or values
// The responsibility of implementing them was done by Kotlin Programmer
// Both classes have to inherit from the same parent i.e. Programmer
class Freelancer(private val amount: Int): Programmer by KotlinProgrammer(amount = amount)

// Further example
// Rather than delegating by a set class, you can also pass a class as the param
class Freelancer2(programmer: Programmer): Programmer by programmer

// You can also override functions etc.
class Freelancer3(programmer: Programmer): Programmer by programmer {
    override fun getPaid() {
        if(working) {
            println("Getting loads of money!!!!!")
        } else {
            println("No money! you need to work first")
        }
        working = false    }
}


class JavaDeveloper(private val amount: Int) : Programmer {
    override var working: Boolean = false
    override fun getPaid() {
        if(working) {
            println("Getting the money $$amount")
        } else {
            println("No money! you need to work first")
        }
        working = false
    }
    override fun work() {
        println("Programming with Java")
        working = true
    }
}

// Cannot delegate by two classes that share the same top level
// Error: A top level appears twice
/**
class Freelancer4:
    Programmer by KotlinProgrammer(amount = 100),
    Programmer by JavaDeveloper(amount = 100)
*/

interface Designer {
    var working: Boolean
    fun work()
    fun getPaid()
}

class GraphicDesigner(private val amount: Int) : Designer {
    override var working: Boolean = false
    override fun getPaid() {
        if(working) {
            println("Getting the money $$amount")
        } else {
            println("No money! you need to work first")
        }
        working = false
    }
    override fun work() {
        println("Graphic Designing")
        working = true
    }
}

/**
class Freelancer4:
Programmer by KotlinProgrammer(amount = 100),
Designer by GraphicDesigner(amount = 100) {
// Shows a warning that the functions must be overwritten
// Cannot have functions of the same name
    //eg
    override var working: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    override fun getPaid() {
        TODO("Not yet implemented")
    }

    override fun work() {
        TODO("Not yet implemented")
    }
}
*/

// But you can work around it with unique naming.
interface Designer2 {
    var designerWorking: Boolean
    fun designWork()
    fun designGetPaid()
}

class GraphicDesigner2(private val amount: Int) : Designer2 {
    override var designerWorking: Boolean = false
    override fun designWork() {
        if(designerWorking) {
            println("Getting the money $$amount")
        } else {
            println("No money! you need to work first")
        }
        designerWorking = false
    }
    override fun designGetPaid() {
        println("Graphic Designing")
        designerWorking = true
    }
}


class Freelancer4:
    Programmer by KotlinProgrammer(amount = 100),
    Designer2 by GraphicDesigner2(amount = 100)


// Behind the scenes:
// Tools -> Kotlin -> Show Kotlin ByteCode. You can see behind the scenes composition and inheritance to make delegation work
fun main() {
    // Using the by work to delegate
    val freelancer = Freelancer(amount = 100)
    freelancer.work()
    freelancer.getPaid()

    // Rather than delegating by a set class, you can also pass a class as the param
    val freelancer2: Freelancer2 = Freelancer2(programmer = KotlinProgrammer(amount = 100))
    freelancer2.work()
}