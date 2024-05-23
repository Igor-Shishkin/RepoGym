package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.impl;

import advancedJava.daySecond.inheritance.interfacesExampleTwo.RemoteController;
import sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.RemoteController;

public class ACRemoteController implements RemoteController {
    @Override
    public void enable(boolean enable) {
        System.out.println("Switch on climatisation");
    }
}
