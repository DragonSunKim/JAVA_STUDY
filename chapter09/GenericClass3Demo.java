// Coding By 김용선

public class GenericClass3Demo {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Beer());

        // Beer beer = c.getBeverage(); // 어떤 타입이 반환되는지 알 수 없으므로 타입 변환이 필요하다.

        Beer beer = (Beer) c.getBeverage();
    }
}
