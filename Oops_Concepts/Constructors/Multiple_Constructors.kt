package Oops_Concepts.Constructors

class Multiple_Constructors {
    var brand: String
    var year: Int

    constructor(brand: String, year: Int) {
        this.brand = brand
        this.year = year
    }

    constructor(brand: String) {
        this.brand = brand
        this.year = 2020
    }
}

fun main() {
    val m1=Multiple_Constructors("kya",2024)
    val m2=Multiple_Constructors("kya")

    println("Car1 name= ${m1.brand} year= ${m1.year}")
    println("Car2 name= ${m2.brand} year= ${m2.year}")

}