import java.util.Scanner;

public class Chara_in_All_Except_N_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[128]; // To count the number of strings each character appears in

        for (int index = 0; index < n; index++) {
            String s = in.next();
            boolean[] visited = new boolean[128]; // Reset visited array for each string

            for (char ch : s.toCharArray()) {
                if (!visited[ch]) { // Ensure each character is processed only once per string
                    arr[ch]++;
                    visited[ch] = true; // Mark the character as visited for this string
                }
            }
        }

        // Print characters that appear in all or all but one string
        for (int index = 1; index < 128; index++) {
            if (arr[index] == n || arr[index] == n - 1) {
                System.out.print((char) index);
            }
        }
    }
}
