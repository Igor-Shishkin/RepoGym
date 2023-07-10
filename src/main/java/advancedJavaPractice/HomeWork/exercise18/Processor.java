package advancedJavaPractice.HomeWork.exercise18;

import java.util.Objects;

public class Processor {
    private final String model;
    private final int BoostClockMHz;
    private final int Cores;

    public Processor(String model, int boostClockMHz, int cores) {
        this.model = model;
        BoostClockMHz = boostClockMHz;
        Cores = cores;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Processor)) return false;
//        Processor processor = (Processor) o;
//        return BoostClockMHz == processor.BoostClockMHz && Cores == processor.Cores &&
//                Objects.equals(model, processor.model);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(model, BoostClockMHz, Cores);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", BoostClockMHz=" + BoostClockMHz +
                ", Cores=" + Cores +
                '}';
    }
}
