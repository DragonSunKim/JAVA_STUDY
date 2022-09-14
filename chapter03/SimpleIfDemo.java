import java.util.Scanner;

// Coding By 김용선.

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = in.nextInt();

        // 입력 값이 짝수일 때만 실행한다.
        if (number % 2 == 0)
            System.out.println("짝수!");

        // 입력 값이 홀수일 때만 실행한다.
        if (number % 2 == 1)
            System.out.println("홀수!");

        // 프로그램 마지막에 항상 실행한다.
        System.out.println("종료");
    }
}