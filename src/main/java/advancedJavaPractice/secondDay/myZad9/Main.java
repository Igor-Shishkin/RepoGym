package advancedJavaPractice.secondDay.myZad9;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(new Point2D(3,4), new Point2D(0,0));

        System.out.println(circle1);
        circle1.getSlicePoints();
    }
}
