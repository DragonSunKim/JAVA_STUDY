package practice;

// Coding By 김용선.

public class problem04 {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(10, 20);
        Pair<Double> p2 = new Pair<>(10.0, 20.0);

        System.out.println(p1.first());
        System.out.println(p2.second());
    }
}

class Pair<T extends Number> {
    private T num1;
    private T num2;

    Pair(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    T first() {
        return num1;
    }

    T second() {
        return num2;
    }
}
