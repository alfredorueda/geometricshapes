import static java.lang.Double.compare;

public abstract class Shape implements Comparable<Shape> {

    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area();

    @Override
    public int compareTo(Shape shape) {
        return compare(this.area(), shape.area());
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                '}';
    }
}
