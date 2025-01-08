import java.sql.SQLOutput;
import java.util.Scanner;

public class Stock_Buy_Sell_Once_Maximum_Profit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n];
        for(int i = 0;i < n;i++){
            dp[i] = in.nextInt();
        }
        int min = dp[0];
        int max = 0;
        for(int i = 1;i < n;i++){
            if(dp[i] < min)  min = dp[i];
            else{
                int temp = dp[i] - dp[i - 1];
                max = Math.max(temp,max);
            }
        }
        System.out.println(max);
    }
}
