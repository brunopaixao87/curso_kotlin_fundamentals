package kst

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5, 6, 7)

    //Predicate
    val greaterThanThree = {v:Int -> v > 3}

    //Todos são a regra > 3?
    var largeInts = ints.all(greaterThanThree)

    println(largeInts)

    largeInts = ints.any { it > 3}

    println(largeInts)

    var numberOfLargeInts = ints.count { it > 3 }

    println(largeInts)

    var founds = ints.find { it > 6 }
    println(founds)
}