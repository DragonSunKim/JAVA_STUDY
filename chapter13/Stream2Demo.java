import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

// Coding By 김용선.

public class Stream2Demo {
    public static void main(String[] args) throws Exception {
        String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        Path p = new File("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\number.txt").toPath();

        Stream<String> s = Files.lines(p);

        s.forEach(x -> System.out.println(x));

        s = Files.lines(p);

        s.map(x -> number[Integer.parseInt(x)]).forEach(x -> System.out.print(x + " "));
    }
}