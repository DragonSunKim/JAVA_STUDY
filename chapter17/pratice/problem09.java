package pratice;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class problem09 extends JFrame {
    public problem09() {
        setTitle("클리핑 영역 움직이기");

        MyPanel p = new MyPanel();
        add(p);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        int x, y;
        BufferedImage img;

        public MyPanel() {
            try {
                img = ImageIO.read(new File("dragon.JPG"));
            } catch (IOException e) {

            }
            addMouseMotionListener(new MyMouseListener());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setClip(x, y, 100, 100);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        }

        class MyMouseListener implements MouseMotionListener {
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

            public void mouseMoved(MouseEvent e) {

            }
        }
    }

    public static void main(String[] args) {
        new problem09();
    }
}
