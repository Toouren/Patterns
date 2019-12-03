public class main {
    public static void main(String[] strings) {
        Triangle triangle = new Triangle(
                new Point(1, 0),
                new Point(10, 12),
                new Point(-3, -5)
        );

        Rectangle rectangle = new Rectangle(
                new Point(1, 0),
                new Point(10, 12),
                new Point(-3, -5),
                new Point(5, -3)
        );

        Pentagon pentagon = new Pentagon(
                new Point(1, 0),
                new Point(10, 12),
                new Point(-3, -5),
                new Point(5, -3),
                new Point(9, -4)
        );

        DrawVisitor drawVisitor = new DrawVisitor();
        GetAreaVisitor getAreaVisitor = new GetAreaVisitor();
        GetPerimetrVisitor getPerimetrVisitor = new GetPerimetrVisitor();

        triangle.accept(drawVisitor);
        triangle.accept(getPerimetrVisitor);

        rectangle.accept(getAreaVisitor);
        rectangle.accept(getPerimetrVisitor);

        pentagon.accept(getAreaVisitor);
        pentagon.accept(drawVisitor);
    }
}
