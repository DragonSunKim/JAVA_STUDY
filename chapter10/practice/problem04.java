import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

// Coding By 김용선.

public class problem04 {
    public static void main(String[] args) {
        ToIntFunction<Integer> len = x -> Integer.toString(x).length();

        System.out.println("ToIntFunction :");
        System.out.println("length(10) = " + len.applyAsInt(10));
        System.out.println("length(100) = " + len.applyAsInt(100));
        System.out.println("length(1000) = " + len.applyAsInt(1000));

        System.out.println();
        System.out.println();

        UnaryOperator<Integer> uo = x -> Integer.toString(x).length();

        System.out.println("UnaryOperator :");
        System.out.println("length(10) = " + uo.apply(10));
        System.out.println("length(100) = " + uo.apply(100));
        System.out.println("length(1000) = " + uo.apply(1000));

    }
}
