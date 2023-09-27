package selfStudyJava.goodPractices.prototype;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape() {}

    public Shape (Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;;
            this.color = target.color;
        }
    }
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return shape2.x == this.x && shape2.y == this.y && shape2.color == this.color;
    }
}
