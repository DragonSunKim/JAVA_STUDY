// Coding By 김용선.

interface Unit7 {
    void move(String s);
}

public class Ex07_Lambda3 {
    public static void main(String[] args) {

        // 익명클래스 이용
        // Unit7 unit = new Unit7() {
        // public void move(String s) {
        // System.out.println(s);
        // }
        // };
        // unit.move("anonymous : Unit 7");

        // Lambda 이용
        Unit7 unit = (String s) -> {
            System.out.println(s);
        };
        unit.move("Lambda : Unit 7");
    }
}
