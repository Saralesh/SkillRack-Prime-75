import java.util.Scanner;

public class Game_collect_maximum_points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        int[][] res = new int[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                arr[i][j] = in.nextInt();
            }
        }
        res[0][0] = arr[0][0];
        for(int col = 1;col < c;col++){
            res[0][col] = arr[0][col] + res[0][col-1];
        }
        for(int row = 1;row < r;row++){
            res[row][0] = arr[row][0] + res[row-1][0];
        }
        for(int row = 1;row < r;row++){
            for(int col = 1;col < c;col++){
                int sum = Math.max(res[row-1][col],res[row][col-1]);
                res[row][col] = arr[row][col] + sum;
            }
        }
        System.out.println(res[r-1][c-1]);
    }
}
