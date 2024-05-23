package sda.advancedJavaPractice.HomeWork.exercise19;

import java.util.Objects;

public class Laptop extends Computer{
    private final int batteryWh;

    public Laptop(String model, String firma, Processor processor, int ramGB, VideoCard videoCard, int battery) {
        super(model, firma, processor, ramGB, videoCard);
        this.batteryWh = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryWh == laptop.batteryWh;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryWh);
    }

    @Override
    public String toString() {
        return "Laptop {" + super.toString() +
                "battery=" + batteryWh +
                '}';
    }
}
