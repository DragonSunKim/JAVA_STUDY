package practice;

// Coding By 김용선.

public class problem05 {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
    }

    static void show(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        } else if (obj instanceof StringBuilder) {
            StringBuilder s = (StringBuilder) obj;
            System.out.println(s);
        } else if (obj instanceof StringBuffer) {
            StringBuffer s = (StringBuffer) obj;
            System.out.println(s);
        }
    }
}
