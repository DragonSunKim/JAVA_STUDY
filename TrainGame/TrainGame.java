import javax.swing.*;

// Coding By 김용선.

public class TrainGame extends JFrame {

    class MyThread extends Thread {
        private JLabel label;
        private int x, y;

        public MyThread(String fname, int x, int y) {
            this.x = x;
            this.y = y;
            label = new JLabel();
            label.setIcon(new ImageIcon(fname));
            label.setBounds(x, y, 100, 100);
            add(label);
        }

        public void run() {
            for (int i = 0; i < 200; i++) {
                x += 10 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 200; i++) {
                y += 10 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 200; i++) {
                x -= 10 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 200; i++) {
                y -= 10 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public TrainGame() {
        setTitle("Trains");
        setSize(1000, 700);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        (new MyThread("train1.png", 100, 0)).start();
        (new MyThread("train2.png", 100, 100)).start();
        (new MyThread("train3.png", 100, 200)).start();
        (new MyThread("train4.png", 100, 300)).start();
        (new MyThread("train5.png", 100, 400)).start();
        setVisible(true);
    }

    public static void main(String[] args) {
        TrainGame t = new TrainGame();
    }
}