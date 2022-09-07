import javax.swing.*;

public class problem05 extends JFrame {
    problem05() {
        setTitle("애완 동물");

        JPanel p = new JPanel();

        JRadioButton rb1 = new JRadioButton("강아지");
        JRadioButton rb2 = new JRadioButton("고양이");
        JRadioButton rb3 = new JRadioButton("금붕어");
        ButtonGroup group = new ButtonGroup();

        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        p.add(rb1);
        p.add(rb2);
        p.add(rb3);

        add(p);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {

        new problem05();
    }
}
