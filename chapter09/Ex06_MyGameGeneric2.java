// Coding By 김용선.

class Npc6 {
    public String toString() {
        return "This is a Npc6";
    }
}

class Tank6 {
    public String toString() {
        return "This is a Tank6";
    }
}

class Camp6<T> {
    private T unit;

    public void set(T unit) {
        this.unit = unit;
    }

    public T get() {
        return unit;
    }
}

public class Ex06_MyGameGeneric2 {
    public static void main(String[] args) {
        Camp6<Npc6> human = new Camp6<>();
        Camp6<Tank6> machine = new Camp6<>();

        human.set(new Npc6());

        // machine.set("난 공룡"); 오류 발생

        Npc6 hUnit = human.get();
        Tank6 mUnit = machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit); // null 출력
    }
}
