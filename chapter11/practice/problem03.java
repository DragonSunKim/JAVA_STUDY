import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        map.put("김열공", 80);
        map.put("최고봉", 90);
        map.put("우등생", 95);
        map.put("나자바", 88);

        System.out.print("이름을 입력하세요 : ");
        String name = in.next();

        for (String s : map.keySet())
            if (name.equals(s))
                System.out.println(map.get(s));

    }
}
