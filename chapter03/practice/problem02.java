package practice;

import java.util.Scanner;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("등수 : ");
        int rank = in.nextInt();

        switch (rank) {
            case 1:
                System.out.println("아주 잘했습니다.");
                break;
            case 2:
            case 3:
                System.out.println("잘했습니다.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("보통입니다.");
                break;
            default:
                System.out.println("노력해야겠습니다.");
        }
    }
}
