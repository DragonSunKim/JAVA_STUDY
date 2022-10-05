import java.util.stream.IntStream;

// Coding By 김용선.

public class ParallelDemo {
    public static void main(String[] args) {
        long start, end, total;

        IntStream sequantial = IntStream.rangeClosed(1, 100000000); // 1부터 1억까지의 정수 순차 스트림을 생성.
        start = System.currentTimeMillis();
        total = sequantial.sum();
        end = System.currentTimeMillis();
        System.out.println("순차 처리 : " + (end - start));

        IntStream parallel = IntStream.rangeClosed(1, 100000000).parallel(); // 1부터 1억까지의 정수 병렬 스트림을 생성.
        start = System.currentTimeMillis();
        total = parallel.sum();
        end = System.currentTimeMillis();
        System.out.println("병렬 처리 : " + (end - start));
    }
}
