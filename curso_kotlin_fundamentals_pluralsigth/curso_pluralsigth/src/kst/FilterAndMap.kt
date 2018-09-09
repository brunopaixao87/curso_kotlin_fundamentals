package kst

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)
    val smallInts = ints.filter { it < 4 }

    for (value: Int in smallInts) println(value)

    val squareInts = ints.map { it * it }

    for (value: Int in squareInts) println(value)

    val squareSmallInts = ints
            .filter { it < 5 }
            .map { it * it }

    for (value: Int in squareSmallInts) println(value)

    val meetings = listOf(Meetting(1, "Board Meeting"), Meetting(2, "Committe Meeting"))

    var titles = meetings.map { m -> m.title  }

    for (title in titles) println(title)
}

class Meetting(val id: Int, val title: String) {

}