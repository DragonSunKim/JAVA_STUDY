import java.util.Scanner;

// Coding By 김용선.

public class TotalRun {
    public static void main(String[] args) {
        SimpleIfDemo();
        IfElseDemo();
        MultiIfDemo();
        whileDemo();
        while2Demo();
        DoWhile1Demo();
        DoWhile2Demo();
        DoWhile3Demo();

    }

    static void MultiIfDemo() {
        Scanner in = new Scanner(System.in);

        String grade;

        System.out.print("정수를 입력하세요 : ");
        int score = in.nextInt();

        if (score >= 90)
            grade = "A";
        else if (score >= 80)
            grade = "B";
        else if (score >= 70)
            grade = "C";
        else if (score >= 60)
            grade = "D";
        else
            grade = "F";

        System.out.printf("당신의 학점은 %s\n", grade);
    }

    static void IfElseDemo() {
        Scanner in = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("짝수!");
        else
            System.out.println("홀수!");

        // 다음을 실행하면 출력결과가 같다.
        // System.out.println(number % 2 == 0 ? "짝수!":"홀수!");

        System.out.println("종료");
    }

    static void SimpleIfDemo() {
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

    static void whileDemo() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    static void while2Demo() {
        int row = 2;

        while (row < 20) {
            int column = 1;
            while (column < 20) {
                System.out.printf("%4d", row * column);
                column++;
            }
            System.out.println();
            row++;
        }
    }

    static void DoWhile1Demo() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    static void DoWhile2Demo() {
        int i = 10;
        do {
            i++;
        } while (i < 5);
        System.out.println("do~while문 실행 후 : " + i); // i = 11

        i = 10;
        while (i < 5) {
            i++;
        }
        System.out.println("while문 실행 후 : " + i); // i = 10
    }

    static void DoWhile3Demo() {
        int row = 2;
        do {
            int column = 1;
            do {
                System.out.printf("%4d", row * column);
                column++;
            } while (column < 10);
            System.out.println();
            row++;
        } while (row < 10);
    }
}
