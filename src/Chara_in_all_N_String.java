import java.util.Scanner;

public class Chara_in_all_N_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] asciiCount = new int[128];
        for(int index = 0;index < n;index++){
            String s = in.next();
            for(char ch : s.toCharArray()){
                if(asciiCount[ch] == index){
                    asciiCount[ch]++;
                }
            }
        }
        for(int index = 1;index < 128;index++){
            if(asciiCount[index] == n)   System.out.print((char) index);
        }

    }
}
