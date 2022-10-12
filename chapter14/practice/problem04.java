// Coding By 김용선.

class Echo {
    public synchronized void echo(String msg) {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(msg);
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Echoer extends Thread {
    String msg;
    Echo echo;

    public Echoer(String msg, Echo echo) {
        this.msg = msg;
        this.echo = echo;
    }

    public void run() {
        echo.echo(msg);
    }
}

public class problem04 {
    public static void main(String[] args) {
        Echo ec = new Echo();

        new Echoer("환영", ec).start();
        new Echoer("자바", ec).start();
        new Echoer("야호", ec).start();
    }
}
