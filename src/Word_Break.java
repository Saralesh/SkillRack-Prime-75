import java.util.*;

public class Word_Break {
    static boolean foundSolution = false;  // Track if at least one valid segmentation exists

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        String s = in.next();

        HashSet<String> set = new HashSet<>();
        // Populate the HashSet with dictionary words
        Collections.addAll(set, words);

        breakWord(set, s, "", 0);

        if (!foundSolution) {
            System.out.println("No valid segmentation");
        }
        in.close();
    }

    public static void breakWord(HashSet<String> set, String s, String output, int start) {
        if (start == s.length()) {
            System.out.println(output.trim());
            foundSolution = true;
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String word = s.substring(start, i + 1);
            if (set.contains(word)) {
                breakWord(set, s, output + word + " ", i + 1);
            }
        }
    }
}
