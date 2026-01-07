package org.example.s4_Usability


// Pair is alike a Tuple
fun main() {
    val pair = Pair(first = 1, second = "Spencer")
    println(pair) //(1, Spencer)
    println(pair.first) //1
    println(pair.second) //Spencer

    val (id, name) = pair
    println(id) //1
    println(name) //Spencer

    val tupleExample = TupleExample(first = "1", second = "2", third = "3")

    val(one, two, _) = tupleExample
    println(one) // 1
    println(two) // 1
}

data class TupleExample(
    val first: String,
    val second: String,
    val third: String
)