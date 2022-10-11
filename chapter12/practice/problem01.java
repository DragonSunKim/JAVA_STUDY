import java.util.List;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {
        List<String> list = List.of("갈매기", "나비", "다람쥐", "라마");

        list.stream().filter(s -> s.length() == 2).forEach(System.out::println);

    }
}