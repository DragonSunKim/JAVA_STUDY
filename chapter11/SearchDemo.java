import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Coding By 김용선.

public class SearchDemo {
    public static void main(String[] args) {
        String[] s = { "내연봉", "1", "억", "이다." };
        List<String> list = Arrays.asList(s);

        Collections.sort(list); // binarySearch() 메서드를 사용하기 전에 정렬해야 한다.
        System.out.println(list);

        int i = Collections.binarySearch(list, "억");
        System.out.println(i);
    }
}
