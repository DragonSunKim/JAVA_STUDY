package practice;

// Coding By 김용선.

interface Talkable {
    void talk();
}

class Korean implements Talkable {
    Korean() {
        talk();
    }

    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable {
    American() {
        talk();
    }

    public void talk() {
        System.out.println("Hello!");
    }
}

public class problem04 {
    static void speak(Talkable t) {

    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}
