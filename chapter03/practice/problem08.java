package practice;

// Coding By 김용선.

public class problem08 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        int ans = 1;
        return switch (n) {
            case 1 -> ans;
            default -> {

                for (int i = 1; i <= n; i++) {
                    ans *= i;
                }
                yield ans;
            }
        };
    }
}
