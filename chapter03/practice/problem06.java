package practice;

import java.util.Scanner;

// Coding By 김용선.

public class problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("철수 : ");
        String c = in.nextLine();
        System.out.print("영희 : ");
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
