package challenge_Assignment;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

// Coding By 김용선.

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String toString() {
        return "[" + model + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car) obj;
            if (model.equals(c.model))
                return true;
        }
        return false;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");

        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");

        // if (myCar.equals(yourCar) == true)
        // System.out.println("내 자동차는 " + myCar.toString() + ", 너 자동차는 " +
        // yourCar.toString() + "로 모델이 같다.");
        // else
        // System.out.println("내 자동차는 " + myCar.toString() + ", 너 자동차는 " +
        // yourCar.toString() + "로 모델이 다르다.");

        String s = MessageFormat.format("날짜: {1}, 자동차 모델={0}, 운전자({2})",
                myCar.toString(), sdf1.format(d), "홍길동");

        StringTokenizer st = new StringTokenizer(s, " ,=[]()");

        if (myCar.equals(yourCar) == true) {
            System.out.println("자동차 모델이 둘 다 " + myCar.toString() + "로 동일하다.");
            System.out.println(s);
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        } else
            System.out.println("내 자동차는 " + myCar.toString() + ", 너 자동차는 " + yourCar.toString() + "로 모델이 다르다.");
    }
}
