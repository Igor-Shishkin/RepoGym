package org.example

import kotlin.math.pow

fun main() {
    println("Hello World!")
    myPrint("I'm Igor")

    val name: String = "Igor"

    println("My name is $name")

    println()

    val number1 = 12
    val number2 = 3
    val number3 = 5

    val result1 = number1/number2
    val result2: Float = number1.toFloat()/number3

    println("$result1: " + result1.javaClass )
    println("$result2: " + result2.javaClass)

    val powResult = number1.toDouble().pow(number2.toDouble())
    print(powResult)
}

fun myPrint(text: String) {
    println(text)
}