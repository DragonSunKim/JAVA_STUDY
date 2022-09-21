import java.util.Scanner;

// Coding By 김용선.

public class problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        double p = in.nextDouble();

        String[][] array = new String[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = "0";
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() <= p) {
                    array[i][j] = "*";
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        int count;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count = 0;
                if (array[i][j].equals("*"))
                    continue;
                else {
                    if (i == 0) {
                        if (j == 0) {
                            count = (array[i][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j + 1].equals("*")) ? count + 1 : count;
                        } else if (j == (n - 1)) {
                            count = (array[i][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j].equals("*")) ? count + 1 : count;
                        } else {
                            count = (array[i][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j + 1].equals("*")) ? count + 1 : count;
                        }
                    } else if (i == (m - 1)) {
                        if (j == 0) {
                            count = (array[i][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j + 1].equals("*")) ? count + 1 : count;
                        } else if (j == (n - 1)) {
                            count = (array[i][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j].equals("*")) ? count + 1 : count;
                        } else {
                            count = (array[i][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j + 1].equals("*")) ? count + 1 : count;
                        }
                    } else {
                        if (j == 0) {
                            count = (array[i][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j].equals("*")) ? count + 1 : count;
                        } else if (j == (n - 1)) {
                            count = (array[i][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j].equals("*")) ? count + 1 : count;
                        } else {
                            count = (array[i][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i - 1][j + 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j - 1].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j].equals("*")) ? count + 1 : count;
                            count = (array[i + 1][j + 1].equals("*")) ? count + 1 : count;
                        }
                    }
                }
                array[i][j] = Integer.toString(count);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
