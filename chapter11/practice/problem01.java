import java.util.ArrayList;
import java.util.List;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("갈매기");
        list.add("나비");
        list.add("다람쥐");
        list.add("라마");

        list.removeIf(x -> x.length() != 2);

        list.forEach(x -> System.out.print(x + " "));
    }
}