// Coding By 김용선.

public class CalculateFactorial3 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(1, 5));
        System.out.println(factorial(3, 5));
        System.out.println(factorial(10, 5));
    }

    static int factorial(int x) {
        int r = 1;
        while (x > 0) {
            r *= x;

            x -= 1;
        }
        return r;
    }

    static int factorial(int x, int y) {
        int r = 1;

        for (int i = x; i < y + 1; i++) {
            r *= i;
        }

        return r;
    }
}
