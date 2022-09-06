import javax.swing.*;

public class JFrame3Demo extends JFrame {
    JFrame3Demo() {
        setTitle("안녕, 스윙!");

        JButton b = new JButton("버튼");
        // 버튼 b를 프레임에 부착.
        add(b);

        // 프레임을 닫으면 강제종료.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame3Demo();
    }
}
