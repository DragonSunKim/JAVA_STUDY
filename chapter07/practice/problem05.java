package practice;

// Coding By 김용선.

abstract class Controller {
    boolean power;

    void show() {
    };

    String getName(String name) {
        return name;
    };
}

class TV extends Controller {

    TV(boolean power) {
        this.power = power;
    }

    void show() {
        if (power == true)
            System.out.println(getName("TV") + "가 켜졌습니다");
        else
            System.out.println(getName("TV") + "가 꺼졌습니다.");
    }
}

class Radio extends Controller {
    Radio(boolean power) {
        this.power = power;
    }

    void show() {
        if (power == true)
            System.out.println(getName("라디오") + "가 켜졌습니다");
        else
            System.out.println(getName("라디오") + "가 꺼졌습니다.");
    }
}

public class problem05 {
    public static void main(String[] args) {
        Controller[] c = { new TV(false), new Radio(true) };

        for (Controller controller : c)
            controller.show();
    }
}
