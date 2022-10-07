import java.util.List;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {
        List<String> list = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
        list.stream().sorted().limit(1).forEach(System.out::println);
    }
}
