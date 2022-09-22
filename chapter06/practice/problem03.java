package practice;

// Coding By 김용선.

class Point {
    private int x, y;

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x좌표 : " + x + ", y좌표 : " + y;
    }
}

class MovablePoint extends Point {
    private int xSpeed, ySpeed;

    int getxSpeed() {
        return xSpeed;
    }

    int getySpeed() {
        return ySpeed;
    }

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "x좌표 : " + getX() + ", y좌표 : " + getY() + ", xSpeed : " + xSpeed + ", ySpeed : " + ySpeed;
    }
}

public class problem03 {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(2, 3, 10, 20);

        System.out.println(mp.toString());
    }
}
