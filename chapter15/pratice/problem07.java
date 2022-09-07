import javax.swing.*;
import java.awt.*;

public class problem07 extends JFrame {

    CardLayout layout;

    // public void rotate() {
    // while (true) {
    // try {
    // Thread.sleep(500);
    // } catch (Exception e) {
    // }
    // layout.next(this.getContentPane());
    // }
    // }

    problem07() {
        setTitle("카드 레이아웃");

        setLayout(new BorderLayout(20, 20));
        showNorth();
        showCenter();
        // showSouth();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    void showNorth() {
        JPanel p = new JPanel();

        JButton b1 = new JButton("<<");
        JButton b2 = new JButton("<");
        JButton b3 = new JButton(">");
        JButton b4 = new JButton(">>");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        add(p, BorderLayout.NORTH);
    }

    void showCenter() {
        layout = new CardLayout();
        JPanel p = new JPanel(layout);

        p.add(new JButton("카드번호 1!"));
        p.add(new JButton("카드번호 2!"));
        p.add(new JButton("카드번호 3!"));

        add(p, BorderLayout.CENTER);
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            layout.next(this.getContentPane());
        }
    }

    public static void main(String[] args) {
        new problem07();
    }
}
