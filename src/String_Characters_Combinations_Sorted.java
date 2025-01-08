import java.util.*;

public class String_Characters_Combinations_Sorted {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Set<String> combinations = new TreeSet<>();
        solve(s, "", 0, combinations);

        for (String str : combinations) {
            System.out.println(str);
        }
    }

    static void solve(String s, String current, int index, Set<String> combinations) {
        if (index == s.length()) {
            if (!current.isEmpty()) {
                combinations.add(current);
            }
            return;
        }

        solve(s, current, index + 1, combinations);
        solve(s, current + s.charAt(index), index + 1, combinations);
    }
}