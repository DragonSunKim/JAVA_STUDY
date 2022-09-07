import javax.swing.*;
import java.awt.*;

public class problem03 extends JFrame {
    problem03() {
        setTitle("색상 선택기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    void showNorth() {
        JPanel p = new JPanel();

        String[] color = { "빨간색", "초록색", "파란색" };

        JComboBox<String> cb = new JComboBox<>(color);

        p.add(cb);
        add(p);

        add(p, BorderLayout.NORTH);
    }

    void showCenter() {
        JPanel p = new JPanel();

        JCheckBox ch1 = new JCheckBox("배경색");
        JCheckBox ch2 = new JCheckBox("전경색");

        p.add(ch1);
        p.add(ch2);

        add(p, BorderLayout.CENTER);

    }

    void showSouth() {
        JPanel p = new JPanel();

        JButton b1 = new JButton("예");
        JButton b2 = new JButton("아니오");

        p.add(b1);
        p.add(b2);

        add(p, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new problem03();
    }
}
