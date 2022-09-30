package practice;

import java.util.ArrayList;
import java.util.List;

// Coding By 김용선.

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("멍멍~~");
    }
}

class Cuckoo implements Animal {
    public void sound() {
        System.out.println("뻐꾹뻐꾹~~");
    }
}

public class problem05 {

    static <T extends Animal> void printSound(List<T> a) {
        for (T t : a) {
            t.sound();
        }
    }

    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Dog());
        lists.add(new Cuckoo());
        printSound(lists);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        printSound(dogs);
    }
}
