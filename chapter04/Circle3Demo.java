// Coding By 김용선.

class Circle_B {
    private double radius;

    // 생성자 추가
    public Circle_B(double r) {
        radius = r;
    }
}

public class Circle3Demo {
    public static void main(String[] args) {
        Circle_B myCircle = new Circle_B(10.0);
        // Circle_B yourCircle = new Circle_B(); 디폴트 생성자가 없기 때문에 사용 불가능.

    }
}
