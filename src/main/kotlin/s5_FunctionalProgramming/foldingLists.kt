package org.example.s5_FunctionalProgramming

fun main() {
    val exampleList = listOf(1, 10, 100, 1000)
    val result = exampleList.fold(initial = 0, operation = { sum, number ->
        sum + number
    })
    println(result)

    // This fold function can be used to implement any operation

    // This shows the breakdown:
    foldReplace()


    // There is also fold right that processes elements from the right to left

    //fold combines all the elements of a list to achieve a single result.
    val resultRight = exampleList.foldRight(initial = 0, operation = { sum, number ->
        sum + number
    })
    println(resultRight)

    //Reduce uses the first element as the initial value

    val reduce = exampleList.reduce(operation = { sum, number ->
        sum + number
    })
    println(reduce)

    // Reduce right uses the right element

    val reduceRight = exampleList.reduceRight(operation = { sum, number ->
        sum + number
    })
    println(reduce)

    // Running Fold function, prints a list of all the results of each calculation

    val runFold = exampleList.runningFold(initial = 0, operation = { sum, number ->
        sum + number
    })
    println(runFold)


}



fun foldReplace() {
    val list = listOf(1, 10, 100)
    var accumulator = 0
    val operation = { sum: Int, number: Int -> sum + number }
    for (number in list) {
        accumulator = operation(accumulator, number)
    }
    println(accumulator)
}

