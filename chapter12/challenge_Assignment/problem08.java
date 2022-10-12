import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Coding By 김용선.

public class problem08 {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();

        Map<String, List<Nation>> m1 = sn.collect(Collectors.groupingBy(x ->{}, ))
    }
}
