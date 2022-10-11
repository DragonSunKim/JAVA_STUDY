import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) throws IOException {

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\practice\\double.txt"));

        DataInputStream dis = new DataInputStream(new FileInputStream(
                "C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\practice\\double.txt"));

        double[] double_list = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        for (double d : double_list)
            dos.writeDouble(d);

        dos.flush();

        for (int i = 0; i < 5; i++) {
            System.out.println(dis.readDouble());
        }
    }
}
