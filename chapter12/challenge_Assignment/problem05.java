import java.util.stream.Collectors;
import java.util.stream.Stream;

// Coding By 김용선

public class problem05 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        double avg = stream.collect(Collectors.averagingDouble(x -> x));
        System.out.println(avg);

        stream = Stream.of(1, 2, 3, 4, 5);
        double avg_2 = stream.collect(Collectors.averagingDouble(x -> Math.pow(x, 2)));
        System.out.println(avg_2);

        stream = Stream.of(1, 2, 3, 4, 5);
        String s = stream.map(x -> Integer.toString(x)).collect(Collectors.joining("-"));
        System.out.println(s);

    }
}
