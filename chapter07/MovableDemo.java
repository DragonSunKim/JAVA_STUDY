// Coding By 김용선.

interface Movable {
    void move(int x);
}

class Car implements Movable {
    private int pos = 0;

    public void move(int x) {
        pos += x;
    }

    public void show() {
        System.out.println(pos + "m 이동했습니다.");
    }
}

public class MovableDemo {
    public static void main(String[] args) {
        Movable m = new Car();

        m.move(5);

        // Movable 타입에는 show() 메서드가 없기 때문에 호출할 수 없다.
        // m.show();

        Car c = (Car) m;
        c.move(10);
        c.show(); // Car 타입에는 show() 메서드가 있어 호출할 수 있다.
    }
}
