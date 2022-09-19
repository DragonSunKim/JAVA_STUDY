import java.util.Scanner;

// Coding By 김용선.

public class CalculateFactorial2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("팩토리얼 값을 구할 정수 : ");
        int n = in.nextInt();

        int result = factorial(n);

        System.out.println(result);
    }

    static int factorial(int x) {
        int r = 1;
        while (x > 0) {
            r *= x;

            x -= 1;
        }
        return r;
    }
}
