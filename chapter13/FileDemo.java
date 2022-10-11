import java.io.File;

// Coding By 김용선.

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Windows");
        File[] fs = file.listFiles();

        for (File f : fs)
            if (f.isDirectory())
                System.out.printf("dir : %s\n", f);
            else
                System.out.printf("file: %s(%d bytes)\n", f, f.length());
    }
}
