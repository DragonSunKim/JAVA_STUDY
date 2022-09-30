package challenge_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Coding By 김용선.

public class ShapeTest {
    static List<Shape> findShapesByType(List<Shape> shapes, String type) {
        ArrayList<Shape> array = new ArrayList<>();

        for (Shape s : shapes) {
            if (s.getType().equals(type))
                array.add(s);
        }
        return array;
    }

    static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {
        ArrayList<Shape> array = new ArrayList<>();

        for (Shape s : shapes) {
            if (s.getColor().equals(color) && s.getArea() <= area)
                array.add(s);
        }
        return array;
    }

    static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
        ArrayList<Shape> array = new ArrayList<>();

        if (color == null && area == null) {
            for (Shape s : shapes) {
                if (s.getType().equals(type))
                    array.add(s);
            }
        } else if (type == null) {
            for (Shape s : shapes) {
                if (s.getColor().equals(color) && s.getArea() <= area)
                    array.add(s);
            }
        }

        return array;
    }

    static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
        ArrayList<Shape> array = new ArrayList<>();

        for (Shape s : shapes) {
            if (p.test(s))
                array.add(s);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("사각형 : " + findShapesByType(Shape.shapes, "사각형"));
        System.out.println("빨간 도형(면적<=12.0) : " + findShapesByColorNArea(Shape.shapes, "빨간색", 12));

        System.out.println();

        System.out.println("사각형 : " + findShapes(Shape.shapes, "사각형", null, null));
        System.out.println("빨간 도형(면적<=12.0) : " + findShapes(Shape.shapes, null, "빨간색", 12.0));

        System.out.println();

        System.out.println("사각형 : " + findShapes(Shape.shapes, c -> c.getType().equals("사각형")));
        System.out.println("빨간 도형(면적<=12.0) : "
                + findShapes(Shape.shapes, c -> c.getColor().equals("빨간색") && c.getArea() <= 12.0));
    }
}
