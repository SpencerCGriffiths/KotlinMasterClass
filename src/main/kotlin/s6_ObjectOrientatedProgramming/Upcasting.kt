package org.example.ObjectOrientatedProgramming

// Upcasting is the idea of creating an object from a child class
// storing that class in a variable that is of the parent type
// When this is done, we can only access the things that are shared between them


// Downcasting happens at run time
// start with smartCast (automatic downcast)


fun main () {
    val dog = UpDog(name = "otis") // Upcasting
    val dog2 = UpDog(name = "max") // Upcasting
    val cat = UpCat(name = "garfield") // Upcasting
    val cat2 = UpCat(name = "fun") // Upcasting

    getAnimal(animal = dog) // Upcasting
    getAnimal(animal = cat) // Upcasting


    // Searching a list with upcasting and downcasting!
    val anim = listOf(dog, dog2, cat, cat2)
    val result = anim.find { it is UpDog } as? UpDog // tries to find as type of a dog. then returns it as the type dog
    println(result?.name) // otis

    val result2 = anim.filterIsInstance<UpDog>() // Does the same as above without casting and cleaner, also non nullable
    result2.forEach { println(it.name) } //otis, max
}


fun getAnimal(animal: Upcasting) {
    animal.eat()
    animal.run()
    // Cannot access the custom methods from the UpDog or UpCat here
    // All classes that are passed here are upcasted i.e. they are casted as the parent and lose the child criteria and the additional methods
}


//Downcasting:
fun getAnimal2(animal: Upcasting) {

    if(animal is UpDog) {
        // smart cast
        // is checks if it is of a type, allows to downcast and use those methods inside the block
        animal.fetchABall()
    }

    // Using a when block allows for multiple options
    when(animal) {
        is UpDog -> {
            animal.fetchABall()
        }
        is UpCat -> {
            animal.scratch()
        }
    }

    // As keyword [[Unsafe]]

    val dog: UpDog = animal as UpDog // forces it to be a Dog
    dog.fetchABall()

    val cat: UpCat = animal as UpCat // If we pass the wrong child class then we get a class case exception as it is not safe
    cat.scratch()

    // Can protect by making it nullable

    val dog2: UpDog? = animal as? UpDog
    dog?.fetchABall()
}

interface Upcasting {
    fun eat()
    fun run()
}

class UpDog(val name: String): Upcasting {

    override fun eat() {
        println("${this::class.qualifiedName} is eating...")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running...")
    }

    fun fetchABall() { // Custom function
        println("${this::class.qualifiedName} is fetching...")
    }
}

class UpCat(val name: String): Upcasting {

    override fun eat() {
        println("${this::class.qualifiedName} is eating...")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running...")
    }


    fun scratch() {
        println("${this::class.qualifiedName} is scratching with claws...")
    }
}