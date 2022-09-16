// Coding By 김용선.

public class OneToTenDemo {
    // 정적 변수 생성.
    static int sumOneToTen;

    // 정적 블록으로 정적 변수를 초기화.
    static {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        sumOneToTen = sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOneToTen);
    }
}
