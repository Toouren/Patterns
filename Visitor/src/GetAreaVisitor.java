public class GetAreaVisitor implements IVisitor {

    @Override
    public void visitTriangle(Triangle t) {
        System.out.println(
                String.format(
                        "Посчитать площадь треугольника в точках A=%s, B=%s, C=%s",
                        t.points.get(0),
                        t.points.get(1),
                        t.points.get(2)
                ));
    }

    @Override
    public void visitRectangle(Rectangle r) {
        System.out.println(
                String.format(
                        "Посчитать площадь треугольника в точках A=%s, B=%s, C=%s, D=%s",
                        r.points.get(0),
                        r.points.get(1),
                        r.points.get(2),
                        r.points.get(3)
                ));
    }

    @Override
    public void visitPentagon(Pentagon p) {
        System.out.println(
                String.format(
                        "Посчитать площадь пятиугольника в точках A=%s, B=%s, C=%s, D=%s, E=%s",
                        p.points.get(0),
                        p.points.get(1),
                        p.points.get(2),
                        p.points.get(3),
                        p.points.get(4)
                ));
    }
}
