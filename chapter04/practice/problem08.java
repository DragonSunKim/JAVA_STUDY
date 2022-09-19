// Coding By 김용선.

class Dice {
    double face = Math.random() * 6;

    int roll() {
        if (face >= 0 && face < 1)
            return 1;
        else if (face >= 1 && face < 2)
            return 2;
        else if (face >= 2 && face < 3)
            return 3;
        else if (face >= 3 && face < 4)
            return 4;
        else if (face >= 4 && face < 5)
            return 5;
        else
            return 6;
    }
}

public class problem08 {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
