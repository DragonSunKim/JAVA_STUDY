import javax.swing.*;

public class problem06 extends JFrame {
    problem06() {
        setTitle("애완 동물");
        JPanel p = new JPanel();

        p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));

        JButton b1 = new JButton("버튼1");
        JButton b2 = new JButton("버튼2");
        JButton b3 = new JButton("버튼3");
        JButton b4 = new JButton("버튼4");
        JButton b5 = new JButton("버튼5");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);

        add(p);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 80);
        setVisible(true);
    }

    public static void main(String[] args) {

        new problem06();
    }
}
