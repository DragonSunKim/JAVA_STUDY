import javax.swing.*;
import java.awt.*;

public class problem02 extends JFrame {

    problem02() {
        setTitle("섭씨->화씨 변환");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JPanel panel = new JPanel(new GridLayout(3, 0));

        JLabel l1 = new JLabel("섭씨");
        JLabel l2 = new JLabel("화씨");

        JButton trans = new JButton("변환");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        p3.add(trans);
        panel.add(p1);
        panel.add(p2);
        panel.add(p3);

        add(panel);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new problem02();
    }
}
