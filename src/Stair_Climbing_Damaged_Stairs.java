import java.util.ArrayList;
import java.util.Scanner;

public class Stair_Climbing_Damaged_Stairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        int leaps[] = new int[s];
        ArrayList<Integer> damage = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            leaps[i] = in.nextInt();
        }

        for (int i = 0; i < t; i++) {
            damage.add(in.nextInt());
        }

        long ways[] = new long[n + 1];
        ways[0] = 1;

        for (int step = 1; step <= n; step++) {
            if (damage.contains(step)) {
                ways[step] = 0;
                continue;
            }

            for (int i = 0; i < s; i++) {
                if (step >= leaps[i]) {
                    ways[step] += ways[step - leaps[i]];
                }
            }
        }

        System.out.println(ways[n]);
    }
}
