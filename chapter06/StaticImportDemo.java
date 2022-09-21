import static java.util.Arrays.sort;
import java.util.Calendar;

// Coding By 김용선.

public class StaticImportDemo {
    public static void main(String[] args) {
        int[] data = { 3, 5, 1, 7 };

        sort(data); // 정적 import 문이 있다면 클래스 이름 없이 멤버를 사용한다.

        System.out.print("data : ");
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i]);

        System.out.println();

        System.out.println(Calendar.JANUARY); // import 문일 때는 클래스 이름과 함께 필드를 사용한다.
        Calendar.getInstance();
    }
}
