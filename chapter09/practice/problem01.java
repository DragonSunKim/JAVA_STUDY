package practice;

import java.util.Calendar;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {
        MyDate d = new MyDate(2035, 12, 25);

        System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
    }
}

class MyDate {
    int year;
    int month;
    int day;

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}