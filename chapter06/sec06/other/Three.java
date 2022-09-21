package sec06.other;

import sec06.One;

// Coding By 김용선.

public class Three {
    void print() {

        One o = new One();

        // 오류 발생
        // System.out.println(o.secret);
        // System.out.println(o.roommate);
        // System.out.println(o.child);

        // 다른 패키지에 있는 클래스라면 public 멤버만 접근할 수 있다.
        System.out.println(o.anybody);
    }
}
