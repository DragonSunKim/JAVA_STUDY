import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Coding By 김용선.

public class problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int score;

        while (true) {
            System.out.print("점수를 입력하세요 : ");
            score = in.nextInt();

            if (score == -1)
                break;

            list.add(score);
        }

        System.out.printf("전체 학생은 %d명이다.\n", list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d번 학생의 성적은 %d점이며 등급은 ", i, list.get(i));

            if (list.get(i) >= Collections.max(list) - 10)
                System.out.println("A 이다.");
            else if (list.get(i) >= Collections.max(list) - 20)
                System.out.println("B 이다.");
            else if (list.get(i) >= Collections.max(list) - 30)
                System.out.println("C 이다.");

        }
    }
}
