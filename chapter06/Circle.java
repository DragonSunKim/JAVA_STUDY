public class Circle {
    // 클래스 내부에서만 접근을 허용
    private void secret() {
        System.out.println("비밀이다.");
    }

    // 부모와 자식 클래스만 접근을 허용
    protected void findRadius() {
        System.out.println("반지름이 10.0cm이다.");
    }

    public void findArea() {
        System.out.println("넓이는 (3.14 * 반지름 * 반지름)이다.");
    }
}
