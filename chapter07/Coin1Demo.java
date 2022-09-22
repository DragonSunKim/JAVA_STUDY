// Coding By 김용선.

interface Coin {
    int PENNY = 1;
    int NICKEL = 5;
    int DIME = 10;
    int QUARTER = 25;
}

public class Coin1Demo {
    public static void main(String[] args) {
        System.out.println("Dime은 " + Coin.DIME + "센트입니다.");
    }
}
