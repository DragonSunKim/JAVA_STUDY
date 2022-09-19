// Coding By 김용선.

class Triangle2 {
    private double h; // 높이
    private double s; // 밑변

    public Triangle2(double s, double h) {
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

    public boolean isSameArea(Triangle2 t) {
        if (findArea() == t.findArea()) {
            return true; // 넓이가 동일하면 true 출력
        } else {
            return false; // 넓이가 동일하지 않으면 false 출력
        }
    }
}

public class problem02 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2(10.0, 5.0);
        Triangle2 t2 = new Triangle2(5.0, 10.0);
        Triangle2 t3 = new Triangle2(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
