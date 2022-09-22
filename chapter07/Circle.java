// Coding By 김용선.

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // 부모 클래스에서 추상 메서드로 선언했으므로 자식 클래스에서 반드시 구현해야 한다.
    public void draw() {
        System.out.println("원을 그리다.");
    }

    // 부모 클래스의 메서드를 오버라이딩한다.
    public double findArea() {
        return pi * radius * radius;
    }
}
