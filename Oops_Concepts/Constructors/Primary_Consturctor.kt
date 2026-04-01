package Oops_Concepts.Constructors

class Primary_Consturctor(val name:String, val age:Int) {
    init {
        println("hello guys")
    }
    init {
        println("hello sagar")
    }
}

fun main() {
    val p1=Primary_Consturctor("Gaurav",22)
    println(p1.name)
    println(p1.age)
}