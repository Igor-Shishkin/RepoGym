package sda.selfStudyJava.goodPractices.prototype;

public class Circle extends Shape{
    protected int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);;
        if (target != null) {
            this.radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle shape2) || !super.equals(object2)) return false;
        return shape2.radius == radius;
    }
}
