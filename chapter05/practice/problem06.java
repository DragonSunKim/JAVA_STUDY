// Coding By 김용선.

public class problem06 {
    public static void main(String[] args) {
        int[] org = { 1, 2, 3, 4, 5 };

        // 배열 출력
        for (int i = 0; i < org.length; i++) {
            System.out.print(org[i] + " ");
        }

        System.out.println();

        // 배열을 역순으로 변환 후, array배열에 대입
        int[] array = reverse(org);

        // array 배열 출력
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] org) {
        int[] array = new int[org.length];

        for (int i = 0; i < org.length; i++) {
            array[i] = org[org.length - i - 1];
        }

        return array;
    }
}
