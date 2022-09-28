// Coding By 김용선.

class Npc2 {
    public String toString() {
        return "This is a Npc2";
    }
}

class Tank2 {
    public String toString() {
        return "This is a Tank2";
    }
}

class Camp2 {
    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }
}

public class Ex02_MyGame2 {
    public static void main(String[] args) {

        Camp2 human = new Camp2();
        Camp2 machine = new Camp2();

        human.set(new Npc2());
        machine.set(new Tank2());

        Npc2 hUnit = (Npc2) human.get();
        Tank2 mUnit = (Tank2) machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}
