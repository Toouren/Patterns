public class Rectangle implements IShape {
    public Rectangle(Point a, Point b, Point c, Point d) {
        this.points.add(a);
        this.points.add(b);
        this.points.add(c);
        this.points.add(d);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitRectangle(this);
    }
}
