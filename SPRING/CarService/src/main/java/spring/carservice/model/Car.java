package spring.carservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@NonNull
public class Car extends RepresentationModel<Car> {
    private int id;
    private String mark;
    private String model;
    private Color color;
}
