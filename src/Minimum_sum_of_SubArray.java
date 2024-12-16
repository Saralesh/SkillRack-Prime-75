import java.util.Scanner;

public class Minimum_sum_of_SubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int currentsum = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            currentsum = Math.min(currentsum + arr[i], arr[i]);
            min = Math.min(currentsum, min);
        }
        System.out.print(min);
    }
}
