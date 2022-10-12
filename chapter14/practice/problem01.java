import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Coding By 김용선.

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class problem01 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new MyRunnable());

        for (int i = 0; i < 5; i++) {
            System.out.println("잘가");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        exec.shutdown();
    }
}
