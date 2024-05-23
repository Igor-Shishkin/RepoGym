package sda.selfStudyJava.broCode.abstractionClass.personHero;

public class Person {

    String name;
    int age;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("The hero's name is %s, he is %d years old"
                ,this.name, this.age);
    }
}