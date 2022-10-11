import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

// Coding By 김용선.

public class problem04 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String name = in.next();

        Path p = new File("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\practice\\" + name + ".java")
                .toPath();

        List<String> list = Files.readAllLines(p);
        int i = 1;
        for (String s : list) {
            System.out.println("[" + i + "] " + s);

            i++;
        }
    }
}
