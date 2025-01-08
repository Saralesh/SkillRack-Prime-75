import java.util.Scanner;

public class Permutations_String_Characters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int l = 0;
        permute(s, l);
    }

    private static void permute(String s, int l) {
        if (l == s.length() - 1) {
            System.out.println(s);
            return;
        }
        for (int i = l; i < s.length(); i++) {
            s = swap(s, l, i);
            permute(s, l + 1);
            s = swap(s, l, i);
        }
    }

    private static String swap(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
