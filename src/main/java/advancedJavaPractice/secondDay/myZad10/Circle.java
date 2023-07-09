package advancedJavaPractice.secondDay.myZad10;

public class Circle {
    private final Point2D point;
    private final Point2D center;

    public Circle(Point2D point, Point2D center) {
        this.point = point;
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public Point2D getCenter() {
        return center;
    }
    public double getRadius () {
        double xPoint = getPoint().getX();
        double yPoint = getPoint().getY();
        double xCenter = getCenter().getX();
        double yCenter = getCenter().getY();

        return Math.sqrt ( Math.pow(xCenter-xPoint, 2)+Math.pow(yCenter-yPoint,2) );
    }
    public double getPerimetr () {
        return getRadius()*2*Math.PI;
    }
    public double getArea () {
        return Math.PI*Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return String.format("Circle{point=%s\n center=%s\nradius=%02.2f\nperimetr=%02.2f\naria=%02.2f}"
                , point.toString(), center.toString(), getRadius(), getPerimetr(), getArea());
    }

    public void getSlicePoints() {
        double distanceX = getCenter().getX() - getPoint().getX(); //-3
        double distanceY = getCenter().getY() - getPoint().getY(); //-4
        System.out.printf("Point 1:\tx=%02.2f\ty=%02.2f\n", getPoint().getX(), getPoint().getY());
        System.out.printf("Point 2:\tx=%02.2f\ty=%02.2f\n", getCenter().getX()-distanceY, getCenter().getY()+distanceX);
        System.out.printf("Point 3:\tx=%02.2f\ty=%02.2f\n", getCenter().getX()+distanceX, getCenter().getY()+distanceY);
        System.out.printf("Point 4:\tx=%02.2f\ty=%02.2f\n", getCenter().getX()+distanceY, getCenter().getY()-distanceX);
    }


//    @Override
//    public Point2D moveDirection(MoveDirection moveDirection) {
//        this.center = (center.setX(getCenter().getX()+moveDirection.getX()),
//            (getCenter().getY()+moveDirection.getY());
//        return null;
//    }
}
