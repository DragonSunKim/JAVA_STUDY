import java.util.stream.IntStream;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) {
        IntStream is = IntStream.rangeClosed(1, 10);
        is.mapToObj(x -> "A" + x).forEach(x -> System.out.print(x + " "));
    }
}
