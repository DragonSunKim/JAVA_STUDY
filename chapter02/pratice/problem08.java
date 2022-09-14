import java.util.Scanner;

// Coding By 김용선.

public class problem08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int x = in.nextInt();

        int a = x / 100;
        int b = (x % 100) / 10;
        int c = x % 10;

        System.out.printf("각 자릿수의 합 = %d", a + b + c);

    }
}
