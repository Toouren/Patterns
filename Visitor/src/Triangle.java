public class Triangle implements IShape {

    public Triangle(Point a, Point b, Point c) {
        this.points.add(a);
        this.points.add(b);
        this.points.add(c);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitTriangle(this);
    }
}
