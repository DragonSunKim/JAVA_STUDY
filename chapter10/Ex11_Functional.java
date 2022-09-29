// Coding By 김용선.

@FunctionalInterface // 함수전용 인터페이스 어노테이션.
interface Unit11 {
    String move();
    // void attack(); // 2개 이상의 메서드가 존재하면 오류 발생.
}

public class Ex11_Functional {
    public static void main(String[] args) {
        Unit11 unit = () -> {
            return "인간형 유닛 이동";
        };
        System.out.println(unit.move());
    }
}
