package org.example.introducingObjects

// Map is a collection of key and value pairs where each key is unique and can only be associated with one value.
// The same value can be associated with multiple keys.

fun main() {
    val animals = mapOf(
        "Monkey" to "Brown",
        "Tiger" to "Orange",
        "Whale" to "Blue",
    )

    println(animals.get("Monkey")) //Brown
    println(animals["Monkey"]) //Brown

    println(animals["Elephant"]) //null

    val keys: Set<String> = animals.keys // It is a set to remove duplicates by default (They have to be unique)
    val values: Collection<String> = animals.values

    println(keys) // [Monkey, Tiger, Whale]
    println(values) // [Brown, Orange, Blue]

    // Can loop through each entry (key value pair)
    for(entry in animals) {
    println(entry.key)
    println(entry.value)
    }

    for ((key, value) in animals) {
        println("$key: $value")
    }
    //Monkey: Brown
    //Tiger: Orange
    //Whale: Blue

    animals.forEach{ key, value ->
        println("$key: $value")
    }
    //Monkey: Brown
    //Tiger: Orange
    //Whale: Blue

    // getOrDefault method
    println(animals.getOrDefault(key="Monkey", defaultValue = "MonkeyDefault")) // Brown
    println(animals.getOrDefault(key="Dog", defaultValue = "DogDefault")) //DogDefault

    //Filtered method
    val filteredMap = animals.filter { it.value.length > 4 }
    println(filteredMap) // {Monkey=Brown, Tiger=Orange}


    // Converting list to a map

    val animalList: List<String> = listOf("Monkey", "Tiger", "Whale")

    // Creates a Map by associating each item with itself.
    println(animalList.associateBy { it }) // {Monkey=Monkey, Tiger=Tiger, Whale=Whale}

    val monkey = Animal(name = "Monkey", age = 25)
    val tiger = Animal(name = "Tiger", age = 25)
    val whale = Animal(name = "Whale", age = 25)

    val animalList2 = listOf(monkey, whale, tiger)

    // Using a Class to create a map based on the parameters
    val animalMap = animalList2.associateBy( { it.name }, {it.age})

    println(animalMap) // {Monkey=25, Whale=25, Tiger=25}


    /**
     *    There is a mutable version of a map
     */

}

class Animal(
    val name: String,
    val age: Int)