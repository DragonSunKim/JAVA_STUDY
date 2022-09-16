// Coding By 김용선.

class Circle_D {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public Circle_D(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}

public class Circle5Demo {
    public static void main(String[] args) {
        Circle_D myCircle = new Circle_D(10.0);
        Circle_D yourCircle = new Circle_D(5.0);

        System.out.println("원의 개수 : " + Circle_D.numOfCircles);
        System.out.println("원의 개수 : " + yourCircle.numCircles);
    }
}
