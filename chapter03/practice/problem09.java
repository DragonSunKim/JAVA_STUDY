package practice;

// Coding By 김용선.

public class problem09 {
    public static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요", 1, 2);
        foo("잘 있어");
    }

    public static void foo(String n1) {
        System.out.printf("%s\n", n1);
    }

    public static void foo(String n1, int n2) {
        System.out.printf("%s %d\n", n1, n2);
    }

    public static void foo(String n1, int n2, int n3) {
        System.out.printf("%s %d %d\n", n1, n2, n3);
    }
}
