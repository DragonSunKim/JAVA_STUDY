package practice;

import java.util.Calendar;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) {
        String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
        String[] noonName = { "오전", "오후" };

        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        String week = "";
        if (c.get(Calendar.DAY_OF_WEEK) == 1)
            week = weekName[0];
        else if (c.get(Calendar.DAY_OF_WEEK) == 2)
            week = weekName[1];
        else if (c.get(Calendar.DAY_OF_WEEK) == 3)
            week = weekName[2];
        else if (c.get(Calendar.DAY_OF_WEEK) == 4)
            week = weekName[3];
        else if (c.get(Calendar.DAY_OF_WEEK) == 5)
            week = weekName[4];
        else if (c.get(Calendar.DAY_OF_WEEK) == 6)
            week = weekName[5];
        else if (c.get(Calendar.DAY_OF_WEEK) == 7)
            week = weekName[6];

        String noon;
        if (c.get(Calendar.HOUR_OF_DAY) >= 12)
            noon = noonName[1];
        else
            noon = noonName[0];

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(week + "요일 " + noon);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
