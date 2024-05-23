package sda.selfStudyJava.broCode.abstractionClass.Shape;

public class Circle extends Shape {

    double radius;

    public Circle (String color, double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is ".concat(getColor()).concat(" and area is ").concat(String.valueOf(area()));
    }
}
