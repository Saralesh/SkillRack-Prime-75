import java.util.Scanner;

public class MinOperationsXtoY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int count = 0;
        while(y > x){
            if(y % 2 != 0){
                 y += 1;
            }
            else{
                y /= 2;
            }
            count++;
        }
        count = count + (x - y);
        System.out.print(count);
    }
}
