import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Coding By 김용선.
// 스트림(stream)은 데이터 집합체를 반복적으로 처리하는 기능이다.

public class ArrayStreamDemo {
    public static void main(String[] args) {
        int[] ia = { 2, 3, 5, 7, 11, 13 };
        IntStream is = Arrays.stream(ia);

        String[] strings = { "The", "pen", "is", "mighter", "than", "the", "sword" };
        Stream<String> ss = Stream.of(strings);

        double[] da = { 1.2, 3.14, 5.8, 0.2 };
        DoubleStream ds = DoubleStream.of(da);
    }
}
