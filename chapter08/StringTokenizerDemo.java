import java.util.StringTokenizer;

// Coding By 김용선.

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";

        StringTokenizer st = new StringTokenizer(s, " ,");

        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.print("[" + st.nextToken() + "] ");
        }
    }
}
