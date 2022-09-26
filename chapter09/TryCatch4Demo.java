// Coding By 김용선.

public class TryCatch4Demo {
    public static void main(String[] args) {
        Reso reso = new Reso();

        try (reso) {
            reso.show();
        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }
}

class Reso implements AutoCloseable {
    void show() {
        System.out.println("자원 사용");
    }

    // AutoCloseable 인터페이스에서 요구하는 구현 메서드이다.
    public void close() throws Exception {
        System.out.println("자원 닫기");
    }
}
