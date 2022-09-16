// Coding By 김용선.

class Person {
    String name;
    String study;
    int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setStudy(String study) {
        this.study = study;
        return this;
    }

    public void sayHello() {
        System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야 " + study + "를 공부 하고 있어.");
    }

}

public class MethodChainDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("용선").setAge(28).setStudy("Java").sayHello();
    }
}
