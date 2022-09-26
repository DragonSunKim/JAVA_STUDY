package practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// Coding By 김용선.

public class problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        System.out.println("단어 개수 : " + st.countTokens());

        String[] array = new String[st.countTokens()];
        for (int i = 0; i < array.length; i++) {
            array[i] = st.nextToken();
        }
        Arrays.sort(array);

        System.out.print("정렬된 토큰 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
