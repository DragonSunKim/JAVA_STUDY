package practice;

// Coding By 김용선.

interface Flyable {
    void speed();

    void height();
}

public class problem07 {
    public static void main(String[] args) {
        Flyable f = new Flyable() {
            public void speed() {
                System.out.println("속도");
            }

            public void height() {
                System.out.println("높이");
            }
        };
        f.speed();
        f.height();
    }
}
