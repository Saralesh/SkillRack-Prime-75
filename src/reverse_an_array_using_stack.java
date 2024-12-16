import java.util.Scanner;
import java.util.Stack;

public class reverse_an_array_using_stack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n;i++){
            int val = in.nextInt();
            st.push(val);
        }
        while(!st.isEmpty()){
            int ele = st.pop();
            System.out.print(ele + " ");
        }
    }
}
