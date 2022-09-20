import java.util.Scanner;

// Coding By 김용선.

public class problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        char c = in.next().charAt(0);

        System.out.println(countChar(s, c));

    }

    static int countChar(String s, char c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                count += 1;
        }

        return count;
    }
}