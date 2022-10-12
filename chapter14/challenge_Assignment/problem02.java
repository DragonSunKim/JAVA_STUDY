package challenge_Assignment;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("작업 스레드 : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();

        int alphabet = 'a';
        for (int i = alphabet; i <= 'z'; i++) {
            if (!(t.getState().equals("TERMINATED"))) {
                System.out.println("메인 스레드 : " + (char) i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
