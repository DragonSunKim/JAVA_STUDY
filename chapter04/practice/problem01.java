// Coding By 김용선.

class Triangle {
    private double h; // 높이
    private double s; // 밑변

    public Triangle(double s, double h) {
        this.s = s;
        this.h = h;
    }

    public double geth() {
        return h;
    }

    public double gets() {
        return s;
    }

    public double findArea() {
        return h * s * 0.5;
    }

}

public class problem01 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());
    }
}