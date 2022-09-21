package sec06;

// Coding By 김용선.

public class One1 extends One {
    void print() {
        // 같은 패키지에 있는 자식 객체라도 부모클래스의 private 멤버에는 접근할 수 없다.
        // System.out.println(secret);

        // 같은 패키지에 있는 자식 객체는 부모 클래스의 private 외의 멤버에 접근할 수 있다.
        System.out.println(roommate);
        System.out.println(child);
        System.out.println(anybody);

        // 메서드를 오버라이딩할 때 부모 클래스의 메서드보다 더 좁은 접근 지정을 할 수 없다.
        // void show(){

        // }
    }
}
