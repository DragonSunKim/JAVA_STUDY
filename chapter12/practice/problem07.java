import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        List<String> list = List.of("민국", "지우", "하준", "지우", "하준", "지우");
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
    }
}
