import java.util.Scanner;

public class N_rook_Fill_Remainnig {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[][] board = new byte[n][n];
        boolean[] rowOccupied = new boolean[n];
        boolean[] colOccupied = new boolean[n];

        // Input the initial board state
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = in.nextByte();
                if (board[row][col] == 1) {
                    rowOccupied[row] = true;
                    colOccupied[col] = true;
                }
            }
        }

        // Solve the problem
        if (placeRooks(n, 0, board, rowOccupied, colOccupied)) {
            // Print the resulting board
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

    public static boolean placeRooks(int n, int row, byte[][] board, boolean[] rowOccupied, boolean[] colOccupied) {
        if (row == n) {
            return true; // Successfully placed rooks in all rows
        }

        // If the current row already has a rook, move to the next row
        if (rowOccupied[row]) {
            return placeRooks(n, row + 1, board, rowOccupied, colOccupied);
        }

        for (int col = 0; col < n; col++) {
            // Check if the column is free
            if (!colOccupied[col]) {
                // Place a rook
                board[row][col] = 1;
                rowOccupied[row] = true;
                colOccupied[col] = true;

                // Recursively place rooks in the next rows
                if (placeRooks(n, row + 1, board, rowOccupied, colOccupied)) {
                    return true;
                }

                // Backtrack
                board[row][col] = 0;
                rowOccupied[row] = false;
                colOccupied[col] = false;
            }
        }

        return false; // No valid placement found for the current row
    }
}



