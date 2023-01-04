package com.example.day3

fun main() {
    math(4.0,2.0,"/")
}
fun math(num1 : Double , num2 : Double , equal : String){
    when (equal) {
        "+" -> println(num1+num2)
        "-" -> println(num1-num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1 / num2)
        else -> println("Isn't correct")
    }
    return
}