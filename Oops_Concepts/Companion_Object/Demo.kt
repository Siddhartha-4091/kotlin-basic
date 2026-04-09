package Oops_Concepts.Companion_Object

class Demo {
    companion object MyCompanion{
        fun test(){
            println("Name Companion")
        }
    }
}

fun main() {
    Demo.test()
}