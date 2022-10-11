import java.util.List;
import java.util.stream.Stream;

// Coding By 김용선.

public class problem06 {
    public static void main(String[] args) {
        Stream<Population> sp = Population.list.stream();

        sp.filter(x -> x.getPopulation() > 300.0).forEach(x -> System.out.println(x));
    }
}

class Population {
    String city;
    double population;

    public Population(String city, double population) {
        this.city = city;
        this.population = population;
    }

    String getCity() {
        return city;
    }

    double getPopulation() {
        return population;
    }

    public String toString() {
        return city + "(" + population + ")";
    }

    static final List<Population> list = List.of(
            new Population("서울", 973.7),
            new Population("워싱턴", 63.2),
            new Population("베이징", 2115.0),
            new Population("파리", 224.4),
            new Population("마드리드", 326.5),
            new Population("런던", 853.9));
}
