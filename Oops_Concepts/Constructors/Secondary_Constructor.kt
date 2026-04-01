package Oops_Concepts.Constructors

class Secondary_Constructor {
    var name:String=""
    var age:Int=0

    constructor(name: String, age: Int){
        this.name=name
        this.age=age
    }

}

fun main() {
    val s1=Secondary_Constructor("Sagar", 24)
    println(s1.name)
    println(s1.age)

}