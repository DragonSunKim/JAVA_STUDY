package practice;

// Coding By 김용선.

public class problem07 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(new Integer(100));
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}

class Box<T> {

    T x;

    void set(T input) {
        x = input;
    }

    T get() {
        return x;
    }
}
