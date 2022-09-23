package practice;

import java.util.Scanner;

// Coding By 김용선.

abstract class Echoer {
    void start() {
        System.out.println("시작합니다.");
    }

    abstract void echo();

    void stop() {
        System.out.println("종료합니다.");
    }
}

public class problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Echoer e = new Echoer() {
            void echo() {
                String s;
                while (true) {
                    s = in.nextLine();

                    if (s.equals("끝")) {
                        System.out.println(s);
                        break;
                    } else
                        System.out.println(s);
                }
            }
        };

        e.start();
        e.echo();
        e.stop();
    }
}
