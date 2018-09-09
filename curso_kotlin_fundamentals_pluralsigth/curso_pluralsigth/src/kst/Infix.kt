package kst

fun main(args: Array<String>) {

    var h1 = Header("H1")
    var h2 = Header("H2")

    var h3 = h1 plus h2
    println(h3)

}

class Header(var name: String){
    override fun toString(): String { return name }
}

/*Extensions
fun Header.plus(other : Header) : Header {
    return Header(this.name + other.name)
}*/

infix fun Header.plus(other : Header) : Header {
    return Header(this.name + other.name)
}