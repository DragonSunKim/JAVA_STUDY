// Coding By 김용선.

class Npc5 {
    public String toString() {
        return "This is a Npc5";
    }
}

class Tank5 {
    public String toString() {
        return "This is a Tank5";
    }
}

class Camp5<T> {
    private T unit;

    public void set(T unit) {
        this.unit = unit;
    }

    public T get() {
        return unit;
    }
}

public class Ex05_MyGameGeneric1 {
    public static void main(String[] args) {
        Camp5<Npc5> human = new Camp5<>();
        Camp5<Tank5> machine = new Camp5<>();

        human.set(new Npc5());
        machine.set(new Tank5());

        Npc5 hUnit = human.get();
        Tank5 mUnit = machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);
    }
}
