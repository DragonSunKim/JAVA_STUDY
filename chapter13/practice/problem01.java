import java.io.File;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\practice\\file.txt");

        System.out.println("file.txt 파일의 유무 : " + file.exists());
    }
}