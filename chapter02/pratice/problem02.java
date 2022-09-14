import java.util.Scanner;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        x = in.nextInt();
        System.out.println(x + "의 제곱은 " + x * x);
    }
}
