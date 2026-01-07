package org.example.introducingObjects


// In Java there are fields, In Kotlin there are properties. In Kotlin, Getters and Setters are auto generated
fun main() {

    val getterPerson = Person6()

    println(getterPerson.age) // 0 <- This is the getter returning the age
    getterPerson.age = 18 // <- This is the setter setting the age
    println(getterPerson.age) // 18 <- This is the getter returning the age

    val person9 = Person9()

    println(person9.age) //1
    println(person9.age) //2
    println(person9.age) //3

    val minorPerson = Person12(age = 17)
    val adultPerson = Person12(age = 19)

    println(minorPerson.isAMinor) //true
    println(adultPerson.isAMinor) // false

    val privatePerson = Person13()
    println(privatePerson.age) // 0
    // println(privatePerson.age = 10) // Error as private setter so cannot be set without a function in the class
    privatePerson.addAge(10) // Error as private setter so cannot be set without a function in the class
    println(privatePerson.age) //10

}

class Person6 {
    var age = 0
        get() {
            return field //returns current value of the age property.
        }

        set(value) {
            field = value
        }
}

class Person9{
    private var accesses = 0
    val age
    get() = ++accesses
}

// There is a reserved key word *field keyword that is used to access or modify the property value with getters or setters

class Person10{
    val age = 0
        get() = field // This is redundant and can be omitted as it is built in to kotlin
}

class Person11{
    val age = 0
        get() = field // This is redundant and can be omitted as it is built in to kotlin
        //set(value) = value // This shows as error as the val is immutable
}

// Good for not heavy computation to have available quick function
class Person12(val age: Int){
    val isAMinor
        get() = age < 18
}

// When creating a class you want to expose the class but hide the functions that modify property values.

class Person13{
    var age = 0
    private set // We can only change the age variable from within this person class and not from the outside
    // this can be done with a function within the class e.g.

    fun addAge(newAge: Int) {
        age = newAge
    }
}
