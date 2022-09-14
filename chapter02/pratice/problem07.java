import java.util.Scanner;

// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        int x;

        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        x = in.nextInt();

        System.out.printf("4와 5로 나누어지나요 ? %s\n", ((x % 4 == 0) && (x % 5 == 0)) ? "true" : "false");
        System.out.printf("4또는 5로 나누어지나요 ? %s\n", (x % 4 == 0 || x % 5 == 0) ? "true" : "false");
        System.out.printf("4또는 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않나요 ? %s",
                ((x % 4 != 0 || x % 5 != 0) && (x % 4 == 0 || x % 5 == 0)));
    }
}
