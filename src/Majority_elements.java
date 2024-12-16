import java.util.Scanner;

public class Majority_elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        int majority_element = arr[0];
        int counter = 1;
        for(int i = 1;i < n;i++){
            if(arr[i] == majority_element){
                counter++;
            }
            else{
                counter--;
                if(counter == 0){
                    majority_element = arr[i];
                    counter = 1;
                }
            }
        }
            int count = 0;
            for(int i = 0;i < n;i++){
                if(arr[i] == majority_element)  count++;
            }
            if(count > n/2){
                System.out.print(majority_element);

            }
            else{
                System.out.print("no");

        }


    }
}
