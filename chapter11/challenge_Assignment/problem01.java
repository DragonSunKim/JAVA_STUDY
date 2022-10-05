import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();
        capitals.add("서울");
        capitals.add("워싱턴");
        capitals.add("베이징");
        capitals.add("마드리드");
        capitals.add("파리");

        for (String s : capitals)
            System.out.print(s + " ");
        System.out.println();
        capitals.add("런던");

        Iterator<String> iterator = capitals.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        capitals.removeIf(c -> c.length() >= 3);

        for (String s : capitals)
            System.out.print(s + " ");
    }
}