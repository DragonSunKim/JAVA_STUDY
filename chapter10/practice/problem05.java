import java.util.function.UnaryOperator;

// Coding By 김용선.

class FirstString {
    String startsWith(String s) {
        return Character.toString(s.charAt(0));
    }
}

public class problem05 {
    public static void main(String[] args) {
        FirstString fs = new FirstString();

        UnaryOperator<String> Firstget = fs::startsWith;
        System.out.println(Firstget.apply("KimYongSun"));
    }
}