import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDragTest03 extends JFrame {
    private int x1, y1, x2, y2;
    private JLabel status;
    Color color = Color.BLACK;

    public MouseDragTest03() {
        setTitle("드래그에 의한 사각형 By 김용선");

        JPanel p1 = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(color);
                int x = (x1 < x2) ? x1 : x2;
                int y = (y1 < y2) ? y1 : y2;
                int width = Math.abs(x1 - x2);
                int height = Math.abs(y1 - y2);
                g.drawRect(x, y, width, height);
            }
        };
        p1.setBackground(Color.GREEN);

        MyMouseListener listener = new MyMouseListener();
        p1.addMouseListener(listener);
        p1.addMouseMotionListener(listener);

        JPanel p2 = new JPanel();
        status = new JLabel("마우스 위치 정보");
        p2.add(status);

        add("Center", p1);
        add("South", p2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }

    private class MyMouseListener implements MouseListener, MouseMotionListener {

        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            status.setText("(" + x1 + "," + y1 + ")  " + "Coding By 김용선");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            status.setText("(" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")  " + "Coding By 김용선");
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            status.setText("(" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")  " + "Coding By 김용선");
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new MouseDragTest03();
    }
}
