import java.util.Optional;

// Coding By 김용선.

public class Optional2Demo {
    public static void main(String[] args) {
        String s1 = null;
        Optional<String> o = Optional.ofNullable(s1); // ofNullable()는 of()와 달리 null도 가질 수 있다.

        // Optional 타입을 사용하지 않는 경우 처리 방법
        if (s1 != null)
            Util.print(s1);
        else
            Util.print("없음");

        // Optional 타입을 사용하는 경우 처리 방법
        if (o.isPresent())
            Util.print(o.get());
        else
            Util.print("없음");

        String s2 = o.orElse("없음");
        Util.print(s2);

        o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));
    }
}
