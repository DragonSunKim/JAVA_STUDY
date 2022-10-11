import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

// Coding By 김용선.

public class problem08 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\seouul it\\Documents\\GitHub\\JAVA_STUDY\\chapter13\\practice\\words.txt"));

        List<String> list = br.lines().toList();

        String word = list.get(new random_num().random());

        int count = 6;
        String[] guess = new String[word.length()];
        for (int i = 0; i < guess.length; i++) {
            guess[i] = "-";
        }

        String input;
        while (count > 0) {
            System.out.print("추측할 단어입니다 : ");
            for (String s : guess)
                System.out.print(s);

            System.out.println();

            System.out.print("지금까지 추측한 내용입니다 : ");
            for (String s : guess)
                System.out.print((s.equals("-")) ? "" : s);

            System.out.println();

            System.out.print("추측한 문자를 입력하세요 : ");
            input = in.next();

            if (word.contains(input)) {
                System.out.println("정확한 추측입니다. - " + count + "번 더 추측할 수 있습니다.");
                guess[word.indexOf(input)] = input;
            } else {
                count--;
                System.out.println("잘못된 추측입니다. - " + count + "번 더 추측할 수 있습니다.");
            }

        }
    }
}

class random_num {
    double i;

    int random() {
        i = Math.random() * 6;
        int num = 0;
        if (i >= 0 && i < 1)
            num = 1;
        else if (i >= 1 && i < 2)
            num = 2;
        else if (i >= 2 && i < 3)
            num = 3;
        else if (i >= 3 && i < 4)
            num = 4;
        else if (i >= 4 && i < 5)
            num = 5;
        else if (i >= 5 && i < 6)
            num = 6;

        return num;
    }
}
