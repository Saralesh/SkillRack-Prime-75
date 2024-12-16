import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Remove_Adjacent_Logic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1;i >= 0;i--){
            if(st.isEmpty() || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else{
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.print(-1);
            return;
        }
        while(!st.isEmpty()){
           System.out.print(st.pop() + " ");
        }

    }
}
