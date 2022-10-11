import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Coding By 김용선.

public class IOTest2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\challenge_Assignment\\file.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            System.out.println(br.readLine());
            System.out.println(br.readLine());

        } catch (FileNotFoundException ex) {
            System.out.println();
        } catch (IOException e) {
            System.out.println();
        }
    }
}
