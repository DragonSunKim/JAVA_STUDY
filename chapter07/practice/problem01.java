package practice;

// Coding By 김용선.

abstract class abstract_conctete {
    int i;

    void show() {
    };

    abstract_conctete(int i) {
        this.i = i;
    };
}

class Concrete extends abstract_conctete {
    int j;

    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }

    Concrete(int i, int j) {
        super(i);
        this.j = j;
    }
}

public class problem01 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}
