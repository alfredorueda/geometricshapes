import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + getColor() + ", " +
                "radius=" + radius + ", " +
                "area=" + area() + ", " +
                '}';
    }

}
