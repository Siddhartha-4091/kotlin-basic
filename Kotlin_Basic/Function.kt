package Kotlin_Basic


fun text(){
    println("Hello Student!!")
}

fun sum(a:Int, b: Int): Int {
    return a+b
}

fun sum(a: Int, b: Int, c: Int)=a+b+c



fun main() {
    text()
    println("Sum the method 1: ${sum(12,67)}")
    println("Sum the method 2: "+ sum(12,12,12))
}