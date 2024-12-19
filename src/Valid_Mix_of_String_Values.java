import java.util.Scanner;

public class Valid_Mix_of_String_Values {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();

        if (s1.length() + s2.length() != s3.length()) {
            System.out.println("no");
            return;
        }

        int i = 0, j = 0, z = 0;
        if (isValid(s1, s2, s3, i, j, z)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean isValid(String s1, String s2, String s3, int i, int j, int z) {
        while (z < s3.length()) {
            if (i < s1.length() && j < s2.length() && s1.charAt(i) == s3.charAt(z) && s2.charAt(j) == s3.charAt(z)) {
                if (isValid(s1, s2, s3, i + 1, j, z + 1)) {
                    return true;
                } else {
                    return isValid(s1, s2, s3, i, j + 1, z + 1);
                }
            }
            else if (i < s1.length() && s1.charAt(i) == s3.charAt(z)) {
                i++;
                z++;
            }
            else if (j < s2.length() && s2.charAt(j) == s3.charAt(z)) {
                j++;
                z++;
            }
            else {
                return false;
            }
        }
        return i == s1.length() && j == s2.length();
    }
}
