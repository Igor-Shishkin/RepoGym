package sda.advancedJavaPractice.HomeWork.exercise19;

import java.util.Objects;

public class VideoCard {
    private final String model;
    private final int MemoryGB;

    public VideoCard(String model, int memoryGB) {
        this.model = model;
        MemoryGB = memoryGB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoCard)) return false;
        VideoCard videoCard = (VideoCard) o;
        return MemoryGB == videoCard.MemoryGB && Objects.equals(model, videoCard.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, MemoryGB);
    }

    @Override
    public String toString() {
        return "VideoCard {" +
                "model='" + model + '\'' +
                ", MemoryGB=" + MemoryGB +
                '}';
    }
}
