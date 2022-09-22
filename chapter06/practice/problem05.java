package practice;

// Coding By 김용선.

class Phone {
    protected String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void talk() {
        System.out.println(owner + "가 통화 중이다.");
    }
}

class Telephone extends Phone {
    private String when;

    Telephone(String owner) {
        super(owner);
    }

    Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    void autoAnswering() {
        System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
    }
}

class Smartphone extends Telephone {
    private String game;

    Smartphone(String owner, String game) {
        super(owner);
        this.game = game;
    }

    void playGame() {
        System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
    }
}

public class problem05 {
    public static void main(String[] args) {

        Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

        for (Phone p : phones) {
            if (p instanceof Smartphone) {
                Smartphone sp = (Smartphone) p;
                sp.playGame();
            } else if (p instanceof Telephone) {
                Telephone tp = (Telephone) p;
                tp.autoAnswering();
            } else if (p instanceof Phone) {
                p.talk();
            }
        }
    }
}
