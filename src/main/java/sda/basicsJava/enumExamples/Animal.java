package sda.basicsJava.enumExamples;

public class Animal {
    private String name;
    private AnimalKind animalKind;
    private int age;

    public Animal(String name, AnimalKind animalKind, int age) {
        this.name = name;
        this.animalKind = animalKind;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalKind getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(AnimalKind animalKind) {
        this.animalKind = animalKind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
