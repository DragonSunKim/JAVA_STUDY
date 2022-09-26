package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

// Coding By 김용선.

public class problem06 {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss\n오늘은 M월의 d번째 날\n오늘은 yyyy년의 D번째 날");
        System.out.println(sdf1.format(d));

    }
}
