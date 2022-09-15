// Coding By 김용선.

public class Method2Demo {
    public static void main(String[] args) {
        System.out.println("합(1~10) : " + sum(1, 10));
        System.out.println("합(10~100) : " + sum(10, 100));
        System.out.println("합(100~1000) : " + sum(100, 1000));
    }

    // 합을 구하는 메서드 생성, 반환타입을 int로 설정
    // static으로 작성하면 객체를 생성하지 않고 실행할 수 있다.
    public static int sum(int i1, int i2) {
        int sum = 0;

        for (int i = i1; i <= i2; i++) {
            sum += i;
        }

        return sum;
    }
}
