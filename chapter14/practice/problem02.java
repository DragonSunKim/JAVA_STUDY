import java.util.Scanner;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Runnable task = () -> {
            try {
                while (true) {
                    System.out.println("작업 실행 중...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
            System.out.println("작업 완료.");
        };

        Thread t = new Thread(task);
        t.start();

        if (in.nextInt() == 1)
            t.interrupt();
    }
}
