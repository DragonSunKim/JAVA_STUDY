package practice;

import java.text.MessageFormat;

// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

        // String msg = MessageFormat.format("이름 : {0} 번호 : {1} 국적 : {2}", data[0][0],
        // data[0][1], data[0][2]);
        String msg;
        for (int i = 0; i < 3; i++) {
            msg = MessageFormat.format("이름 : {0}    번호 : {1}    국적 : {2}", data[i][0], data[i][1], data[i][2]);
            System.out.println(msg);
        }
    }
}
