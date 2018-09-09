package kst

fun main(args: Array<String>){
    var kevin = Student2(1, "Kevin")
    var jones = Student2(1, "Kevin")

    println(kevin)

    if(kevin == jones){
        println("Equal")
    } else {
        println("Not Equal")
    }

    var newKevin = kevin.copy(name = "Robert")
    println(newKevin)
}

data class Student2(val id: Int, val name: String) {
}


/* Not Equal
class Student2(val id: Int, val name: String) {
}
*/