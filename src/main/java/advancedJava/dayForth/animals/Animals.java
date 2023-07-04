package advancedJava.dayForth.animals;

import java.util.Objects;

abstract public class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
