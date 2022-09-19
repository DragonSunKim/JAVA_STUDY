// Coding By 김용선.

class Line {
    int line;

    Line(int line) {
        this.line = line;
    }

    boolean isSameLine(Line l) {
        if (line == l.line) {
            return true;
        } else {
            return false;
        }
    }
}

public class problem05 {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
