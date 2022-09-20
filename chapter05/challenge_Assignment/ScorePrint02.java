import java.util.Scanner;

public class ScorePrint02 {
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

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90)
                System.out.println((i + 1) + "번 학생의 등급은 A입니다.");
            else if (scores[i] >= 80)
                System.out.println((i + 1) + "번 학생의 등급은 B입니다.");
            else if (scores[i] >= 70)
                System.out.println((i + 1) + "번 학생의 등급은 C입니다.");
            else if (scores[i] >= 60)
                System.out.println((i + 1) + "번 학생의 등급은 D입니다.");
            else
                System.out.println((i + 1) + "번 학생의 등급은 F입니다.");
        }
    }
}
