// Coding By 김용선.

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Shape 클래스는 추상 클래스이므로 생성자를 사용해 객체를 생성할 수 없다.
        // Shape s = new Shape();

        Circle c = new Circle(3);
        c.draw();
        System.out.printf("원의 넓이는 %.1f\n", c.findArea());

        Rectangle r = new Rectangle(3, 4);
        r.draw();
        System.out.printf("사각형의 넓이는 %.1f\n", r.findArea());
    }
}