import java.util.HashSet;
import java.util.Set;

// Coding By 김용선.

public class problem02 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 16));
        set.add(new Person("나자바", 35));

        for (Person person : set)
            System.out.print(person + " ");
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[" + name + ", " + age + "]";
    }
}