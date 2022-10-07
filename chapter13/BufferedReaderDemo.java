import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Coding By 김용선.

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\org.txt"));) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
        }
    }
}
