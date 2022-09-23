package challenge_Assignment;

// Coding By 김용선.

// class Tree implements Countable {
//     String name;

//     public Tree(String name) {
//         this.name = name;
//     }

//     public void count() {
//         System.out.println(name + "가 5그루 있다.");
//     }

//     void ripen() {
//         System.out.println(name + "에 열매가 잘 익었다.");
//     }
// }

class Tree extends Countable {

    public Tree(String name, int num) {
        super(name, num);
    }

    public void count() {
        System.out.println(name + "가 " + num + "그루 있다.");
    }

    void ripen() {
        System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
    }
}