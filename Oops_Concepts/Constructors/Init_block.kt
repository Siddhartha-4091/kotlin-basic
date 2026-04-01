package Oops_Concepts.Constructors

class Init_block(val course:String, val id:Int) {
    init {  //this is a init method isma aap extra logic likh sakto ho
        println("hello Sir")
    }
}

fun main() {
    val p2=Init_block("BCA",206)
    println(p2.course)
    println(p2.id)
}