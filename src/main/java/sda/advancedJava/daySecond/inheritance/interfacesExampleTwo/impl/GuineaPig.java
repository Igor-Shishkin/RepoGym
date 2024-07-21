package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.impl;

import sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.Pet;

public class GuineaPig implements Pet {
    @Override
    public void sound() {
        System.out.println("Squeaks");
    }
}
