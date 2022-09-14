import java.util.Scanner;

// Conding By 김용선.

public class problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("전공 이수 학점 : ");
        int x = in.nextInt();

        System.out.print("교양 이수 학점 : ");
        int y = in.nextInt();

        System.out.print("일반 이수 학점 : ");
        int z = in.nextInt();

        int total = x + y + z;

        boolean result = (total >= 140) && (x >= 70) && ((y >= 30 && z >= 30) || (y + z >= 80));

        System.out.printf("졸업 %s", (result) ? "가능" : "불가능");
    }
}
