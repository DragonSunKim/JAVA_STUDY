import java.util.Scanner;

// Coding By 김용선.

public class problem06 {
    public static void main(String[] args) {
        double input;
        double output;
        Scanner in = new Scanner(System.in);

        System.out.print("화씨온도를 입력해주세요 : ");
        input = in.nextDouble();

        output = (input - 32) * ((double) 5 / 9);

        System.out.println("섭씨 온도 : " + output);

    }
}
