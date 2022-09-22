// Coding By 김용선.

public class ControllableDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer com = new Computer();

        tv.turnOn();
        tv.turnOff();
        tv.repair();

        com.turnOn();
        com.turnOff();
        com.repair();

        // 정적 메서드는 인터페이스로 직접 호출해야 한다.
        Controllable.reset();
        // tv.reset(); // 오류 발생
        // com.reset(); // 오류 발생
    }
}
