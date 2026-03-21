package Kotlin_Basic.Pair_Triple

fun main() {

    val (a,b)= Triple("Sourav",23,95)
    println("$a $b")

    val num =Triple("gaurav",12,"hello")
    println("$num")
    println("1. ${num.first}")
    println("2. ${num.second}")
    println("3. ${num.third}")

    val name = Triple("GrandeFather","GrandMother",Triple("Father","Mother","Sun"))
    println("${name.third.third}")
}