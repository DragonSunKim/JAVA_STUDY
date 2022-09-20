// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1, 2, 3, 4));
        int arr[] = { 2, 3 };
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
    }

    static int sumExceptFirst(int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (i == 0)
                continue;
            else {
                sum += v[i];
            }
        }

        return sum;
    }

    static int sumExceptFirst(int v, int[] w) {
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum = sum + w[i];
        }

        return sum;
    }
}
