// Coding By 김용선.

public class Switch5Demo {
    public static void main(String[] args) {
        System.out.println(howMany(1) + " 있다.");
        System.out.println(howMany(2) + " 있다.");
        System.out.println(howMany(3) + " 있다.");
    }

    static String howMany(int n) {
        String result;

        switch (n) {
            case 1:
                result = "1개";
                break;
            case 2:
                result = "2개";
                break;
            default:
                result = "많이";
        }
        return result;
    }
}