package org.example.s5_FunctionalProgramming

// Sequence is like a list, can iterate but not indexed.
// Also known as a Stream
fun main() {

    val exampleList = listOf(1,2,3,4)
    println("--ExampleList--")
    // Eager Evaluation / Horizontal Evaluation
    exampleList.filter(Int::isEven).map(Int::square).any(Int::lessThanTen)
    // Lists are eagerly evaluated
    println(exampleList)

    // Lazy Eval / Vertical Evaluation
    val exampleSeq = sequenceOf(1,2,3,4)
    println("--Sequence--")
    exampleSeq.filter(Int::isEven).map(Int::square).any(Int::lessThanTen)
    exampleList.asSequence().filter(Int::isEven).map(Int::square).any(Int::lessThanTen)

}

fun Int.isEven(): Boolean {
    println("isEven()")
    return this % 2 == 0
}

fun Int.square(): Int {
    println("isSquare()")
    return this * this
}

fun Int.lessThanTen(): Boolean {
    println("isLessThanTen()")
    return this < 10
}
