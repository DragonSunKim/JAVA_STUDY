// Coding By 김용선.

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech");
        Mouse m2 = new Mouse("Logitech");
        Mouse m3 = m1;

        Keyboard k1 = new Keyboard("Microsoft");
        Keyboard k2 = new Keyboard("Microsoft");

        // Object 클래스에서 물려받은 toString() 메서드의 결과이다.
        System.out.println(m1.toString());
        System.out.println(m1);

        // 오버라이딩한 toString() 메서드의 결과이다.
        System.out.println(k1.toString());
        System.out.println(k1);

        System.out.println(m1.equals(m2)); // Object클래스에서 상속받은 equals() 메서드를 사용. 다른 객체이기 때문에 false를 반환한다
        System.out.println(m1.equals(m3));
        System.out.println(k1.equals(k2));
    }
}
