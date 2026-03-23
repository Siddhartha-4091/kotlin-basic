package Oops_Concepts.Class_Object

class Human {
    var someInt =10
    fun Add(a:Int, b:Int) :Int{
        return a+b
    }
}
fun main() {
    val hm = Human()
    println("the Integer is: "+hm.someInt)
    println("the Integer is: "+Human().someInt)
    println("the Sum: "+Human().Add(4,6))

}