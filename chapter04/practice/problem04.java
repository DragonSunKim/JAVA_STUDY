// Coding By 김용선.

class Car {
    private static int numOfCar = 0;
    private static int numOfRedCar = 0;

    Car(String s) {
        if (s.equals("red") || s.equals("RED")) {
            numOfRedCar += 1;
            numOfCar += 1;
        } else {
            numOfCar += 1;
        }
    }

    static int getNumOfCar() {
        return numOfCar;
    }

    static int getNumOfRedCar() {
        return numOfRedCar;
    }
}

public class problem04 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}
