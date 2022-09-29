// Coding By 김용선.

interface Unit10 {
    String move();
}

public class Ex10_LambdaRule3 {
    public static void main(String[] args) {
        Unit10 unit = () -> { // 매개변수가 없을 때 빈 소괄호 사용
            return "인간현 유닛 이동";
        };

        System.out.println(unit.move());
    }
}
