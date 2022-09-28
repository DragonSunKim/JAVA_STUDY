import java.util.ArrayList;

// Coding By 김용선.

public class GenericInheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Beverage> list1 = new ArrayList<>();
        list1.add(new Beer());
        beverageTest(list1);

        ArrayList<Beer> list2 = new ArrayList<>();
        list2.add(new Beer());
        // beverageTest(list2); ArrayList<Beer>는 ArrayList<Beverage>의 자식 타입이 아니다. 오류 발생
    }

    static public void beverageTest(ArrayList<Beverage> list) {
    }
}
