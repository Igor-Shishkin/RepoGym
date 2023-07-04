package advancedJava.daySecond.inheritance.interfacesExampleTwo.impl;

import advancedJava.daySecond.inheritance.interfacesExampleTwo.RemoteController;

public class TVRemoteController implements RemoteController {
    @Override
    public void enable(boolean enable) {
        System.out.println("Switch on TV");
    }
}
