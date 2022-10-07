import java.io.IOException;

// Coding By 김용선.

public class IOStreamDemo {
    public static void main(String[] args) throws IOException {
        int b, len = 0;
        int ba[] = new int[100];

        System.out.print("--- 입력 스트림 ---\n");
        while ((b = System.in.read()) != '\n') {
            System.out.printf("%c(%d)", (char) b, b);
            ba[len++] = b;
        }

        System.out.println("\n\n--- 출력 스트림 ---");
        for (int i = 0; i < 100; i++)
            System.out.write(ba[i]);

        System.out.flush();
    }
}