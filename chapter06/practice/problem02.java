package practice;

// Coding By 김용선.

class Person {
    String name;
    int age;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void show() {
        System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int studentNum;

    int getStudentNum() {
        return studentNum;
    }

    void show() {
        System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, studentNum);
    }

    Student(String name, int age, int studentNum) {
        super(name, age);
        this.studentNum = studentNum;
    }
}

class ForeignStudent extends Student {
    String nation;

    String getNation() {
        return nation;
    }

    void show() {
        System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, studentNum, nation);
    }

    ForeignStudent(String name, int age, int studentNum, String nation) {
        super(name, age, studentNum);
        this.nation = nation;
    }
}

public class problem02 {
    public static void main(String[] args) {
        Person[] persons = { new Person("길동이", 22), new Student("황진이", 23, 100),
                new ForeignStudent("Amy", 30, 200, "U.S.A") };

        for (Person p : persons)
            p.show();
    }
}
