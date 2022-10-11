import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

// Coding By 김용선.

public class Stream1Demo {
    public static void main(String[] args) {
        File file = new File("C:\\Windows");
        File[] fs = file.listFiles();

        Stream<File> stream = Arrays.stream(fs);
        long count = stream.filter(x -> x.isDirectory() == false).count();

        System.out.println("C:\\Windows에 있는 파일 개수 : " + count);

    }
}
