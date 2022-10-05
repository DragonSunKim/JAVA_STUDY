import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Coding By 김용선.
// 스트림(Stream)은 데이터 집합체를 반복적으로 처리하는 기능이다.

public class EtcStreamDemo {
    public static void main(String[] args) {
        IntStream is1 = IntStream.iterate(1, x -> x + 2); // 첫 원소가 1이고, 다음 원소부터 람다식에 의해 2씩 증가하며 생성.

        IntStream is2 = new Random().ints(0, 10); // 0 ~10 사이의 정수인 난수 생성.

        Stream<Double> ds = Stream.generate(Math::random);

        IntStream is3 = IntStream.range(1, 5); // 정수 1, 2, 3, 4를 생성.
    }
}
