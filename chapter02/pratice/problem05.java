// Coding By 김용선.

public class problem05 {
    public static void main(String[] args) {
        char c = 'b';
        int cal = ((int) 'B' - (int) 'b') + (int) c;
        char result = (char) cal;

        System.out.println(c + "의 대문자 변환 : " + result);
    }
}
