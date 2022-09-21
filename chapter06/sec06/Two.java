package sec06;

// Coding By 김용선.

public class Two {
    void print() {
        One o = new One();

        // 같은 패키지에 있더라도 다른 객체의 private 멤버에 접근할 수 없다.
        // System.out.println(o.secret());

        System.out.println(o.roommate);
        System.out.println(o.child);
        System.out.println(o.anybody);
    }
}
