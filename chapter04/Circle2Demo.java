// Coding By 김용선.

class Circle_A {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }

    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);

    }
}

public class Circle2Demo {
    public static void main(String[] args) {
        Circle_A myCircle = new Circle_A();

        // myCircle.radius = 10; Circle 클래스의 radius에 직접 접근하지 못한다.

        myCircle.setRadius(10.0);

        myCircle.show(myCircle.getRadius(), myCircle.findArea());
    }
}
