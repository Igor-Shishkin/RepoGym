package sda.advancedJava.dayForth.models.utils;

import java.util.Objects;

public class Person {
        private Integer id;
        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private Integer age;

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String firstName, String lastName, String email, String gender, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person people = (Person) o;
        return Objects.equals(id, people.id) && Objects.equals(firstName, people.firstName) && Objects.equals(lastName, people.lastName) && Objects.equals(email, people.email) && Objects.equals(gender, people.gender) && Objects.equals(age, people.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, gender, age);
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
