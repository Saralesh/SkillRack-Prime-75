import java.util.Scanner;

public class Path_Bottom_Left_To_Top_Right {
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
        path[r-1][0] = matrix[r-1][0];
        for (int row = r - 2; row >= 0; row--) {
            if (matrix[row][0] == 1) {
                path[row][0] = path[row + 1][0];
            }
        }
        for (int col = 1; col < c; col++) {
            if (matrix[r - 1][col] == 1) {
                path[r - 1][col] = path[r - 1][col - 1];
            }
        }
        for(int row = r - 2;row >= 0;row--){
            for(int col = 1;col < c;col++){
                if(matrix[row][col] == 1){
                    path[row][col] = path[row + 1][col] + path[row][col-1];
                }
            }
        }
        if(path[0][c-1] > 0){
            System.out.print("yes" + " " +path[0][c-1]);
        }
        else{
            System.out.print("no");
        }
    }
}