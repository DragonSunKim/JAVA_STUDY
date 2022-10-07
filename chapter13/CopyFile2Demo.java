import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Coding By 김용선.

public class CopyFile2Demo {
    public static void main(String[] args) {
        String input = "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\org.txt";
        String output = "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\dup.txt";

        try (FileReader fr = new FileReader(input); FileWriter fw = new FileWriter(output)) {
            int c;

            while ((c = fr.read()) != -1)
                fw.write(c);
        } catch (IOException e) {
        }
    }
}
