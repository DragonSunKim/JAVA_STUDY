import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// Coding By 김용선.

public class StreamReaderDemo {
    public static void main(String[] args) {
        String input = "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\org.txt";

        try (FileInputStream fi = new FileInputStream(input);
                InputStreamReader in = new InputStreamReader(fi, "US-ASCII")) {
            int c;

            System.out.println(in.getEncoding());

            while ((c = in.read()) != -1)
                System.out.print((char) c);
        } catch (IOException e) {
        }
    }
}
