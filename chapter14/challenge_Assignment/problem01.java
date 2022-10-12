package challenge_Assignment;

// Coding By 김용선.

class Worker extends Thread {
    public boolean stop = false;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("작업 스레드 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        stop = true;
    }
}

public class problem01 {
    public static void main(String[] args) {
        int alphabet = 'a';

        Worker t = new Worker();
        t.start();
        for (int i = alphabet; i <= 'z'; i++) {
            if (!t.stop) {
                System.out.println("메인 스레드 : " + (char) i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
