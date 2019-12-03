public class Pentagon implements IShape {
    public Pentagon(Point a, Point b, Point c, Point d, Point e) {
        this.points.add(a);
        this.points.add(b);
        this.points.add(c);
        this.points.add(d);
        this.points.add(e);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitPentagon(this);
    }
}
