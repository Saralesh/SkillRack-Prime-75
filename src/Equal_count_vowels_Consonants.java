import java.util.Scanner;

public class Equal_count_vowels_Consonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int k = in.nextInt();
        int n = s.length();
        if(n < k){
            System.out.print("Error");
            return;
        }
        int count = 0;
        int balance = 0;
        for(int i = 0;i < k;i++){
            char ch = s.charAt(i);
            if(isconsonant(ch))   balance++;
            else balance--;

        }
        if(balance == 0) count++;
        for(int i = 1;i < n - k + 1;i++){
           balance = balance + (isconsonant(s.charAt(i - 1)) ? -1 : 1);
            balance = balance + (isconsonant(s.charAt(i + k - 1)) ? 1 : -1);
            if(balance == 0) count ++;
        }
        System.out.print(count);
    }

    static boolean isconsonant(char ch){
        ch = Character.toLowerCase(ch);
        return ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'));
    }

}
