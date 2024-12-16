import java.util.Scanner;

public class KMP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = in.nextLine();
        System.out.println("Enter the pattern:");
        String pattern = in.nextLine();
        kmpSearch(text, pattern);
    }

    // Function to calculate the LPS array
    public static void calculateLPS(String pattern, int[] lps) {
        int len = 0; // Length of the previous longest prefix suffix
        lps[0] = 0;  // LPS[0] is always 0
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    // Function to perform KMP search
    public static void kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = new int[m];
        calculateLPS(pattern, lps);

        int i = 0; // Index for text
        int j = 0; // Index for pattern

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = 0;
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }
}
