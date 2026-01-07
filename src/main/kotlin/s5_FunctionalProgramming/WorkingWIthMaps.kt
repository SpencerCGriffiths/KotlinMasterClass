package org.example.s5_FunctionalProgramming

fun main () {
    val names = listOf("Jack", "Jane", "Jill", "Hill", "Water")
    val ages = listOf(21,15,25,25,42)
    val peoples = names.zip(ages) {name, age ->
        Silly(name, age)
    }
    println(peoples) // [Silly(name=Jack, age=21), Silly(name=Jane, age=15), Silly(name=Jill, age=25), Silly(name=Hill, age=25), Silly(name=Water, age=42)]

    // group by

    val map: Map<Int, List<Silly>> = peoples.groupBy(Silly::age)
    println(map) // {21=[Silly(name=Jack, age=21)], 15=[Silly(name=Jane, age=15)], 25=[Silly(name=Jill, age=25), Silly(name=Hill, age=25)], 42=[Silly(name=Water, age=42)]}
    println(map[21]) //[Silly(name=Jack, age=21)]

    // Associate With (Changes the Key Value pairing order)

    val map2 = peoples.associateWith(Silly::name)
    println(map2) // {Silly(name=Jack, age=21)=Jack, Silly(name=Jane, age=15)=Jane, Silly(name=Jill, age=25)=Jill, Silly(name=Hill, age=25)=Hill, Silly(name=Water, age=42)=Water}

    val map3 = peoples.associateBy(Silly::name) // This then does the same as before
    println(map3) // {Jack=Silly(name=Jack, age=21), Jane=Silly(name=Jane, age=15), Jill=Silly(name=Jill, age=25), Hill=Silly(name=Hill, age=25), Water=Silly(name=Water, age=42)}

    // Accessing Pairs inside a map

    println(map3.keys)
    println(map3.values)
    println(map3.getOrElse(key ="Alice123") {"Unknown"})
    println(map3.getOrElse(key ="Jack") {"Unknown"})
    println(map3.toMutableMap().getOrPut(key ="Jack") {Silly(name = "Unknown", age = 12)})
    println(map3.filterKeys { it.startsWith(prefix = "A") })
}

data class Silly(val name: String, val age: Int)