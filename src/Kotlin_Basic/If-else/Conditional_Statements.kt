package Kotlin_Basic.`If-else`

fun main() {
    var num=70

   var msg=""
   msg=if(num>100)"No. is Greater" else "No. is Smaller"

    println(msg)

    if (num>100){

    }else if(num>70){

    }else if(num==100){

    }else{

    }


//    if(num>100){
//        println("this number are greater!")
//    }else{
//        println("this number are not greater")
//    }

    when {
        num >= 1 -> {
            println("ssadhjag")
        }
        num < 100 ->{
            println("sajdagd")
        }

    }
}