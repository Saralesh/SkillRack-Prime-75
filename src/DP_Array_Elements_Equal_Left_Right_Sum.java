import java.util.*;

public class DP_Array_Elements_Equal_Left_Right_Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        long[] dp = new long[n + 1]; // Prefix sum array
        int sum = 0;

        // Reading input and calculating prefix sum
        for (int i = 1; i <= n; i++) {
            int x = in.nextInt();
            sum += x;
            arr[i] = x;
            dp[i] = sum;
        }

        // Checking the left and right sums for each element
        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (dp[i - 1] == dp[n] - dp[i]) { // Compare left and right sums
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        // If no such element exists
        if (!found) {
            System.out.println("No element found");
        }
    }
}
