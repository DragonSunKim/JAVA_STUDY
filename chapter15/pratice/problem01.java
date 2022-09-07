import javax.swing.*;

public class problem01 extends JFrame {
    problem01() {
        setTitle("입력");
        int ss1;
        int ss2;
        int total;
        String total_str;
        String num1 = JOptionPane.showInputDialog(null, "첫 번째 숫자는?", null);
        String num2 = JOptionPane.showInputDialog(null, "두 번째 숫자는?", null);
        ss1 = Integer.parseInt(num1);
        ss2 = Integer.parseInt(num2);
        total = ss1 + ss2;
        total_str = Integer.toString(total);
        JOptionPane.showMessageDialog(null, "합=" + total_str, "메시지", JOptionPane.INFORMATION_MESSAGE);
    }

    void JLabelTest() {

    }

    public static void main(String[] args) {

        new problem01();
    }
}
