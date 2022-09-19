import java.util.Scanner;

// Coding By 김용선.

public class Array1Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scores[] = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println("평균 = " + sum / 5.0);
    }
}
