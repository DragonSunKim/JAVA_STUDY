// Coding By 김용선.

public class TryCatch1Demo {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2 };

        try {
            System.out.println("마지막 원소 => " + array[3]); // array배열의 범위를 벗어나 오류를 발생
            System.out.println("첫 번째 원소 => " + array[0]);
        } catch (ArrayIndexOutOfBoundsException e) { // 배열의 범위를 벗어난 오류가 발생했을 때, 실행
            System.out.println("원소가 존재하지 않습니다.");
        }
    }
}
