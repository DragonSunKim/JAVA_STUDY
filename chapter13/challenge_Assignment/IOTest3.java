import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Coding By 김용선.

public class IOTest3 {
    public static void main(String[] args) throws IOException {
        Path p = new File(
                "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\challenge_Assignment\\file.txt")
                .toPath();

        Files.lines(p).forEach(x -> System.out.println(x));
    }
}
