package sda.selfStudyJava.broCode.abstractionClass.Shape;

public class Main {
    public static void main(String[] args) {

        Shape shapeOne = new Circle ("red", 5.8);
        Shape shapeTwo = new Rectangle("green", 5,9);

        System.out.println(shapeOne);
        //System.out.println(shapeTwo);

    }
}
