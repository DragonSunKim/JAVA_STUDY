// Coding By 김용선.

abstract class Shape {

    // 추상클래스도 멤버 필드를 포함할 수 있다.
    double pi = 3.14;

    // 추상 메서드는 본체가 없다.
    abstract void draw();

    // 추상클래스도 구현 메서드를 포함할 수 있다.
    public double findArea() {
        return 0.0;
    }
}
