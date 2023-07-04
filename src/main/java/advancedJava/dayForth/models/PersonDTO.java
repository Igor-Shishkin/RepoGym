package advancedJava.dayForth.models;

import advancedJava.dayForth.models.utils.Person;

public class PersonDTO {
    private final Integer id;
    private final Integer age;
    private final String name;

    public PersonDTO(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public static PersonDTO map(Person person) {
        return new PersonDTO(person.getId(), person.getAge(), person.getFirstName() + " " + person.getLastName());
    }
}
