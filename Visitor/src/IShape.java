import java.util.ArrayList;

public interface IShape {
    public ArrayList<Point> points = new ArrayList<>();

    void accept(IVisitor visitor);
}
