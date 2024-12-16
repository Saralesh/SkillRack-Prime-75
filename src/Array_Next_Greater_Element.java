import java.util.Scanner;
import java.util.Stack;

public class Array_Next_Greater_Element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int next_greatest_ele;
        for(int i = n - 1;i >= 0;i--){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else if(st.peek() > arr[i]){
                next_greatest_ele = st.peek();
                st.push(arr[i]);
                arr[i] = next_greatest_ele;
            }
            else{
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(arr[i]);
                }
                else{
                    next_greatest_ele = st.peek();
                    st.push(arr[i]);
                    arr[i] = next_greatest_ele;
                }
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
