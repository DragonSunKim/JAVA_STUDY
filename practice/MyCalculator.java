import java.util.Scanner;

// Coding By 김용선.

public class MyCalculator {

    public static void showMenu() {
        System.out.println("메뉴를 선택하세요");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("0. 끝내기");
    }

    // 개발자 김용선 : 매개변수로 두 수를 받아 덧셈하는 메서드
    public static void addNum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    // 개발자 김용선 : 매개변수로 두 수를 받아 뺄셈하는 메서드
    public static void minusNum(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    // 개발자 김용선 : 매개변수로 두 수를 받아 곱셈하는 메서드
    public static void multiplyNum(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    // 개발자 김용선 : 매개변수로 두 수를 받아 나눗셈하는 메서드
    public static void divideNum(int num1, int num2) {
        int result1 = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result1);

        int result2 = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result2);
    }

    // 개발자 김용선 : 메뉴 선택시 올바른 입력값인지 확인하고 true/false 리턴.
    public static boolean checkNum(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            showMenu(); // 메뉴 출력

            char myChar = in.next().charAt(0);
            if (!checkNum(myChar)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.");
                continue;
            }

            if (myChar == '0') // 개발자 김용선 : 0 입력시 종료.
                break;
            else {
                if (myChar > '4') { // 개발자 김용선 : 4보다 큰 값 입력시 재입력.
                    System.out.println("메뉴를 잘못 선택했습니다.");
                    continue;
                }
                System.out.print("첫 번째 숫자: ");
                int num1 = in.nextInt();

                System.out.print("두 번째 숫자: ");
                int num2 = in.nextInt();

                if (myChar == '1')
                    addNum(num1, num2);
                else if (myChar == '2')
                    minusNum(num1, num2);
                else if (myChar == '3')
                    multiplyNum(num1, num2);
                else if (myChar == '4')
                    divideNum(num1, num2);
            }
        }
        System.out.println("계산기를 종료합니다.");
    }
}