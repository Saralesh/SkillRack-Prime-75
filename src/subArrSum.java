import java.util.Scanner;

public class subArrSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        int sum = in.nextInt();
        int current_sum = arr[0];
        int rightindex = 0;
        int leftindex = 0;
        while(leftindex < n && rightindex < n){
            if(current_sum == sum){
                System.out.print("YES");
                return;
            }
            else if(current_sum < sum){
                rightindex++;
                if(rightindex < n) {
                    current_sum += arr[rightindex];
                }
            }
            else{
                current_sum -= arr[leftindex];
                leftindex++;
            }
        }
        System.out.print("NO");
    }
}
