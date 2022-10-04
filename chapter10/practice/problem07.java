import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

// Coding By 김용선

class Person {
    private String name;
    private int height;
    private int weight;

    static List<Person> persons = Arrays.asList(
            new Person("황진이", 160, 45),
            new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65),
            new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48));

    String nameGetter() {
        return name;
    }

    int heightGetter() {
        return height;
    }

    int weightGetter() {
        return weight;
    }

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    Person() {
    }
}

public class problem07 {
    public static void main(String[] args) {
        double averageHeight = average(Person.persons, c -> c.heightGetter());
        System.out.println("평균 신장 : " + averageHeight);

        double averageWeight = average(Person.persons, c -> c.weightGetter());
        System.out.println("평균 체중 : " + averageWeight);

    }

    static double average(List<Person> persons, ToIntFunction<Person> f) {
        double sum = 0;

        for (Person p : persons)
            sum += f.applyAsInt(p);

        return sum / persons.size();

    }
}
