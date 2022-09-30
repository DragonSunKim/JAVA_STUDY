package practice;

import java.util.function.IntConsumer;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) {
        IntConsumer c = (x) -> {
            if (x > 1)
                System.out.println(x + " apples");
            else if (x == 1)
                System.out.println(x + " apple");
        };

        c.accept(3);
        c.accept(1);
    }
}
