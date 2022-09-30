package practice;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";

        try {
            showTokens(s, ", ");
        } catch (NoSuchElementException e) {
            System.out.println("끝");
        }
    }

    static void showTokens(String s, String del) {
        StringTokenizer st = new StringTokenizer(s, del);

        while (true) {
            System.out.println(st.nextToken());
        }
    }
}
