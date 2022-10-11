import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

// Coding By 김용선.

public class Files2Demo {
    public static void main(String[] args) throws Exception {
        Charset cs = Charset.defaultCharset();
        Path p = new File("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\new.txt").toPath();

        if (Files.notExists(p))
            Files.createFile(p);

        byte[] data = "Good Morning!\nGood Bye!!\n".getBytes();
        Files.write(p, data, StandardOpenOption.APPEND);

        try {
            List<String> lines = Files.readAllLines(p, cs);

            for (String line : lines)
                System.out.println(line);
        } catch (IOException e) {
        }
    }
}
