import java.util.HashMap;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] freq = new int[126];
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            int ascii = ch;
            freq[ascii]++;
        }
        for(int i = 0;i < 26;i++){
            if(freq[i] < 2){
                System.out.println((char) freq[i]);
            }
        }

    }
}
