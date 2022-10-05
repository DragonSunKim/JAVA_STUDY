import java.util.stream.IntStream;

// Coding By 김용선.

public class LazinessDemo {
    public static void main(String[] args) {
        IntStream is = IntStream.rangeClosed(1, 5);

        is.filter(x -> {
            System.out.println("filter : " + x);
            return x % 2 == 0;
        }).map(x -> {
            System.out.println("map : " + x);
            return x * x;
        }).forEach(x -> System.out.println("forEach : " + x));
    }
}
