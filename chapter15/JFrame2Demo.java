import javax.swing.JFrame;

public class JFrame2Demo extends JFrame {
    JFrame2Demo() {
        setTitle("안녕, 스윙!");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame2Demo();
    }
}
