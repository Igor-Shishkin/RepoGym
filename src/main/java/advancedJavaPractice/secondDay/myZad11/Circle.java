package advancedJavaPractice.secondDay.myZad11;

class Circle implements Movable, Resizable{

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

	@Override
	public void move(MoveDirection moveDirection) {
		center.move(moveDirection);
		point.move(moveDirection);
	}

	@Override
	public void resize(double resizeFactor) {
		double distanceX = getCenter().getX() - getPoint().getX();
		double distanceY = getCenter().getY() - getPoint().getY();

		point.move(distanceX*resizeFactor, distanceY*resizeFactor);
	}


	public Point2D getCenter() {
		return center;
	}

	public Point2D getPoint() {
		return point;
	}

	@Override
	public String toString() {
		return String.format("Circle{point=%s\n center=%s\nradius=%02.2f\nperimetr=%02.2f\naria=%02.2f}"
				, point.toString(), center.toString(), getRadius(), getPerimeter(), getArea());
	}

}
