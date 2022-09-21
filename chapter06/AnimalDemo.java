// Coding By 김용선.

class Animal {
    public Animal(String s) {
        System.out.println("동물 : " + s);
    }
}

class Mammal extends Animal {
    public Mammal() {
        // 부모 클래스의 디폴트 생성자가 없으므로 오류가 발생
        // super();

        super("원숭이");
        System.out.println("포유류 : 원숭이");
    }

    public Mammal(String s) {
        super(s);
        System.out.println("포유류 : " + s);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Mammal ape = new Mammal();
        Mammal lion = new Mammal("사자");
    }
}
