package Oops_Concepts.Inheritance

interface ATM_1{
    fun show(){
        println("ATM 1 is a interface")
    }
}
interface ATM_2{
    fun show(){
        println("ATM 2 is a interface")
    }
}
class Bank : ATM_1,ATM_2{
    override fun show() {
        super<ATM_1>.show()
        super<ATM_2>.show()
    }
}

fun main() {
    val banks=Bank()
    banks.show()
}