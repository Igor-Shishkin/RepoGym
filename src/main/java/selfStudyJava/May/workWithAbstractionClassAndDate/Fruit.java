package selfStudyJava.May.workWithAbstractionClassAndDate;
import java.time.LocalDate;
import java.time.Period;

public class Fruit extends Fridge {
    byte quantity;

    public Fruit (String nameOfProduct, boolean isTaste, boolean isBig, LocalDate beOffDate, byte quantity) {
        super(nameOfProduct, isTaste, beOffDate, isBig);
        this.quantity = quantity;
        space -= (isBig) ? 4 * quantity : 2 * quantity;
    }
    int timeToBeOff() {
        return Period.between(dateNow, beOffDate).getDays();
    }
    public String toString() {
        return super.toString().concat(String.format("\nThis is %d pieces.", quantity));
    }

    @Override
    public byte getSpace() {
        return super.getSpace();
    }
}