package practice;

// Coding By 김용선.

class Dice {
    int roll() {
        double r = Math.random() * 6;
        if (r >= 0 && r < 1)
            return 1;
        else if (r >= 1 && r < 2)
            return 2;
        else if (r >= 2 && r < 3)
            return 3;
        else if (r >= 3 && r < 4)
            return 4;
        else if (r >= 4 && r < 5)
            return 5;
        else
            return 6;
    }
}

public class problem04 {
    public static void main(String[] args) {
        System.out.println(new Dice().roll());
    }
}
