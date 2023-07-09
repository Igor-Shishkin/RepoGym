package advancedJavaPractice.secondDay.solution.zad9;

import java.util.List;

class Circle {

	private final Point2D center;
	private final Point2D point;

	Circle(Point2D center, Point2D point) {
		this.center = center;
		this.point = point;
	}

	public double getRadius() {
		double dx = point.getX() - center.getX();
		double dy = point.getY() - center.getY();
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}

	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public List<Point2D> getSlicePoints() {
		double distanceX = center.getX() - point.getX();
		double distanceY = center.getY() - point.getY();
		return List.of(
				point,
				new Point2D(center.getX() - distanceY, center.getY() + distanceX),
				new Point2D(center.getX() + distanceX, center.getY() + distanceY),
				new Point2D(center.getX() + distanceY, center.getY() - distanceX)
		);
	}
}
