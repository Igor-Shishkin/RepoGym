package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.impl;
import advancedJava.daySecond.inheritance.interfacesExampleTwo.RemoteController;
import sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.RemoteController;

public class PolimorphismExample {
    public static void main(String[] args) {
        RemoteController remoteController;
        remoteController = new TVRemoteController();
        remoteController.enable(true);
        remoteController = new ACRemoteController();
        remoteController.enable(false);
    }
}
