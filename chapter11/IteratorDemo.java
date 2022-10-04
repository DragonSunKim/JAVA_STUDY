import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Coding By 김용선.

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("자바", "파이썬", "C++");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "-");
        System.out.println();

        while (iterator.hasNext())
            System.out.print(iterator.next() + "+");
        System.out.println();

        iterator = list.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "=");
    }
}
