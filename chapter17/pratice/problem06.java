package pratice;

import java.awt.*;
import javax.swing.*;

public class problem06 extends JFrame {
    public problem06() {
        setTitle("3개의 팬 Coding By 김용선");
        add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int cx = getWidth() / 2;
                int cy = getHeight() / 2;
                int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

                int x = cx - radius;
                int y = cy - radius;

                g.fillArc(x, y, radius * 2, radius * 2, 0, 30);
                g.fillArc(x, y, radius * 2, radius * 2, 120, 30);
                g.fillArc(x, y, radius * 2, radius * 2, 240, 30);

            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new problem06();
    }
}
