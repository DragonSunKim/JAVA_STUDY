// Coding By 김용선.

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.GENDERX;

        if (gender == Gender.FEMALE)
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");
        else if (gender == Gender.GENDERX)
            System.out.println(Gender.GENDERX + "은 갈 수도 있고 안 갈 수도 있습니다.");
        else
            System.out.println(Gender.MALE + "은 병역 의무가 있다.");

        for (Gender g : Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));
    }
}

enum Gender {
    MALE("남성"), FEMALE("여성"), GENDERX("중성");

    private String s;

    Gender(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
