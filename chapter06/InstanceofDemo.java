// Coding By 김용선.

public class InstanceofDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();

        System.out.println(s instanceof Person); // true

        System.out.println(s instanceof Student); // true

        System.out.println(p instanceof Student); // false

        // System.out.println(s instanceof String); // 오류 발생

        downcast(s);
    }

    static void downcast(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println("ok, 하향 타입 변환");
        }
    }
}
