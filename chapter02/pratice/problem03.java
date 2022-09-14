import java.util.Scanner;

// Coding By 김용선.

public class problem03 {
    public static void main(String[] args) {

        // x = 원기둥의 밑면 반지름, y = 원기둥의 높이, area = 원기둥의 부피
        double x, y, area;
        Scanner in = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        x = in.nextDouble();

        System.out.print("원기둥의 높이는? ");
        y = in.nextDouble();

        area = (x * x * 3.14) * y;
        System.out.println("원기둥의 부피는 " + area);
    }
}
