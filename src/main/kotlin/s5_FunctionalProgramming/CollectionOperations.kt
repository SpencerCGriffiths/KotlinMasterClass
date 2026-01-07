package org.example.s5_FunctionalProgramming

fun main () {
    val list1 = List(size = 10) { it } // create a list of 10 numbers
    val list2 = MutableList(size = 10) { it } // create a list of 10 numbers but mutable
    println(list1) //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    println(list2) // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    // first function - filter
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbersList.filter { number ->
        number % 2 == 0
    } // [2, 4, 6, 8, 10]
    )

    println(numbersList.filterIndexed { index, number ->
        index == 0
    }
    )

    println(numbersList.filterNot { number ->
        number == 1
    }
    )

    val numbersList2 = listOf(1, null, null, 4, 5, 6, 7, 8, 9, 10)

    println(numbersList.filterNotNull())

    // Second Function - Count
    println(numbersList.count { number ->
        number == 4
    }
    )

    println(numbersList2.count())

    // Third Function - Find

    println(numbersList2.find { number ->
        number == 5
    })

    println(numbersList2.firstOrNull())

    println(numbersList2.lastOrNull())


    // Fourth Function - Any

    println(numbersList.any { number ->
        number == 1
    })

    println(numbersList.all { number ->
        number > 0
    })

    // Fifth Function - None

    println(numbersList.none {number ->
        number > 9
    })

    // Sixth Function - partition

    // First list will be where it is true, second where it is false
    val (match, nonMatch) = numbersList.partition { number ->
        number > 6
    }

    print(match)
    print(nonMatch)

    // Seventh Functions - Sum and sorted

    val randomNumbers = listOf(1,3, 5, 6, 8, 2, 4)
    println(randomNumbers.sum())
    print(randomNumbers.sorted())
    print(randomNumbers.sortedDescending())

    // With a custom data type

    val customList = listOf(
        customDataClass(name = "John", age = 10),
        customDataClass(name = "Ean", age = 23),
        customDataClass(name = "Claire", age = 17)
    )

    println(customList.sumOf { custom ->
        custom.age
    })

    println(customList.sortedBy { custom -> custom.age })

    // Eigth Function - Take

    println(numbersList.take(n = 4))
    println(numbersList.drop(n = 4))
}

data class customDataClass(
    val name: String,
    val age: Int
)