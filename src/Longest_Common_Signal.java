import java.util.Scanner;

public class Longest_Common_Signal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int r = s1.length();
        int c = s2.length();
        int[][] mat = new int[r][c];
        int max = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    mat[i][j] = (i == 0 || j == 0) ? 1 : 1 + mat[i - 1][j - 1];

                    if (mat[i][j] > max) {
                        max = mat[i][j];
                    } else {
                        mat[i][j] = 0;
                    }
                    max = Math.max(max, mat[i][j]);
                }
            }

        }
        System.out.println(max);
    }
}
