// Coding By 김용선.

class Counter extends Thread {
    private int count = 0;

    public Counter(String name) {
        setName(name); // Thread 클래스에서 상속받은 메서드로 스레드 이름을 설정한다.
    }

    public void run() {
        while (count++ < 5) {
            System.out.print(getName() + " -> ");
            try {
                sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter("느긋한");
        c1.setPriority(Thread.MIN_PRIORITY);

        Counter c2 = new Counter("급한");
        c2.setPriority(Thread.MAX_PRIORITY);

        c1.start();
        c2.start();
    }
}
