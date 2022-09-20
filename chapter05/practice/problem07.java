// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        int[] a = { 3, 2, 4, 1, 5 };
        int[] b = { 3, 2, 4, 1 };
        int[] c = { 3, 2, 4, 1, 5 };
        int[] d = { 2, 7, 1, 8, 2 };

        System.out.println("a, b same ? " + Same(a, b));
        System.out.println("a, c same ? " + Same(a, c));
        System.out.println("a, d same ? " + Same(a, d));

    }

    public static boolean Same(int[] x, int[] y) {
        boolean result = true;
        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i])
                    result = false;
            }
        } else {
            result = false;
        }

        return result;
    }
}
