package org.example.s5_FunctionalProgramming

import kotlin.random.Random

fun main () {
    val numbers = listOf(1, 2, 3)
    //.map uses a lambda as the argument (transform: (T) -> R)
    val quotedNumbers = numbers.map { number ->
    "\"$number\""
    }

    println(quotedNumbers) // ["1", "2", "3"]
    println(numbers) // [1, 2, 3]

    val quotedNumbers1 = numbers.map (transform = { number ->
        "\"$number\""
    })

    // JoinToString - Lambda is the last parameter (trailing lambda) does not need to be named
    // (separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", transform: ((T) -> CharSequence)? = null)

    val quotedNumbers2 = numbers.joinToString { number ->
        "\"$number\""
    }
    println(quotedNumbers2) //"1", "2", "3"

    //There is time when it needs to be written explicitly

    val quoted = {number: Int -> "\"$number\""} // Cannot infer a type

    // We can pass quoted as it is a lambda
    val quotedNumbers3 = numbers.joinToString(transform = quoted)

    println(quotedNumbers3) //"1", "2", "3"

    val quotedNumbers4 = numbers.mapIndexed{_, number ->
        "$number"
    }
    println(quotedNumbers4) //[1, 2, 3]

    button(onClick = {
        println("clicked")
    })

    button {
        println("clicked")
    }

    button2{ random ->
        "$random"
    }
}


// creating a lambda

fun button(onClick: () -> Unit) {
    onClick()
}

fun button2(onClick: (Int) -> String) {
    onClick(Random.nextInt(from = 0, until = 100))
}

// A Lambda is an anonymous function we can treat as a value
// we can pass as arguments or return them the same as other objects
// They are function literals, not declared but passed immediately as an expression.

// Rules:
// A lambda is always surrounded by curly brackets
// The parameters inside the lambda go in the brackets, type is optional
// if it is not a unit then the last value will be the return value (multiple lines)
