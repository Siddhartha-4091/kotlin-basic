package Oops_Concepts.Inheritance

open class Animal {
    fun eat(){
        println("Animal eat")
    }
}open class Dog : Animal(){
    fun bark(){
        println("Dog barks")
    }
}class Puppy : Dog(){
    fun weep(){
        println("Puppy weeps")
    }
}

fun main() {
    val A1=Puppy()
    A1.weep()
    A1.bark()
    A1.eat()
}