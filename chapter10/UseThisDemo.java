// Coding By 김용선.

interface UseThis {
    void use();
}

public class UseThisDemo {

    public void lambda() {
        String hi = "Hi!";

        UseThis u1 = new UseThis() {
            public void use() {
                System.out.println(this);
            }
        };
        u1.use();

        UseThis u2 = () -> {
            System.out.println(this);
        };
        u2.use();
    }

    public String toString() {
        return "UseThisDemo";
    }

    public static void main(String[] args) {
        int one = 1;

        new UseThisDemo().lambda();

    }
}
