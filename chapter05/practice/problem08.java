import java.util.Scanner;

// Coding By 김용선.

public class problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toUpperCase();
        for (Week w : Week.values()) {
            if (s.equals(w.name())) {
                String a = w.toString();
                System.out.print(Week.valueOf(s) + "은 ");
                switchWeek(a);
            }
        }

    }

    public static void switchWeek(String s) {
        switch (s) {
            case "월요일":
                System.out.println("싫다");
                break;
            case "금요일":
                System.out.println("좋다");
                break;
            case "토요일":
            case "일요일":
                System.out.println("최고");
                break;
            case "화요일":
            case "수요일":
            case "목요일":
                System.out.println("그저 그렇다");
        }
    }
}

enum Week {
    SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"),
    THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");

    private String s;

    Week(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
