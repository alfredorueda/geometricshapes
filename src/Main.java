import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // 'Shape' is abstract; cannot be instantiated
        // Shape shape = new Shape(Color.BLUE);

        Square square1 = new Square(Color.BLUE, 2);
        Square square2 = new Square(Color.BLUE, 4);
        Square square3 = new Square(Color.BLUE, 5);
        Square square4 = new Square(Color.BLUE, 9);

        Circle circle1 = new Circle(Color.RED, 80);
        Circle circle2 = new Circle(Color.RED, 120);
        Circle circle3 = new Circle(Color.RED, 14);
        Circle circle4 = new Circle(Color.RED, 15);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(square4);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(circle4);

        System.out.println("------------------- Unsorted shapes -------------------");

        shuffle(shapes);

        print(shapes);

        sleep(2000);

        System.out.println("------------------- Sorted shapes -------------------");

        sort(shapes);

        print(shapes);

    }

    private static void print(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
