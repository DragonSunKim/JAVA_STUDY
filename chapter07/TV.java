// Coding By 김용선.

public class TV implements Controllable {

    // Controllable 인터페이스에 정의된 모든 추상 메서드를 구현해야 한다.
    @Override
    public void turnOn() {
        System.out.println("TV를 켠다.");
    }

    // 반드시 public이어야 한다. 부모인 인터페이스의 메서드는 모두 public이다.
    @Override
    public void turnOff() {
        System.out.println("TV를 끈다.");
    }
}
