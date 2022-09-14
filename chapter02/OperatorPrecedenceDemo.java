// Coding By 김용선.

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int z = ++x * y--; // z = 6 * 10

        System.out.printf("%d\t%d\t%d\n", x, y, z); // x=6, y=9, z=60

        int year = 2022;
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0); // false
    }
}
