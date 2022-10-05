import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Coding By 김용선.

public class problem08 {
    public static void main(String[] args) {
        String[] s = { "독수리", "고양이", "강아지" };

        List<String> list = List.of("개미", "개미");
        System.out.println(list);

        List<String> al1 = new ArrayList<>(list);
        System.out.println("nCopies : " + al1);

        al1.replaceAll(x -> "벌");
        System.out.println("'벌'을 채운 후 : " + al1);

        al1.addAll(Arrays.asList(s));
        System.out.println("리스트를 모두 추가한 후 : " + al1);

        // Collections.shuffle(al1);

        System.out.println("리스트를 섞은 후 : " + al1);

        Collections.reverse(al1);
        System.out.println("리스트를 역순으로 정렬한 후 : " + al1);

        System.out.println("리스트에서 최소 : " + Collections.min(al1));
        System.out.println("리스트에서 최대 : " + Collections.max(al1));
        System.out.println("리스트에서 '벌'의 빈도 : " + Collections.frequency(al1, "벌"));
    }
}
