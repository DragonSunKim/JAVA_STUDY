import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Coding By 김용선.

public class IOTest {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\challenge_Assignment\\file.txt";

        try {
            byte[] buf = new byte[100];
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            bis.read(buf);

            for (byte b : buf)
                System.out.print((char) b);

            fis.close();
            bis.close();
        } catch (FileNotFoundException ex) {
            System.out.println(fileName + " 파일을 열 수 없습니다.");
        } catch (IOException e) {
            System.out.println(fileName + " 파일을 읽을 수 없습니다.");
        }
    }
}