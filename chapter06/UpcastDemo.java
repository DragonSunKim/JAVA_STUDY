// Coding By 김용선.

public class UpcastDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();

        p = s; // 자동으로 타입 변환되며 p = (Person)s 와 동일하다.

        // number와 work()는 부모 타입에 없는 멤버이므로 부모 타입 변수에서 볼 수 없다.
        // p.number = 1; p.work();

        p.whoami();
    }
}
