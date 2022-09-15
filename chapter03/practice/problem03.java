package practice;

import java.util.Scanner;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x, sum = 0;
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            x = in.nextInt();

            if (x % 2 == 0) {
                sum += x;
            }
        } while (x >= 0);

        System.out.printf("입력된 양의 정수 중에서 짝수의 합은 %d", sum);
    }
}
