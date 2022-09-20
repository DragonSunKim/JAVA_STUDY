import java.util.Scanner;

// Coding By 김용선.

public class problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num0_9 = 0;
        int num10_19 = 0;
        int num20_29 = 0;
        int num30_39 = 0;
        int num40_49 = 0;
        int num50_59 = 0;
        int num60_69 = 0;
        int num70_79 = 0;
        int num80_89 = 0;
        int num90_99 = 0;

        System.out.println("숫자를 10개 입력하세요.");

        for (int i = 0; i < 10; i++) {
            int x = in.nextInt();
            if (x < 0)
                continue;
            else if (x >= 0 && x < 10)
                num0_9 += 1;
            else if (x >= 10 && x < 20)
                num10_19 += 1;
            else if (x >= 20 && x < 30)
                num20_29 += 1;
            else if (x >= 30 && x < 40)
                num30_39 += 1;
            else if (x >= 40 && x < 50)
                num40_49 += 1;
            else if (x >= 50 && x < 60)
                num50_59 += 1;
            else if (x >= 60 && x < 70)
                num60_69 += 1;
            else if (x >= 70 && x < 80)
                num70_79 += 1;
            else if (x >= 80 && x < 90)
                num80_89 += 1;
            else if (x >= 90 && x < 100)
                num90_99 += 1;
        }

        System.out.printf("%2d ~ %2d : %s\n", 0, 9, "*".repeat(num0_9));
        System.out.printf("%2d ~ %2d : %s\n", 10, 19, "*".repeat(num10_19));
        System.out.printf("%2d ~ %2d : %s\n", 20, 29, "*".repeat(num20_29));
        System.out.printf("%2d ~ %2d : %s\n", 30, 39, "*".repeat(num30_39));
        System.out.printf("%2d ~ %2d : %s\n", 40, 49, "*".repeat(num40_49));
        System.out.printf("%2d ~ %2d : %s\n", 50, 59, "*".repeat(num50_59));
        System.out.printf("%2d ~ %2d : %s\n", 60, 69, "*".repeat(num60_69));
        System.out.printf("%2d ~ %2d : %s\n", 70, 79, "*".repeat(num70_79));
        System.out.printf("%2d ~ %2d : %s\n", 80, 89, "*".repeat(num80_89));
        System.out.printf("%2d ~ %2d : %s\n", 90, 99, "*".repeat(num90_99));
    }
}
