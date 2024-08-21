package org.example

class ConditionTraining {
    var number: Int = 12;
    fun printNumber() {
        print(number)
    }

    companion object {
        fun printStaticMessage() {
            println("This is a static-like method")
        }
    }
}


fun main(args: Array<String>) {
    ConditionTraining.printStaticMessage();
    var condTraining: ConditionTraining = ConditionTraining()
    condTraining.printNumber()
}