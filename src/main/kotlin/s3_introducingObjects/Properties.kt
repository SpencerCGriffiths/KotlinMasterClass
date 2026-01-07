package org.example.introducingObjects


// A property maintains a state inside a class.
// Val immutable, Var mutable



fun main() {
    val person1 = Person()
    println(person1.personAge) //0
    person1.setAge(age = 14)
    println(person1.personAge) //14

    val person2 = Person()
    println(person2.personAge) //0
    person2.setAge(age = 24)
    println(person2.personAge) //24

    val person3 = Person()
    val person4 = person3
    println(person3.personAge) //0
    println(person4.personAge) //0
    person3.setAge(age = 30)
    println(person3.personAge) //30
    println(person4.personAge) //30 <- Person4 points to the same place in memory as Person 3 (line21)
    println(person3) // org.example.introducingObjects.Person@7c30a502
    println(person4) // org.example.introducingObjects.Person@7c30a502
}

class Person {

    var personAge = 0

    fun setAge(age: Int) {
        personAge = age
    }
}