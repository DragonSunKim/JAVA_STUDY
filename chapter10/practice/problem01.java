package practice;

import java.util.Arrays;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {

        String[] array = { "K", "o", "r", "e", "a", "n" };
        System.out.print("정렬 전 :");
        for (String s : array)
            System.out.print(" " + s);

        Arrays.sort(array, (first, second) -> first.toLowerCase().charAt(0) - second.toLowerCase().charAt(0));

        System.out.print("\n정렬 후 :");
        for (String s : array)
            System.out.print(" " + s);

    }
}
