import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        // 데이터 추가
        dic.put("head", "머리");
        dic.put("teacher", "선생님");
        dic.put("cat", "고양이");
        dic.put("aunt", "이모");
        dic.put("noodle", "면");
        dic.put("child", "어린이");

        // for (String key : dic.keySet())
        // System.out.printf("%s=%s ", key, dic.get(key));

        dic.forEach((k, v) -> System.out.print(k + "=" + v + " ")); // forEach()문을 이용한 출력
        System.out.println();

        Collection<String> collection1 = dic.values(); // value값 추출
        List<String> list = new ArrayList<>(collection1); // List 타입으로 변경

        Collections.shuffle(list); // shuffle() 메서드를 이용해 원소 섞기

        list.forEach(x -> System.out.print(x + " "));

    }
}
