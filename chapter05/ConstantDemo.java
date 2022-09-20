// Coding By 김용선.

public class ConstantDemo {
    public static void main(String[] args) {
        final int MALE = 0;
        final int FEMALE = 1;
        final int SOUTH = 1;

        int gender = FEMALE;

        if (gender == MALE)
            System.out.println(MALE + "은(는) 병역 의무가 있다.");
        else
            System.out.println(FEMALE + "은(는) 병역 의무가 없다.");

        // gender에 MALE 혹은 FEMALE이 아닌 다른 값으로 비교하거나 대입해도 컴파일러는 오류를 파악하지 못한다.
        if (gender == SOUTH)
            System.out.println(SOUTH + "은(는) 누구?");
        gender = 5;
    }
}
