// Coding By 김용선.

class Beverage {
}

class Beer extends Beverage {
}

class Boricha extends Beverage {
}

class Cup {
    private Object beverage;

    public Object getBeverage() {
        return beverage;
    }

    public void setBeverage(Object beverage) {
        this.beverage = beverage;
    }
}

public class GenericClass1Demo {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Beer());
        Beer b1 = (Beer) c.getBeverage();

        c.setBeverage(new Boricha());
        b1 = (Beer) c.getBeverage(); // Cup에 있는 Boricha 객체를 Beer 타입으로 변환하므로 실행 오류 발생
    }
}
