package practice;

import java.util.Scanner;

// Coding By 김용선.

public class problem10 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();

        if (isPrime(num))
            System.out.println(num + "는 소수입니다.");
        else
            System.out.println(num + "는 소수가 아닙니다.");
    }

    public static boolean isPrime(int n) {
        boolean result = true;
        if (n == 1)
            result = false;
        else if (n == 2)
            result = true;
        else if (n == 3)
            result = true;
        else if ((n % 2 == 0) || (n % 3 == 0))
            result = false;

        return result;
    }
}
