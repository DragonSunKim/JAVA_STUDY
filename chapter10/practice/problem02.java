// Coding By 김용선.

interface Wordable {
    void word();
}

public class problem02 {
    public static void main(String[] args) {
        Wordable[] m = {
                () -> System.out.println("가위"),
                () -> System.out.println("나비"),
                () -> System.out.println("다리"),
                () -> System.out.println("마차")
        };

        for (Wordable wordable : m)
            wordable.word();
    }
}
