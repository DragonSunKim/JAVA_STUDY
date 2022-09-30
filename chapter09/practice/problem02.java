package practice;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("객체를 잘못 입력했습니다.");
        }
    }

    static void casting(Shape s) {
        Circle c = (Circle) s;
    }
}

class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}