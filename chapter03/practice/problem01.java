package practice;

import java.util.Scanner;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        if (age >= 19)
            System.out.println("성년");
        else
            System.out.println("미성년");
    }
}
