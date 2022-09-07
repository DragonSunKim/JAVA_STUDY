package pratice;

import java.awt.*;
import javax.swing.*;

public class problem05 extends JFrame {
    public problem05() {
        setTitle("얼굴");
        add(new CustomPanel());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(260, 260);
        setVisible(true);
    }

    public static void main(String[] args) {
        new problem05();
    }

    class CustomPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.ORANGE);
            g.fillOval(10, 10, 200, 200);

            g.setColor(Color.BLACK);
            g.drawOval(10, 10, 200, 200);

            g.setColor(Color.WHITE);
            g.fillOval(35, 35, 30, 50);

            g.setColor(Color.BLACK);
            g.drawOval(35, 35, 30, 50);

            // 왼쪽 눈동자
            g.setColor(Color.BLACK);
            g.fillOval(40, 40, 15, 25);

            // 오른쪽 눈 흰자
            g.setColor(Color.WHITE);
            g.fillOval(110, 35, 30, 50);

            // 오른쪽 눈 외곽 선
            g.setColor(Color.BLACK);
            g.drawOval(110, 35, 30, 50);

            // 오른쪽 눈동자
            g.setColor(Color.BLACK);
            g.fillOval(115, 40, 15, 25);

            // 코 색
            g.setColor(Color.ORANGE.brighter());
            g.fillOval(66, 76, 30, 25);

            // 코 외곽선
            g.setColor(Color.BLACK);
            g.drawOval(66, 76, 30, 25);

            // 입
            g.setColor(Color.RED);
            // g.fillArc(x, y, width, height, startAngle, arcAngle);
            g.fillArc(30, 110, 140, 30, 45, -270);

        }
    }

}
