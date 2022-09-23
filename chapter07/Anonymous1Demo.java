// Coding By 김용선.

public class Anonymous1Demo {

    Bird e = new Bird() {
        public void move() {
            System.out.println("독수리가 난다~~~.");
        }

        void sound() {
            System.out.println("휘익~~~.");
        }
    };

    public static void main(String[] args) {
        Anonymous1Demo a = new Anonymous1Demo();
        a.e.move();

        // Bird 타입에 없는 메서드이므로 Bird 타입의 객체로는 접근할 수 없다.
        // a.e.sound();
    }
}
