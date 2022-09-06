import javax.swing.JFrame;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("안녕, 스윙!");
        setSize(300, 100);
        setVisible(true);
    }
}

public class JFrame1Demo {
    public static void main(String[] args) {
        // 프레임 객체 생성
        new MyFrame();
    }
}
