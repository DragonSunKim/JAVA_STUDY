package pratice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class problem07 extends JFrame implements ActionListener {
    private JRadioButton hero1;
    private JRadioButton hero2;
    private JRadioButton hero3;
    private ImageIcon image;

    problem07() {
        setTitle("히어로");

        hero1 = new JRadioButton("블랙팬서");
        hero2 = new JRadioButton("스파이더맨");
        hero3 = new JRadioButton("토르");
        // String[] name = { "블랙팬서", "스파이더맨", "토르" };

        // ImageIcon[] image = { new ImageIcon("images/BlackPanther.GIF"),
        // new ImageIcon("images/Spiderman.GIF"), new ImageIcon("images/Thor") };

        image = new ImageIcon(this.getClass().getResource("images/BlackPanther.GIF"));

        JLabel label = new JLabel("", image, JLabel.SOUTH);

        ButtonGroup group = new ButtonGroup();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(hero1);
        p1.add(hero2);
        p1.add(hero3);

        group.add(hero1);
        group.add(hero2);
        group.add(hero3);

        hero1.addActionListener(this);
        hero2.addActionListener(this);
        hero3.addActionListener(this);

        add("North", p1);
        // add("Center", p2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals(hero1.getText())) {

        }
    }

    public static void main(String[] args) {
        new problem07();
    }
}
