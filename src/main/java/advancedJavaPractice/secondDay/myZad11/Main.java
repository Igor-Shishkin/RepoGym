package advancedJavaPractice.secondDay.myZad11;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(3.0, 4.0));

//		System.out.println("radius: " + circle.getRadius());
//		System.out.println("perimeter: " + circle.getPerimeter());
//		System.out.println("area: " + circle.getArea());
//
//		circle.move(new MoveDirection(10.0, 0.0));
//
//		System.out.println("radius: " + circle.getRadius());
//		System.out.println("perimeter: " + circle.getPerimeter());
//		System.out.println("area: " + circle.getArea());

		System.out.println(circle);

		circle.resize(3);
		System.out.println("\n" + circle);

	}



}
