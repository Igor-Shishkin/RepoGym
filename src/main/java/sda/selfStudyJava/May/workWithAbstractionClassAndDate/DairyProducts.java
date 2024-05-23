package sda.selfStudyJava.May.workWithAbstractionClassAndDate;

import java.time.LocalDate;
import java.time.Period;
public class DairyProducts extends Fridge {
    byte quantity;

    public DairyProducts (String nameOfProduct, boolean isTasty, boolean isBig, LocalDate beOffDate, byte quantity) {
        super (nameOfProduct, isTasty, beOffDate, isBig);
        this.quantity = quantity;
        space -= (isBig) ? 10 * quantity : 5 * quantity;
    }

//    @Override
//    int timeToBeOff() {
//        return Period.between(dateNow, beOffDate).getDays();
//    }
//
    @Override
    public byte getSpace() {
        return super.getSpace();
    }

    @Override
    int timeToBeOff() {
        return Period.between(dateNow, beOffDate).getDays();
    }

    public String toString() {
        return super.toString().concat(String.format("\nThis is %d pieces.", quantity));
    }
}
