import java.awt.*;
import javax.swing.*;

public class StringDemo extends JFrame {
    class MyPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawString("문자열을 그려 보자!", 20, 20);
            g.drawString("너만 그리니? 나도 그려보자!", 50, 50);
        }
    }

    StringDemo() {
        setTitle("문자열 그리기");

        add(new MyPanel());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StringDemo();

    }
}
