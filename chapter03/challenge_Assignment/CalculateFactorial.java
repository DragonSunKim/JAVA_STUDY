package challenge_Assignment;

import java.util.Scanner;

// Coding By 김용선.

public class CalculateFactorial {
    public static void main(String[] args) {
        int result; // 팩토리얼 결괏값 저장
        int n; // 입력받은 정수 저장
        Scanner in = new Scanner(System.in);

        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = in.nextInt();

        result = 1;
        // while (n > 0) {
        // result *= n;

        // n -= 1;
        // }

        while (true) {
            result *= n;

            n -= 1;

            if (n == 0)
                break;
        }

        System.out.println(result);
    }
}
