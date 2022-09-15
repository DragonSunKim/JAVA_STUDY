// Coding By 김용선.

class Phone {
    String model; // model값을 저장할 필드 생성
    int value; // value값을 저장할 필드 생성

    // 메서드 생성
    void print() {
        System.out.println(value + "만 원짜리 " + model + " 스마트폰"); // model, value에 저장된 값을 불러와 출력
    }
}

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone(); // myPhone 객체 생성
        myPhone.model = "갤럭시Z플립3"; // myPhone객체의 model에 값 저장
        myPhone.value = 95; // myPhone객체의 value에 값 저장
        myPhone.print(); // 함수 출력

        Phone yourPhone = new Phone(); // yourPhone객체 생성
        yourPhone.model = "갤럭시Z플립4"; // yourPhone객체의 model에 값 저장
        yourPhone.value = 120; // yourPhone객체의 value에 값 저장
        yourPhone.print(); // 함수 출력
    }
}