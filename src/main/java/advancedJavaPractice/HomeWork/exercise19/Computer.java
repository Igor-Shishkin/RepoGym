package advancedJavaPractice.HomeWork.exercise19;

import java.util.Objects;

public class Computer {
    private final String model;
    private final String firma;
    private final Processor processor;
    private final int RamGB;
    private final VideoCard videoCard;

    public Computer(String model, String firma, Processor processor, int ramGB, VideoCard videoCard) {
        this.model = model;
        this.firma = firma;
        this.processor = processor;
        RamGB = ramGB;
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "model='" + model + '\'' +
                ", firma='" + firma + '\'' +
                ", processor=" + processor +
                ", RamGB=" + RamGB +
                ", videoCard=" + videoCard +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return RamGB == computer.RamGB && Objects.equals(model, computer.model) &&
                Objects.equals(firma, computer.firma) && Objects.equals(processor, computer.processor) &&
                Objects.equals(videoCard, computer.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, firma, processor, RamGB, videoCard);
    }
}
