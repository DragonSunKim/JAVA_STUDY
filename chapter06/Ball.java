// Coding By 김용선.

public class Ball extends Circle {
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public void findColor() {
        System.out.println(color + "공이다.");
    }

    // 부모 클래스의 메서드를 오버라이딩한다.
    public void findArea() {

        findRadius(); // 부모 클래스의 findRadius()를 물려받았으므로 super 없이 호출할 수 있다.

        super.findArea(); // 부모 클래스의 findArea 메서드를 호출한다.

        // secret(); // 부모 클래스의 secret() 메서드가 private이므로 호출할 수 없다.

        System.out.println("넓이는 4*(3.14*반지름*반지름)이다.");
    }

    public void findVolume() {
        System.out.println("부피는 4/3*(3.14*반지름*반지름*반지름)이다.");
    }
}
