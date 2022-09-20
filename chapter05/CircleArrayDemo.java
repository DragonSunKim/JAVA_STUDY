// Coding By 김용선.

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArrayDemo {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5]; // 객체 배열 생성

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1.0); // 각각의 객체를 생성해 배열에 대입
            System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].getRadius(), circles[i].findArea());
        }
    }
}