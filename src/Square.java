public class Square extends Shape  {

    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + getColor() + ", " +
                "side=" + side + ", " +
                "area=" + area() + ", " +
                '}';
    }
}
