import java.util.Scanner;

public class String_Pattern_count_KMP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String pattern = in.nextLine();
        int[] arr = new int[text.length()/3];
        KMPsearch(text,pattern,arr);
    }
    public static void KMPsearch(String text,String pattern,int[] arr){
        int n = text.length();
        int m = pattern.length();
        int i = 0;
        int j = 0;
        int[] lps = new int[m];
        CalculateLPSArray(pattern,lps);
        int count = 0;
        while(i < n){
            if(pattern.charAt(j) == text.charAt(i)){
                i++;
                j++;
            }
            if(j == m){
                arr[count++] = (i - j);
                j = lps[j - 1];
            }
            else if(i < n && pattern.charAt(j) != text.charAt(i)){
                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    i++;
                }
            }
        }
    }
    public static void CalculateLPSArray(String pattern,int[] lps){
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while(i < pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len == 0){
                    lps[0] = 0;
                    i++;
                }
                else{
                    len = lps[len - 1];
                }
            }
        }
    }

}
