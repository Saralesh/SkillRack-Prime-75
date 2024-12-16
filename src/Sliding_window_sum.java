public class Sliding_window_sum {
   
        public static void main(String[] args) {
            // SlidingWindow sum using dp
            int [] arr = {1, 2, 3, 4, 5, 6};
            int k = 3;
            int n = arr.length;
            if(n < k){
                System.out.print("Error");
            }
            int[] windowsum = slidingwindow(arr,k,n);
            for(int sum : windowsum){
                System.out.print(sum + " ");
            }
        }
        static int[] slidingwindow(int[] arr,int k,int n){
            int[] dp = new int[n - k + 1];
            int currentsum = 0;
            for(int i = 0;i < k;i++){
                currentsum += arr[i];
            }
            dp[0] = currentsum;
            for(int i = 1;i < n - k + 1;i++){
                currentsum = currentsum - arr[i - 1] + arr[i + k - 1];
                dp[i] = currentsum;
            }
            return dp;
        }
    }


