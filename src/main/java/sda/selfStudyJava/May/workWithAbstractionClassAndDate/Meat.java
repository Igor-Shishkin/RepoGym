package sda.selfStudyJava.May.workWithAbstractionClassAndDate;

import java.time.LocalDate;
import java.time.Period;


public class Meat extends Fridge {
    public float mass;

    public Meat (String nameOfProduct, boolean isTasty, boolean isBig, LocalDate beOffDate, float mass) {
        super (nameOfProduct, isTasty, beOffDate, isBig);
        this.mass = mass;
        space -= (isBig) ? 10 : 5;
    }

    @Override
    int timeToBeOff() {
        return Period.between(dateNow, beOffDate).getDays();
    }

    public String toString() {
        int portions = (int) (mass / 0.3);
        return super.toString().concat(String.format("\nMass is %.1f kg. It's enough for about %d portions", mass, portions) );
    }

    @Override
    public byte getSpace() {
        return super.getSpace();
    }
}