import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Coding By 김용선.

public class CopyFileDemo {
    public static void main(String[] args) {
        String input = "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\org.txt";
        String output = "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\dup.txt";

        try (FileInputStream fis = new FileInputStream(input); FileOutputStream fos = new FileOutputStream(output)) {
            int c;

            while ((c = fis.read()) != -1)
                fos.write(c);
        } catch (IOException e) {
        }
    }
}
