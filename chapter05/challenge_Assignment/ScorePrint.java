import java.util.Scanner;

// Coding By 김용선.

public class ScorePrint {
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
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}