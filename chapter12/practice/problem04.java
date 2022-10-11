import java.util.stream.Stream;

// Coding By 김용선.

public class problem04 {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();
        sn.filter(x -> !x.isIsland()).map(Nation::getName).forEach(x -> System.out.print(x + ", "));

    }
}
