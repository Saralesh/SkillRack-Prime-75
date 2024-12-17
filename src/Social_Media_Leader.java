import java.util.*;

public class Social_Media_Leader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < r; i++) {
            int follower = in.nextInt();
            int following = in.nextInt();
            arr[follower]--;
            arr[following]++;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == n - 1) {
                System.out.print(i);
                return;
            }
        }

        System.out.print(-1);
    }
}