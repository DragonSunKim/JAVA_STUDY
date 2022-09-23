package challenge_Assignment;

// Coding By 김용선.

// interface Countable {
//     void count();
// }

abstract class Countable {
    protected String name;
    protected int num;

    Countable(String name, int num) {
        this.name = name;
        this.num = num;
    }

    abstract void count();
}