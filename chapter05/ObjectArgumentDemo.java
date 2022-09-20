// Coding By 김용선.

class Circle2 {
    double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }
}

public class ObjectArgumentDemo {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(10.0);
        Circle2 c2 = new Circle2(10.0);

        zero(c1);
        System.out.println("원(c1)의 반지름 : " + c1.getRadius());

        zero(c2.getRadius());
        System.out.println("원(c2)의 반지름 : " + c2.getRadius());

        zero((int) c2.getRadius());
        System.out.println("원(c2)의 반지름 : " + c2.getRadius());

    }

    public static void zero(Circle2 c) {
        c.radius = 0.0;
    }

    public static void zero(double r) {
        r = 0.0;
    }

    public static void zero(int r) {
        r = 1;
    }
}
