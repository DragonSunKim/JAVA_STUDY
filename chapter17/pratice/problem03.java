package pratice;

import java.awt.*;
import javax.swing.*;

public class problem03 extends JFrame {
    problem03() {
        setTitle("동심원 무지개 Coding by 김용선");

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, new Color(0x000080),
                        new Color(0x800080) };

                for (int i = 0; i < 7; i++) {
                    int d = delta(i);
                    g.setColor(c[i]);
                    g.drawOval(10 + d, 10 + d, 600 - d * 2, 600 - d * 2);
                }
            }
        }

        add(new MyPanel());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 700);
        setVisible(true);
    }

    int delta(int x) {
        double diagonal = Math.sqrt(240 * 240);
        return (int) (diagonal * 15 * x / 240);
    }

    public static void main(String[] args) {
        new problem03();
    }
}
