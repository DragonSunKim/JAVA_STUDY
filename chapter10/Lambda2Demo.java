// Coding By 김용선.

interface Negative {
    int neg(int x);
}

interface Printable {
    void print();
}

public class Lambda2Demo {
    public static void main(String[] args) {
        Negative n;
        Printable p;

        n = (int x) -> {
            return -x;
        };
        n = (x) -> {
            return -x;
        };
        n = x -> {
            return -x;
        };
        n = (int x) -> -x;
        n = (x) -> -x;
        n = x -> -x;

        p = () -> {
            System.out.println("안녕!");
        };
        p = () -> System.out.println("안녕!");
    }
}
