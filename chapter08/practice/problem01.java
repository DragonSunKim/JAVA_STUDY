package practice;

// Coding By 김용선.

class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            if (radius == c.radius)
                return true;
        }
        return false;
    }
}

public class problem01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(4);

        if (c1.equals(c2))
            System.out.println("c1과 c2는 같다.");
        else
            System.out.println("c1과 c2는 다르다.");

        if (c1.equals(c3))
            System.out.println("c1과 c3는 같다.");
        else
            System.out.println("c1과 c3는 다르다.");
    }
}
