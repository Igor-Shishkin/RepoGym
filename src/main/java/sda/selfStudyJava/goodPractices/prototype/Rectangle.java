package sda.selfStudyJava.goodPractices.prototype;

public class Rectangle extends Shape{
    protected int width;
    protected int height;

    public Rectangle() {
    }

    public Rectangle (Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }

    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle shape2) || !super.equals(object2)) return false;
        return shape2.width == width && shape2.height == height;
    }
}
