// Coding By 김용선.

interface Unit9 {
    int calc(int a, int b);
}

public class Ex09_LambdaRule2 {
    public static void main(String[] args) {
        Unit9 unit;

        unit = (a, b) -> {
            return a + b;
        };

        // unit = a,b -> {return a+b;}; 매개변수가 2개 이상이면 소괄호 생략 불가능

        // unit = (a, b) -> return a+b; 중괄호 안에 return 명령이 있으면 중괄호 생략 불가능

        int num = unit.calc(10, 20);
        System.out.println(num);

        unit = (a, b) -> a * b; // 중괄호 안의 구현문이 반환문 하나일때, return과 중괄호 생략 가능
        System.out.println(unit.calc(10, 20));
    }
}
