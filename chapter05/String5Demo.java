// Coding By 김용선.

public class String5Demo {
    public static void main(String[] args) {
        String version = String.format("%s %d", "JDK", 14);
        System.out.println(version);

        String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
        System.out.println(fruits);

        String pi = String.valueOf(3.14); // 문자열로 변환
        System.out.println(pi);
    }
}
