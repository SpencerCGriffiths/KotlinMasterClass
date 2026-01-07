package org.example.s5_FunctionalProgramming

fun main () {

    val people = listOf(
        NewCustomClass(name = "John", age = 10, male = true),
        NewCustomClass(name = "Steve", age = 12, male = true),
        NewCustomClass(name = "Alex", age = 14, male = false),
        NewCustomClass(name = "Dora", age = 15, male = false),
        NewCustomClass(name = "Amy", age = 20, male = false),
    )

    people.filter{ person -> person.male }.forEach{print(it.name)}
    people.filter(NewCustomClass::male).forEach{print(it.name)} // Member reference using ::

    people.filter{ person -> !person.male }.forEach{print(it.name)}
    people.filterNot(NewCustomClass::male).forEach{print(it.name)} // Member reference using ::

    println(people.any(NewCustomClass::important)) // Can call functions using Member reference
    println(people.any(::important2)) // Can call  TOP LEVEL functions using Member reference

    val names = listOf("Dog", "Cat")
    println(names.mapIndexed(::NewCustomClassAnimal)) // creates a map with id (index) and name and creates the class
}

data class NewCustomClass(
    val name: String,
    val age: Int,
    val male: Boolean
)

fun NewCustomClass.important() = this.name.startsWith(prefix = "M") && this.age > 12
fun important2(ncClass: NewCustomClass) = ncClass.name.startsWith(prefix = "M") && ncClass.age > 12

data class NewCustomClassAnimal(
    val id: Int,
    val name: String,
)