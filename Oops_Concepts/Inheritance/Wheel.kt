package Oops_Concepts.Inheritance

open class Wheel {
    fun car(){
        println("car is a wheel")
    }
}
class Track : Wheel(){
    fun Tata_track(){
        println("track is a wheel")
    }
}
class Bike : Wheel(){
    fun Hero_bike(){
        println("Bike is a wheel")
    }
}

fun main() {
    val wheel1=Wheel()
    wheel1.car()
}