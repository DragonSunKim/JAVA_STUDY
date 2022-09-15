// Coding By 김용선.

public class ReturnDemo {
    public static void main(String[] args) {
        printScore(99);
        printScore(120);
    }

    // 점수(score)를 매개변수로 받아 화면에 출력한다.
    // return 값이 없기 때문에 void로 작성.
    public static void printScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수 : " + score);
            return; // return을 적어 함수에서 빠져 나온다.
        }
        System.out.println("점수 : " + score);
    }
}
