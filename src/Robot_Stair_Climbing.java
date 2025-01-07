import java.util.Scanner;

public class Robot_Stair_Climbing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int leaps[] = new int[s];
        for (int i = 0; i < s; i++) {
            leaps[i] = in.nextInt();
        }
        long ways[] = new long[n + 1];
        ways[0] = 1;
        for (int step = 1; step <= n; step++) {
            for (int i = 0; i < s; i++) {
                if (step >= leaps[i]) {
                    ways[step] += ways[step - leaps[i]];
                }
            }
        }
        System.out.print(ways[n]);
    }
}
