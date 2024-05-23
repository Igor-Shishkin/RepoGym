package sda.selfStudyJava.broCode.abstractionClass.Shape;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color is ".concat(getColor()).concat(" and area is ".concat(String.valueOf(area())));
    }
}
