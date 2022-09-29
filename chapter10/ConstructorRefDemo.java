// Coding By 김용선.

interface NewObject<T> {
    T getObject(T o);
}

interface NewArray<T> {
    T[] getArray(int size);
}

public class ConstructorRefDemo {
    public static void main(String[] args) {

        NewObject<String> s;
        NewArray<Integer> i;

        s = String::new;
        String str = s.getObject("사과");

        System.out.println(str);

        i = Integer[]::new;
        Integer[] array = i.getArray(2);
        array[0] = 10;
        array[1] = 20;

        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
