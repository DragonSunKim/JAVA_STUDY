import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class ClipDemo extends JFrame {
    ClipDemo() {
        setTitle("이미지 그리기");

        class MyPanel extends JPanel {
            BufferedImage korea, android;

            public MyPanel() {
                try {
                    korea = ImageIO.read(new File("images/korea.JPG"));
                    android = ImageIO.read(new File("images/android.png"));
                } catch (IOException e) {

                }
            }

            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setClip(30, 20, 240, 170);

                g.drawImage(korea, 0, 0, null);

                g.setColor(Color.RED);

                g.drawRect(20, 10, 100, 100);

                g.drawImage(android, 100, 30, null);
            }
        }
        add(new MyPanel());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 265);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ClipDemo();
    }

}
