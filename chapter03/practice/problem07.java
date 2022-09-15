package practice;

import java.util.Scanner;

// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
    }

    public static String input(String name) {
        return name;
    }

    public static void whosWin(String name1, String name2) {
        Scanner in = new Scanner(System.in);

        System.out.print(name1 + " : ");
        String c = in.nextLine();
        System.out.print(name2 + " : ");
        String y = in.nextLine();

        if (c.equals("s")) {
            if (y.equals("s"))
                System.out.println("무승부!");
            else if (y.equals("r"))
                System.out.println("영희, 승!");
            else if (y.equals("p"))
                System.out.println("철수, 승!");
        } else if (c.equals("r")) {
            if (y.equals("s"))
                System.out.println("철수, 승!");
            else if (y.equals("r"))
                System.out.println("무승부!");
            else if (y.equals("p"))
                System.out.println("영희, 승!");
        } else if (c.equals("p")) {
            if (y.equals("s"))
                System.out.println("영희, 승!");
            else if (y.equals("r"))
                System.out.println("철수, 승!");
            else if (y.equals("p"))
                System.out.println("무승부!");
        }

    }
}
