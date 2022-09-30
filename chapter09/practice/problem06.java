package practice;

// Coding By 김용선.

public class problem06 {
    public static void main(String[] args) {
        Max<Number> n = new Max<>();
        System.out.println(n.max(10.0, 8.0));
        System.out.println(n.max(5, 8.0));

        Max<String> s = new Max<>();
        System.out.println(s.max("Hello", "Hi"));
        System.out.println(s.max("Good", "morning"));
    }
}

class Max<T> {

    <T1 extends Number> T1 max(T1 x, T1 y) {
        return (x.doubleValue() > y.doubleValue()) ? x : y;
    }

    <T2 extends String> T2 max(T2 x, T2 y) {
        return (x.length() - y.length() > 0) ? x : y;
    }
}
