package Oops_Concepts.Companion_Object

class Student {
    var name="Siddhartha"
    companion object{
        fun stud(a: Int, b:Int):Int{
            return a+b
        }
    }
}
fun main() {
   var hel=Student.stud(2,6)
    println("Sum of two number : "+hel)
}