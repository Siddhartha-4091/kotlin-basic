package Oops_Concepts.Inheritance

open class Sub_class {
    var names="jon"
    fun add(x: Int, y: Int):Int{
        return x+y
    }
} class Super_class:Sub_class(){

}

fun main() {
    val name=Super_class()
    println("Show the name :"+name.names)
    println("Add number :"+name.add(12,36))
}