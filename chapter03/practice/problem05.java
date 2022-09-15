package practice;

// Coding By 김용선.

public class problem05 {
    public static void main(String[] args) {
        System.out.println("  a  b  c");
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                for (int k = 1; k < 20; k++) {
                    if ((((i * i) + (j * j)) == (k * k)) && i + j + k <= 20) {
                        System.out.printf("%3d%3d%3d\n", i, j, k);
                    }
                }
            }
        }
    }
}
