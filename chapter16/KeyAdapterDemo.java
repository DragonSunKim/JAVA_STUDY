import javax.swing.*;
import java.awt.event.*;

public class KeyAdapterDemo extends JFrame {
    public KeyAdapterDemo() {
        setTitle("키 어댑터");

        JLabel l = new JLabel("", JLabel.CENTER);
        JTextField t = new JTextField(10);

        add("North", t);
        add("Center", l);

        t.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    l.setText("입력한 문자열 : " + t.getText());
                }
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
    } // 키보드를 누를때 발생

    public static void main(String[] args) {
        new KeyAdapterDemo();
    }
}
