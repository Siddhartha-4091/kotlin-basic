package Oops_Concepts.Companion_Object

class MyClass {
    companion object{
        var count=0

        fun increment(){
            count++
        }
    }
}

fun main() {
    MyClass.increment()
    MyClass.increment()
    println("Show the increment number :"+MyClass.count)
}