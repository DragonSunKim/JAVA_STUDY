package pratice;

import java.awt.*;
import javax.swing.*;

public class problem07 extends JFrame {
    int i = 0;

    problem07() {
        setTitle("파이 돌리기 Coding By 김용선");

        JButton button = new JButton("클릭");
        JPanel panel = new JPanel();
        panel.add(button);
        button.addActionListener(e -> {
            i = ++i % 5;
            System.out.println(i);
            repaint();
        });

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLACK };

                g.setColor(c[i]);
                g.fillArc(40, 30, 150, 150, i * 72, 72);
            }
        }

        add(panel, BorderLayout.NORTH);
        add(new MyPanel(), BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(280, 280);
        setVisible(true);
    }

    public static void main(String[] args) {
        new problem07();
    }
}
