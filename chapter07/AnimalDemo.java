// Coding By 김용선.

interface Animal {
    void sound(); // 추상클래스 생성
}

class Dog implements Animal {
    public void sound() {
        System.out.println("멍멍~~");
    }
}

class Cuckoo implements Animal {
    public void sound() {
        System.out.println("뻐꾹~~");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cuckoo() };

        for (Animal a : animals) {
            makeSound(a);
        }
    }

    static void makeSound(Animal a) {
        a.sound();
    }
}
