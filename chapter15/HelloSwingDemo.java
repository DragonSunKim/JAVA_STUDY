import javax.swing.JFrame;

public class HelloSwingDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        // 타이틀 설정
        f.setTitle("안녕 스윙!");

        // 프레임 크기 설정
        f.setSize(300, 100);

        // 프레임을 화면에 출력
        f.setVisible(true);
    }
}