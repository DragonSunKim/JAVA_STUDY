// Coding By 김용선.

class Cup<T> {
    private T beverage;

    public T getBeverage() {
        return beverage;
    }

    public void setBeverage(T beverage) {
        this.beverage = beverage;
    }
}

public class GenericClass2Demo {
    public static void main(String[] args) {
        Cup<Beer> c = new Cup<Beer>();

        c.setBeverage(new Beer());
        Beer b1 = c.getBeverage();

        // c.setBeverage(new Boricha()); // Beer타입의 Cup 객체에 Boricha 객체를 담을 수 없다. 오류 발생.
        b1 = c.getBeverage();
    }
}
