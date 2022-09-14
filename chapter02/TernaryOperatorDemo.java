//Coding By 김용선.

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int x = 1, y;

        // x값이 1이면 y에 10을대입하고 1이 아니면 20을 대입한다.
        y = (x == 1) ? 10 : 20;
        System.out.println(y);

        // x값이 1보다 크면 x++를 수행한 값을 y에 대입, 그렇지 않으면 x+20을 y에 대입한다.
        y = (x > 1) ? x++ : x + 20;
        System.out.println(x);
        System.out.println(y);
    }
}
