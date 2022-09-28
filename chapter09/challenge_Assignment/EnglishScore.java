package challenge_Assignment;

// Coding By 김용선.

public class EnglishScore implements Comparable<EnglishScore> {
    String name;
    int score;

    public EnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + ", " + score;
    }

    public int compareTo(EnglishScore e) {
        EnglishScore es = e;
        return score < es.score ? -1 : (score > es.score ? 1 : 0);
    }

    static <T extends Comparable> T findBest(T[] a) {
        T best = a[0];
        for (T e : a)
            if (best.compareTo(e) < 1)
                best = e;
        return best;
    }

    static <T> T findScore(T[] a, String name) {
        T ex;
        for (T t : a) {
            if (t.toString().substring(0, 3).equals(name))
                ex = t;
        }
        return ex;

    }

    public static void main(String[] args) {
        EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("김용선", 100) };

        MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("김용선", 100) };

        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));
    }
}

class MathScore implements Comparable<MathScore> {
    String name;
    int score;

    public MathScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + ", " + score;
    }

    public int compareTo(MathScore e) {
        MathScore es = e;
        return score < es.score ? -1 : (score > es.score ? 1 : 0);
    }
}