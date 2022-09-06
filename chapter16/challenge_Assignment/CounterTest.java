package challenge_Assignment;

import java.awt.event.*;
import javax.swing.*;

public class CounterTest extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel l;
    private JButton b;
    Thread thread;

    CounterTest() {
        setTitle("카운터");

        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();

        l = new JLabel("개수 = 0");
        b = new JButton("시작");

        // b.addActionListener(e -> {
        // count++;
        // l.setText("개수 = " + count);
        // });

        b.addActionListener(this);

        j1.add(l);
        j2.add(b);

        add("North", j1);
        add("Center", j2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    // public void actionPerformed(ActionEvent e) {
    // new Thread(() -> {
    // while (true) {
    // count++;
    // l.setText("개수 = " + count);
    // try {
    // Thread.sleep(500);
    // } catch (Exception ex) {
    // }
    // }
    // }).start();
    // }

    public void actionPerformed(ActionEvent e) {

        if (thread == null || thread.isAlive() == false) {
            b.setText("중지");
            thread = new Thread(new Counter());
            thread.setDaemon(true);
            thread.start();
        } else {
            b.setText("계속");
            thread.interrupt();
        }
    }

    class Counter implements Runnable {
        public void run() {
            while (true) {
                count++;
                l.setText("개수 = " + count);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new CounterTest();
    }

}