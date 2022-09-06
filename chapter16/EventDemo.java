import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo extends JFrame {

    JTextField t1, t2;
    JTextArea area;
    JButton cal, reset;
    JCheckBox cb;

    EventDemo() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 600);
        setVisible(true);
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);

        KeyListener listener2 = new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar() + "를 입력했습니다.");
            }

            public void keyReleased(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {

            }
        };
        t1.addKeyListener(listener2);
    }

    void showCenter() {
        JPanel panel = new JPanel();

        area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
        area.setEditable(false);
        area.setForeground(Color.RED);
        panel.add(area);

        add(panel, BorderLayout.CENTER);

    }

    void showSouth() {
        String[] color = { "red", "blue" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("리셋");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);

        ActionListener listener1 = e -> {
            if (e.getSource() == cal) {
                if (t1.getText().isEmpty())
                    area.setText("반지름을 입력하세요!!!");
                else {
                    String s = t1.getText();
                    double radius = Double.parseDouble(s);
                    double result = radius * radius * 3.14;
                    t2.setText("" + result);
                    area.setText(radius + "*" + radius + "* 3.14 = " + result);
                }
            } else {
                t1.setText("");
                t2.setText("");
                area.setText("");
            }
        };
        cal.addActionListener(listener1);
        reset.addActionListener(listener1);

        cb.addItemListener(e -> {
            int index = ((JComboBox) cb).getSelectedIndex();
            if (index == 0)
                area.setForeground(Color.RED);
            else
                area.setForeground(Color.BLUE);
        });
    }

    public static void main(String[] args) {
        new EventDemo();
    }

}
