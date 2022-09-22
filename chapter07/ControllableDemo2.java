// Coding By 김용선.

public class ControllableDemo2 {
    public static void main(String[] args) {
        Controllable[] controllable = { new TV(), new Computer() };

        for (Controllable c : controllable) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }
        Controllable.reset();
    }
}
