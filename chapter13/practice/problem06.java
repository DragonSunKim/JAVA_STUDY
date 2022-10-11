import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// Coding By 김용선.

public class problem06 {
    public static void main(String[] args) throws IOException {

        String[] animals = { "ant", "bat", "cat", "dog" };

        PrintStream ps = new PrintStream(new FileOutputStream(
                "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\practice\\animals.txt"));

        for (String s : animals) {
            ps.println(s.substring(0, 1) + " : " + s);
        }
    }
}
