import java.util.Map;
import java.util.Scanner;

public class Maximum_sum_of_SubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int currentsum = arr[0];
        int maxi = arr[0];
        for(int i = 1;i < n;i++){
            currentsum = Math.max(currentsum + arr[i],arr[i]);
            maxi = Math.max(currentsum,maxi);
        }
        System.out.print(maxi);

        //using kadane's Algo another method
//        int sum = 0;
//        int maxi = Integer.MIN_VALUE;
//        for(int i = 0;i < n;i++){
//            sum += arr[i];
//            maxi = sum > maxi ? sum : maxi;
//            sum = sum < 0 ? 0 : sum;
//        }
//        System.out.println(maxi);
//
    }
}
