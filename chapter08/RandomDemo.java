import java.util.Random;

// Coding By 김용선.

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 50; i++)
            System.out.print(r.nextInt(100) + " ");
    }
}
