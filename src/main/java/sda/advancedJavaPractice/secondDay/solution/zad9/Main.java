package sda.advancedJavaPractice.secondDay.solution.zad9;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(1.0, 0.0));

		System.out.println("radius: " + circle.getRadius());
		System.out.println("perimeter: " + circle.getPerimeter());
		System.out.println("area: " + circle.getArea());

		System.out.println(circle.getSlicePoints());
	}

}
