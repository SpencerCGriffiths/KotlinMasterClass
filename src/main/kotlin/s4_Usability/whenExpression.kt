package org.example.s4_Usability

import kotlin.random.Random

fun main () {
    when(Random.nextInt(from =1, until = 5)) {
         1 -> {
             println("One")
         }
        2 -> {
             println("Two")
         }
        3 -> {
             println("Three")
         }
    }

    // Has to be exhaustive if returning so need an else _
    val result: Int? = when(Random.nextInt(from =1, until = 5)) {
         1 -> {
             1
         }
        2 -> {
             2
         }
        3 -> {
             3
         }

        else -> {
            null
        }
    }

    println(result)


    // Combining with the is operator

    when(getPerson()) {
        is Person1.Male -> {
            println("Male")
        }
        is Person1.Female -> {
            println("Female")
        }
    }


    // Using when and a for with keywords. 
    val numbers = listOf(1, 2, 3, 4, 5)
    for (n in numbers) {
        when(n){
            1 -> {
                // break
            }
            2 -> {
                continue
            }
            3 -> {
                println(3)
            }
            4 -> {
                println(4)
            }
            5 -> {
                println(5)
            }
        }
    }

}


fun getPerson(): Person1 {
    return if (Random.nextInt(from = 1, until =3) == 1 ) Person1.Male else Person1.Female
}

sealed class Person1{
    object Male: Person1()
    object Female: Person1()
}