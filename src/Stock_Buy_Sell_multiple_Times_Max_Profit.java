import java.util.Scanner;

public class Stock_Buy_Sell_multiple_Times_Max_Profit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n];
        int profit = 0;
        for(int i = 0;i < n;i++){
            dp[i] = in.nextInt();
        }
        for(int i = 1;i < n;i++){
            if(dp[i] > dp[i - 1]){
                profit += dp[i] - dp[i - 1];
            }
        }
        System.out.println(profit);
    }
}
