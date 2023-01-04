package com.example.day3

fun main() {

    val numArray = doubleArrayOf(6.0,5.8,2.4,4.6,7.8)
    var sum = 0.0
    for (num in numArray){
        sum += num
    }
    val average = sum / numArray.size
    println("the average is : $average")
}
