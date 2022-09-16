// Coding By 김용선.

// class Circle_C {
//     double radius;
//     String color;

//     public Circle_C(double r, String c) {
//         radius = r;
//         color = c;
//     }

//     public Circle_C(double r) {
//         radius = r;
//         color = "파랑";
//     }

//     public Circle_C(String c) {
//         radius = 10.0;
//         color = c;
//     }

//     public Circle_C() {
//         radius = 10.0;
//         color = "빨강";
//     }

// }
class Circle_C {
    double radius;
    String color;

    public Circle_C(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle_C(double radius) {
        this(radius, "파랑");
    }

    public Circle_C(String color) {
        this(10.0, color);
    }

    public Circle_C() {
        this(10.0, "빨강");
    }

}

public class Circle4Demo {
    public static void main(String[] args) {
        Circle_C c1 = new Circle_C(10.0, "초록");
        Circle_C c2 = new Circle_C(5.0);
        Circle_C c3 = new Circle_C("노랑");
        Circle_C c4 = new Circle_C();

        System.out.printf("%.1f %s\n", c1.radius, c1.color);
        System.out.printf("%.1f %s\n", c2.radius, c2.color);
        System.out.printf("%.1f %s\n", c3.radius, c3.color);
        System.out.printf("%.1f %s", c4.radius, c4.color);
    }
}
