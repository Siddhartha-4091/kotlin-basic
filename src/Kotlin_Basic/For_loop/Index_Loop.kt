package Kotlin_Basic.For_loop

fun main() {
    val name = listOf("Ram","Shyam","Mohan","Sager")

    for (i in name.indices){
        println("Index: $i Value: ${name[i]}")
    }
}