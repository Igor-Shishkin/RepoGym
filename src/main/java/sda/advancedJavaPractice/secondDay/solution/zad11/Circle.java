package sda.advancedJavaPractice.secondDay.solution.zad11;

class Circle implements Movable, Resizable {

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
		double distanceX = Math.abs(center.getX() - point.getX());
		double distanceY = Math.abs(center.getY() - point.getY());

		//xp = xc + dx*resizeFactor
		point.setX(center.getX() + distanceX * resizeFactor);
		point.setY(center.getY() + distanceY * resizeFactor);
	}
}
