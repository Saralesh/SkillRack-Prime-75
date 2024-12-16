import java.util.Scanner;

public class Minimum_Operation_Zero_to_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 1 || n == 2){
            System.out.print(n);
            return;
        }
        int count = 2;
        while(n > 2){
            if(n % 2 == 0){
                n /= 2;
                count++;
            }
            else{
                n -= 1;
                count++;
            }

        }
        System.out.print(count);

    }
}
