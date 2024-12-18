import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Collect_Max_from_a_give_cell {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int p1 = in.nextInt();
        int p2 = in.nextInt();

        res[p1][p2] = arr[p1][p2];
        for (int col = p2 + 1; col < c; col++) {
            res[p1][col] = res[p1][col - 1] + arr[p1][col];
        }

        for (int row = p1 + 1; row < r; row++) {
            res[row][p2] = res[row - 1][p2] + arr[row][p2];
        }

        for (int row = p1 + 1; row < r; row++) {
            for (int col = p2 + 1; col < c; col++) {
                int sum = Math.max(res[row - 1][col], res[row][col - 1]);
                res[row][col] = arr[row][col] + sum;
            }
        }

        System.out.println("the sum is " + res[r - 1][c - 1]);
    }
}
