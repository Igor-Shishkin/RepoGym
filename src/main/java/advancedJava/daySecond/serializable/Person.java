package advancedJava.daySecond.serializable;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\t\tage: %d\t\tGender: %s", this.name, this.age, this.gender);
    }

}
