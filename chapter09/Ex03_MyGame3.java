// Coding By 김용선.

class Npc3 {
    public String toString() {
        return "This is a Npc3";
    }
}

class Tank3 {
    public String toString() {
        return "This is a Tank3";
    }
}

class Camp3 {
    private Object unit;

    public void set(Object unit) {
        this.unit = unit;
    }

    public Object get() {
        return unit;
    }
}

public class Ex03_MyGame3 {
    public static void main(String[] args) {
        Camp3 human = new Camp3();
        Camp3 machine = new Camp3();

        human.set("난 공룡");
        machine.set("난 우주인");

        Npc3 hUnit = (Npc3) human.get();
        Tank3 mUnit = (Tank3) machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}
