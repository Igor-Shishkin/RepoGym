package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.impl;

import advancedJava.daySecond.inheritance.interfacesExampleTwo.MediaPlayer;
import sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.MediaPlayer;

public class MediaPlayerImpl implements MediaPlayer {
    private String name = "Implementation in class";

    public String getName() {
        return name;
    }

    @Override
    public void stop() {
        System.out.println("Implementation STOP in class");
    }

    @Override
    public void next() {
        MediaPlayer.super.next();
    }
}
