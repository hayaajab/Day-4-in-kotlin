package com.example.day3

fun main() {
   /* val averag_array = arrayListOf<Double>(1.0,2.2,3.6,4.4,5.0)

    for (index:Double in averag_array) {
        var sum:Double = 0.0
        sum += index
        var a = averag_array.size
        println( sum /a.toDouble())



    }*/

    val numArray = doubleArrayOf(6.0,5.8,2.4,4.6,7.8)
    var sum = 0.0
    for (num in numArray){
        sum += num
    }
    val average = sum / numArray.size
    println("the average is : $average")






}
