import java.util.function.Supplier;

// Coding By 김용선.

class Animal {
    public void sound() {
        System.out.println("ㅁㅁㄲㄲ ...");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍");
    }
}

public class problem06 {

    static void soundAnimal(Supplier<Animal> s) {
        s.get().sound();
    }

    public static void main(String[] args) {

        soundAnimal(() -> new Animal());

        soundAnimal(() -> new Dog());
    }
}
