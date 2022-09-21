package sec06.other;

import sec06.One;

// Coding By 김용선.

public class One2 extends One {
    void print() {

        // 자식 클래스라도 부모와 다른 패키지에 있다면 private와 default 멤버에 접근할 수 없다.
        // System.out.println(secret);
        // System.out.println(roommate);

        System.out.println(child);
        System.out.println(anybody);
    }
}
