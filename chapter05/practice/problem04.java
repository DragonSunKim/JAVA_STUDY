import java.util.Scanner;

// Coding By 김용선.

public class problem04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("URL을 입력하세요 : ");
            String url = in.nextLine();

            // bye를 입력하면 종료.
            if (url.equals("bye"))
                break;

            // .com으로 끝나는지 검색
            if (url.substring(url.length() - 3).equals("com"))
                System.out.println(url + "은 'com'으로 끝납니다.");

            // java를 포함하는지 검색
            if (url.contains("java"))
                System.out.println(url + "은 'java'를 포함합니다.");

        }

    }
}
