package sda.advancedJavaPractice.secondDay.myZad26;

import java.util.List;

class Manufacturer {
    public String name;
    public int yearOfCreation;
    List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }
}