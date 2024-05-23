package sda.selfStudyJava.May.workWithAbstractionClassAndDate;

import java.time.LocalDate;

public abstract class Fridge {
    String nameOfProduct;
    boolean isTasty;
    boolean isBig;
    LocalDate beOffDate;
    public byte space = 100;
    LocalDate dateNow = LocalDate.now();

    abstract int timeToBeOff();

    //abstract byte freeSpace();

    public Fridge(String nameOfProduct, boolean isTasty, LocalDate beOffDate, boolean isBig) {
        this.nameOfProduct = nameOfProduct;
        this.isTasty = isTasty;
        this.isBig = isBig;
        this.beOffDate = beOffDate;
    }
    public String toString() {
        String tasty = (isTasty) ? "tasty" : "not tasty";

        return String.format("You put in the FRIDGE '%s'. It's %s. There are %d days until the expiration date."
                , this.nameOfProduct, tasty, timeToBeOff());
    }

    public byte getSpace() {
        return space;
    }
}
