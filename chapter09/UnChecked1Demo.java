import java.util.StringTokenizer;

// Coding By 김용선.

public class UnChecked1Demo {
    public static void main(String[] args) {
        String s = "Time is money";

        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "+");
        }
        System.out.println(st.nextToken()); // NosuchElementException 오류 발생.
    }
}