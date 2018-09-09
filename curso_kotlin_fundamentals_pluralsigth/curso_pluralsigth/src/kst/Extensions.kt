package kst

fun main(args: Array<String>){
    val immultavel = 2
    print(immultavel)
    var multavel = 3
    multavel = 24
    println(multavel)

    val text = "With    multiple    whitespace"
    println(replaceMultipleWiteSpace(text))
    println(text.replaceMultipleWiteSpace())

}

fun replaceMultipleWiteSpace(value: String) : String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWiteSpace(value: String = this) : String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}

