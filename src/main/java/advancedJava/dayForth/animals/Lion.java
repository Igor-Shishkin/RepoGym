package advancedJava.dayForth.animals;

import java.util.Objects;

public class Lion extends Animals {
    int age;
    public Lion(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lion)) return false;
        Lion lion = (Lion) o;
        return age == lion.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
