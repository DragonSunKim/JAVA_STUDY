import java.io.File;
import java.nio.file.Files;

// Coding By 김용선.

public class Files1Demo {
    public static void main(String[] args) throws Exception {
        File f1 = new File("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\org.txt");
        File f2 = new File("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13");

        System.out.println("org.txt는 폴더? " + Files.isDirectory(f1.toPath()));

        System.out.println("chapter13은 폴더? " + Files.isDirectory(f2.toPath()));

        System.out.println("org.txt는 읽을 수 있는 파일? " + Files.isReadable(f1.toPath()));

        System.out.println("org.txt의 크기? " + Files.size(f1.toPath()));
    }
}
