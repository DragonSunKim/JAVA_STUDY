// Coding By 김용선.

public class TryCatch3Demo {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2 };

        try {
            int x = array[3];
        } catch (Exception e) {
            System.out.println("어이쿠!!!");
        }
        // Exception 객체를 처리하는 catch 블록에서 모든 예외를 처리하므로 오류 발생.
        // catch(ArrayIndexOutOfBoundsException e){
        // System.out.println("원소가 존재하지 않습니다.");
        // }
        System.out.println("종료");
    }
}
