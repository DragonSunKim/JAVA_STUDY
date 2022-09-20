// Coding By 김용선.

import java.util.Scanner;

public class ScorePrint03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfStudents = 0;
        int[] scores;

        // 학생 수를 입력받는다.
        System.out.print("학생 수? ");
        numOfStudents = in.nextInt();

        // 학생 수만큼 배열을 생성한다.
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
        }

        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for (int i : scores) {
            System.out.print(i + " ");
        }
        System.out.println();

        String grade;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90)
                grade = "A";
            else if (scores[i] >= 80)
                grade = "B";
            else if (scores[i] >= 70)
                grade = "C";
            else if (scores[i] >= 60)
                grade = "D";
            else
                grade = "F";

            for (Score score : Score.values()) {
                if (grade == score.name())
                    System.out.println((i + 1) + "번 학생의 등급은 " + Score.valueOf(score.name()));
            }
        }
    }
}

enum Score {
    A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");

    private String s;

    Score(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
