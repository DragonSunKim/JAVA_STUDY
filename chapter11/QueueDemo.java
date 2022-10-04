import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

// Coding By 김용선.

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        // q.remove(); 예외가 발생한다. 큐에 원소가 없는데 romove() 메서드를 호출했기 때문이다

        System.out.println(q.poll()); // remove() 메서드와 달리 큐에 원소가 없으면 null을 반환.

        q.offer("사과");
        System.out.println("바나나를 추가했나요? " + q.offer("바나나"));

        try {
            q.add("체리");
        } catch (IllegalStateException e) {
        }

        System.out.println("헤드 엿보기 ; " + q.peek());

        String head = null;

        try {
            head = q.remove();
            System.out.println(head + " 제거하기");
            System.out.println("새로운 헤드 : " + q.element());
        } catch (NoSuchElementException e) {
        }

        head = q.poll();
        System.out.println(head + " 제거하기");
        System.out.println("새로운 헤드 : " + q.peek());

        System.out.println("체리를 포함하고 있나요? " + q.contains("체리"));
        System.out.println("사과를 포함하고 있나요? " + q.contains("사과"));
    }
}
