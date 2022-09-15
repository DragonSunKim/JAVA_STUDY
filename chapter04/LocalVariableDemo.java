// Coding By 김용선.

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;
        double b;

        // System.out.println(b); 초기화되지 않았기 때문에 사용 불가능.
        // System.out.println(a + c); c 변수가 선언되지 않았기 때문에 사용 불가능.

        int c = 0;

        // public double d = 0.0; 지역 변수는 public으로 지정할 수 없다.

        for (int e = 0; e < 10; e++) {
            // int a = 1; 같은 이름으로 다시 선언할 수 없다.
            System.out.print(e);
        }
    }
}
