import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Consonants_Count_in_Sliding_Window {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int n = s.length();
        if(n < k){
            System.out.print("Error");
            return;
        }
        int[] no_cons = solve(k,s,n);
        for(int i : no_cons){
            System.out.print(i + " ");
        }
    }
    static int[] solve(int k,String s,int n){
        int[] dp = new int[n - k + 1];
        int current_count = 0;
        for(int i = 0;i < k;i++){
            char ch = s.charAt(i);
            if(isconsonant(ch)){
                current_count += 1;
            }
        }
        dp[0] = current_count;
        for(int i = 1;i < n - k + 1;i++){
            if(isconsonant(s.charAt(i -1)))  current_count--;
            if(isconsonant(s.charAt(i + k - 1))) current_count++;
            dp[i] = current_count;
        }
            return dp;
    }
    static boolean isconsonant(char ch){
        ch = Character.toLowerCase(ch);
        return ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'));
    }
}
