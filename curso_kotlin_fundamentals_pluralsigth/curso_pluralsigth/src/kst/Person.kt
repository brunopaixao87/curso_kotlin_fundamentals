package kst

abstract class Person {
    var firtName = ""
    var lastName = ""

    open fun getName() : String = "$firtName $lastName"
    abstract fun getAddress() : String
}

class Student : Person() {

    override fun getAddress(): String {
        return ""
    }

}