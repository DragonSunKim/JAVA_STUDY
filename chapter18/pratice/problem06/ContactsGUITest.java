import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ContactsGUITest extends JFrame implements ActionListener {
    ArrayList<Person> list;
    ContactsDAO dao;

    JFrame appFrame;

    JLabel jlbName, jlbPhone, jlbEmail;
    JTextField jtfName, jtfPhone, jtfEmail;
    JButton jbnInsert, jbnDelete, jbnClear, jbnUpdate, jbnSearch, jbnForward, jbnBack, jbnExit;

    String name, phone, email;
    int recordNumber;

    public static void main(String[] args) {
        new ContactsGUITest();
    }

    public ContactsGUITest() {
        name = "";
        phone = "";
        email = "";
        recordNumber = -1;

        setTitle("연락처");
        setLayout(new GridBagLayout());

        arrange();

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        list = new ArrayList<>();
        dao = new ContactsDAO();
    }

    public void arrange() {
        jlbName = new JLabel("이름");
        jlbPhone = new JLabel("전화번호");
        jlbEmail = new JLabel("이메일");

        jtfName = new JTextField(20);
        jtfPhone = new JTextField(20);
        jtfEmail = new JTextField(20);

        jbnInsert = new JButton("추가");
        jbnDelete = new JButton("삭제");
        jbnClear = new JButton("초기화");
        jbnUpdate = new JButton("갱신");
        jbnSearch = new JButton("탐색");

        jbnForward = new JButton("→");
        jbnBack = new JButton("←");
        jbnExit = new JButton("종료");

        JPanel panel = new JPanel(new GridLayout(2, 1, 5, 5));
        JPanel p1 = new JPanel(new GridLayout(3, 2, 5, 5));
        p1.add(jlbName);
        p1.add(jtfName);
        p1.add(jlbPhone);
        p1.add(jtfPhone);
        p1.add(jlbEmail);
        p1.add(jtfEmail);

        JPanel p2 = new JPanel(new GridLayout(3, 3, 5, 5));
        p2.add(jbnInsert);
        p2.add(jbnDelete);
        p2.add(jbnUpdate);
        p2.add(jbnBack);
        p2.add(jbnSearch);
        p2.add(jbnForward);
        p2.add(jbnClear);
        p2.add(new JLabel());
        p2.add(jbnExit);
        panel.add(p1);
        panel.add(p2);
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 10));
        add(panel);

        jbnInsert.addActionListener(this);
        jbnDelete.addActionListener(this);
        jbnClear.addActionListener(this);
        jbnUpdate.addActionListener(this);
        jbnSearch.addActionListener(this);
        jbnForward.addActionListener(this);
        jbnBack.addActionListener(this);
        jbnExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbnInsert)
            insert();
        else if (e.getSource() == jbnDelete)
            delete();
        else if (e.getSource() == jbnUpdate)
            update();
        else if (e.getSource() == jbnSearch)
            search();
        else if (e.getSource() == jbnForward)
            next();
        else if (e.getSource() == jbnBack)
            previous();
        else if (e.getSource() == jbnClear)
            clear();
        else if (e.getSource() == jbnExit)
            System.exit(0);
    }

    public void insert() {
        name = jtfName.getText();
        phone = jtfPhone.getText();
        email = jtfEmail.getText();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "추가할 레코드의 이름 ?");
        } else {
            Person person = new Person(name, phone, email);
            dao.insert(person);
            JOptionPane.showMessageDialog(null, "레코드가 저장되었습니다.");
        }
        clear();
    }

    public void delete() {
        name = jtfName.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "삭제할 레코드의 이름은 ?");
        } else {
            int numberOfDeleted = dao.delete(name);
            JOptionPane.showMessageDialog(null, numberOfDeleted + "개의 Tuple이 삭제되었습니다.");
        }
        clear();
    }

    public void update() {
        name = jtfName.getText();
        phone = jtfEmail.getText();
        email = jtfEmail.getText();

        Person contacts = new Person(name, phone, email);
        dao.update(contacts);

        JOptionPane.showMessageDialog(null, name + "레코드가 Update 되었습니다.");
        clear();
    }

    public void search() {
        name = jtfName.getText();
        list.clear();

        recordNumber = 0;
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "탐색할 레코드의 이름은 ?");
        } else {
            list = dao.search(name);
            if (list.size() == 0) {
                JOptionPane.showMessageDialog(null, "레코드가 없습니다.");
                clear();
            } else {
                Person person = (Person) list.get(recordNumber);
                jtfName.setText(person.getName());
                jtfPhone.setText(person.getPhone());
                jtfEmail.setText(person.getEmail());
            }
        }
    }

    public void next() {
        recordNumber++;
        if (recordNumber >= list.size()) {
            JOptionPane.showMessageDialog(null, "탐색한 레코드의 끝입니다.");
            jbnForward.setEnabled(false);
            jbnBack.setEnabled(true);
            recordNumber--;
        } else {
            jbnBack.setEnabled(true);
            Person person = (Person) list.get(recordNumber);
            jtfName.setText(person.getName());
            jtfPhone.setText(person.getPhone());
            jtfEmail.setText(person.getEmail());
        }
    }

    public void previous() {
        recordNumber--;

        if (recordNumber < 0) {
            JOptionPane.showMessageDialog(null, "탐색한 레코드의 시작입니다.");
            jbnForward.setEnabled(true);
            jbnBack.setEnabled(false);
            recordNumber++;
        } else {
            jbnForward.setEnabled(true);
            Person person = (Person) list.get(recordNumber);
            jtfName.setText(person.getName());
            jtfPhone.setText(person.getPhone());
            jtfEmail.setText(person.getEmail());
        }
    }

    public void clear() {
        jtfName.setText("");
        jtfPhone.setText("");
        jtfEmail.setText("");

        recordNumber = -1;
        list.clear();

        jbnForward.setEnabled(true);
        jbnBack.setEnabled(true);
    }

}
