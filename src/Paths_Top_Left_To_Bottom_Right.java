import java.util.Scanner;
public class Paths_Top_Left_To_Bottom_Right {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int[][] path = new int[r][c];
        path[0][0] = matrix[0][0];

        // First row
        for (int col = 1; col < c; col++) {
            if (matrix[0][col] == 1) {
                path[0][col] = path[0][col - 1];
            }
        }

        // First column
        for (int row = 1; row < r; row++) {
            if (matrix[row][0] == 1) {
                path[row][0] = path[row - 1][0];
            }
        }

        // Remaining cells
        for (int row = 1; row < r; row++) {
            for (int col = 1; col < c; col++) {
                if (matrix[row][col] == 1) {
                    path[row][col] = path[row - 1][col] + path[row][col - 1];
                }
            }
        }

        if (path[r - 1][c - 1] > 0) {
            System.out.println("YES " + path[r - 1][c - 1]);
        } else {
            System.out.println("NO");
        }
    }
}
