import java.util.Random;

// Coding By 김용선.

class Worker0 extends Thread {
    int N;
    int sum = 0;

    public Worker0(int N) {
        this.N = N;
    }

    public void run() {
        int a;
        for (int i = 0; i < N; i++) {
            a = new Random().nextInt(10);
            System.out.println("Thread-0 : " + a);
            sum += a;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Worker1 extends Thread {
    int N;
    int sum = 0;

    public Worker1(int N) {
        this.N = N;
    }

    public void run() {
        int a;
        for (int i = 0; i < N; i++) {
            a = new Random().nextInt(10);
            System.out.println("Thread-1 : " + a);
            sum += a;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class problem03 {
    public static void main(String[] args) {
        Worker0 w0 = new Worker0(3);
        Worker1 w1 = new Worker1(2);

        w0.start();
        w1.start();

        try {
            w0.join();
            w1.join();
            System.out.println("누적 값 : " + (w0.sum + w1.sum));
        } catch (InterruptedException e) {
        }
    }
}
