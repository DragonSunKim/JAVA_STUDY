// Coding By 김용선.

class GolfClub {
    int num = 0;
    String name;

    GolfClub() {
        num = 7;
        name = "아이언";
    }

    GolfClub(int num) {
        this.num = num;
        name = "아이언";
    }

    GolfClub(String name) {
        this.name = name;
    }

    void print() {
        if (num != 0)
            System.out.println(num + "번 " + name + "입니다.");
        else
            System.out.println(name + "입니다.");
    }
}

public class problem07 {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
