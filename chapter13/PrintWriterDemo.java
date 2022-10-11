import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Coding By 김용선.

public class PrintWriterDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\org.txt"));
                PrintWriter pr = new PrintWriter(
                        new FileWriter("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\dup.txt"));) {
            br.lines().forEach(x -> pr.println(x));
        } catch (IOException e) {
        }
    }
}
