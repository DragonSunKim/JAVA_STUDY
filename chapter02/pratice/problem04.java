import java.util.Scanner;

// Coding By 김용선.

public class problem04 {
    public static void main(String[] args) {

        // 입력받는 값
        int input;

        int hour, minute, seconds;

        Scanner in = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 : ");
        input = in.nextInt();

        hour = input / 3600;
        minute = (input % 3600) / 60;
        seconds = input % 60;

        System.out.println(hour + "시간 " + minute + "분 " + seconds + "초");
    }
}
