package Oops_Concepts.Polymorphism

open class Run_time {
    open val name = "Sagar"

    open fun high(x: Int,y:Int): Int{
        return x+y
    }
}class complin_time: Run_time(){

    override val name="Siddhartha"
    override fun high(x:Int, y: Int):Int{
        return x-y
    }
}

fun main() {
    val demo=complin_time()
    val dem=Run_time()

    println("This is a name :"+demo.name+" number:"+demo.high(36,12))
    println("This is a name :"+dem.name+" number:"+dem.high(12,45))
}