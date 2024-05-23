package sda.advancedJavaPractice.HomeWork.exercise26;

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

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", models=" + models +
                '}';
    }
}