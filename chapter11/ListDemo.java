import java.util.Arrays;
import java.util.List;

// Coding By 김용선.

public class ListDemo {
    public static void main(String[] args) {
        String[] animals1 = { "사슴", "호랑이", "바다표범", "곰" };

        List<String> animals2 = Arrays.asList(animals1);
        animals2.set(1, "앵무새");

        // animals2.add("늑대"); 배열을 List 타입으로 변경했으므로 크기를 변경할 수 없어 실행 오류가 발생

        for (String s : animals2)
            System.out.print(s + " ");
        System.out.println();

        animals2.sort((x, y) -> x.length() - y.length());

        String[] animals3 = animals2.toArray(new String[0]);
        for (int i = 0; i < animals3.length; i++)
            System.out.println(animals3[i] + " ");
        System.out.println();

        List<String> cars = List.of("그랜저", "소나타", "아반테", "제네시스");
        // car.set(1, "싼타페"); 불변 리스트이므로 원소의 내용을 변경할 수 없다.

        cars.forEach(s -> System.out.println(s + " "));

        // List<Object> objects = List.of("a", null);
        // of() 메서드에 의한 List 타입은 null을 원소로 가질 수 없다.

    }
}
