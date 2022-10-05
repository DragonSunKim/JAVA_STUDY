import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        String[] s1 = { "a", "b", "a", "b", "c" };
        String[] s2 = { "c" };

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.addAll(Arrays.asList(s1));
        set2.addAll(Arrays.asList(s2));

        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);

        System.out.println("set1과  set2는 같다 : " + set1.equals(set2));
        System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));

        System.out.println("합집합 : " + set1);
        System.out.println("교집합 : " + set2);
    }
}
