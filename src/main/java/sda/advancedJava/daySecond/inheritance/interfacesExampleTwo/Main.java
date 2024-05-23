package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo;

import advancedJava.daySecond.inheritance.interfacesExampleTwo.impl.GuineaPig;
import advancedJava.daySecond.inheritance.interfacesExampleTwo.impl.MediaPlayerImpl;
import advancedJava.daySecond.inheritance.interfacesExampleTwo.impl.Sheep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();
        System.out.println(mediaPlayer.getName());
        mediaPlayer.next();
        mediaPlayer.stop();
        System.out.println(MediaPlayerImpl.NAME_OF_INTERFACES);
        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Anna");
        names.add("Alec");

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(0);

        System.out.println("@@@@@@@@@@@@");
        Pet guineaPig = new GuineaPig();
        guineaPig.sound();

        Pet[] listOfAnimals = {guineaPig, new Sheep()};
        for (Pet listOfAnimal : listOfAnimals) {
            System.out.println(listOfAnimal);
        }



    }
}
