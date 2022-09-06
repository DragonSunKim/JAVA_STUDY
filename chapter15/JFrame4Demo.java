import javax.swing.*;

public class JFrame4Demo extends JFrame {
    JFrame4Demo() {
        setTitle("안녕, 스윙!");

        // 패널 생성.
        JPanel p = new JPanel();

        // 레이블 생성
        JLabel l = new JLabel("안녕, 스윙!");

        // 버튼 생성
        JButton b = new JButton("버튼");

        // 패널에 레이블과 버튼을 부착
        p.add(l);
        p.add(b);

        // 패널을 프레임에 부착
        add(p);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame4Demo();
    }
}
