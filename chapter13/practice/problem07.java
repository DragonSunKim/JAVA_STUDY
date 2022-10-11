import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = in.nextLine();
        System.out.print("세고자 하는 문자를 입력하세요 : ");
        char lookFor = in.nextLine().charAt(0);

        int count = new CountLetter(lookFor, fileName).count();
        System.out.format("%s 파일에 %c 문자가 %d개 \n", fileName, lookFor, count);
    }
}

// class CountLetter {
// String fileName;
// char lookFor;

// public CountLetter(char lookFor, String fileName) {
// this.lookFor = lookFor;
// this.fileName = fileName;
// }

// int count() {
// int c = 0;
// try {
// BufferedInputStream bis = new BufferedInputStream(new
// FileInputStream(fileName));
// while (bis.available() > 0) {
// if ((char) bis.read() == lookFor)
// c++;
// }
// } catch (IOException e) {
// }

// return c;
// }
// }

class CountLetter {
    String fileName;
    char lookFor;

    public CountLetter(char lookFor, String fileName) {
        this.lookFor = lookFor;
        this.fileName = fileName;
    }

    int count() {
        int c = 0;
        try {
            Path p = Paths.get(fileName);

            FileChannel fc = FileChannel.open(p, StandardOpenOption.READ);

            ByteBuffer buf = ByteBuffer.allocate(1024);

            fc.read(buf);

            for (byte s : buf.array()) {
                if ((char) s == lookFor)
                    c++;
            }
        } catch (IOException e) {
        }
        return c;
    }
}