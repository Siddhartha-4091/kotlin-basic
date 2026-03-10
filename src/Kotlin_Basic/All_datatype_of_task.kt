package Kotlin_Basic

fun main(){

    //var-> Mutable (value change ho sakti hai)
    var name="Gaurav"
    name="Sagar"    //allowed
    println(name)

    //val-> Immutable (value change nahi ho sakti)
    val num= 22
    //num = 5     //not allowed
    println(num)

    val marks: Int = 95
    val bigNumber: Long = 123456789L
    println("$marks\n$bigNumber")

    val price: Float = 99.99f
    val percentage: Double = 99.99
    println("$price\n$percentage")

    val grade: Char = 'A'
    println(grade)

    val isActive: Boolean = true
    println(isActive)


    //String Interpolation
    val age = 25
    println("My age is $age")

    //Agar null allow karna ho to ? lagate hain:
    var namesb: String? = null   // ✅ Allowed
    println(namesb)
    println(namesb?.length)

}