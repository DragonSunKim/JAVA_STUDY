// Coding By 김용선.

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void draw() {
        System.out.println("사각형을 그리다.");
    }

    public double findArea() {
        return width * height;
    }
}
