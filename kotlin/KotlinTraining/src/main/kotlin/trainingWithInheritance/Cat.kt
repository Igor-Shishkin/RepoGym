package org.kotlin.training.trainingWithInheritance

class Cat(name: String, age: Int, private val sound: String) : Animal(name, age), Speakable {


    override fun makeSomeSound() {
        println(sound)
    }
}