package org.example.s5_FunctionalProgramming

fun main() {
    // Zipping

    val list = listOf("a", "b", "c", "d", "e", "f")
    val list2 = listOf(1, 2, 3, 4, 5, 6)

    println(list.zip(list2))
    println(list2.zip(0..10))
    println((0..100).zip(list))

    val listOfId = listOf(1,2,3)
    val names = listOf("Bill", "Bob", "Ben")
    val result = listOfId.zip(names) { id, name ->
        NEWCustomOne(id, name)
    }

    println(result)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    println(numbersMap.toList())
    val (numbers, text) = numbersMap.toList().unzip()
    println(numbers)
    println(text)

    // Flattening Lists

    val listOfList = listOf(
        listOf(1,2,3),
        listOf(1,2,3),
        listOf(1,2,3),
    )

    val flattened = listOfList.flatten()
    println(listOfList)
    println(flattened)
}

data class NEWCustomOne(val id: Int, val name: String)