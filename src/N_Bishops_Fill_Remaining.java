import java.util.Scanner;

public class N_Bishops_Fill_Remaining {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[][] board = new byte[n][n];
        boolean[] ip = new boolean[2 * n - 1];
        boolean[] sw = new boolean[2 * n - 1];
        boolean[] nw = new boolean[2 * n - 1];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = in.nextByte();
                if (board[row][col] == 1) {
                    ip[row] = true;
                    sw[col - row + n - 1] = true;
                    nw[row + col] = true;
                }
            }
        }

        if (canPlace(n, 0, board, ip, sw, nw)) {
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(board[row][col]);
                }
                System.out.println();
            }
        } else {
            System.out.print("NotPossible");
        }
    }

    public static boolean canPlace(int n,int row,byte[][] board,boolean[] ip,boolean[] sw,boolean[] nw){
        if(row == n)  return true;

        if(ip[row]){
            return (canPlace(n, row+1, board, ip, sw, nw));
        }
        for(int col = 0;col < n;col++){
            if(!sw[col-row+n-1] && !nw[row+col]){
                board[row][col] = 1;
                ip[row] = true;
                sw[col - row + n - 1] = true;
                nw[row + col] = true;
                if(canPlace(n, row+1, board, ip, sw, nw))   return true;
                else{
                    board[row][col] = 0;
                    ip[row] = false;
                    sw[col - row + n - 1] = false;
                    nw[row + col] = false;
                }
            }
        }
        return false;


    }
}
