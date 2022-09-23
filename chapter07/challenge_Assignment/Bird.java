package challenge_Assignment;

// Coding By 김용선.

// class Bird implements Countable {
//     String name;

//     public Bird(String name) {
//         this.name = name;
//     }

//     public void count() {
//         System.out.println(name + "가 2마리 있다.");
//     }

//     void fly() {
//         System.out.println("2마리 " + name + "가 날아간다.");
//     }
// }

class Bird extends Countable {

    public Bird(String name, int num) {
        super(name, num);
    }

    public void count() {
        System.out.println(name + "가 " + num + "마리 있다.");
    }

    void fly() {
        System.out.println(num + "마리 " + name + "가 날아간다.");
    }
}