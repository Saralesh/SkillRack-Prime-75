import java.util.ArrayList;
import java.util.Scanner;

public class Stair_Climbing_Slipper_stairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        int leaps[] = new int[s];
        ArrayList<Integer> slippery = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            leaps[i] = in.nextInt();
        }

        for (int i = 0; i < t; i++) {
            slippery.add(in.nextInt());
        }

        long ways[] = new long[n + 1];
        ways[0] = 1;

        for (int step = 1; step <= n; step++) {
            for (int i = 0; i < s; i++) {
                if (step >= leaps[i]) {
                    ways[step] += ways[step - leaps[i]];
                }
            }
            if(slippery.contains(step)){
                int laststep = step - 1;
                while(slippery.contains(laststep) && laststep > 0){
                    laststep--;
                }
                if(laststep > 0){
                    ways[laststep] += ways[step];
                }
                ways[step] = 0;

            }
        }

        System.out.println(ways[n]);
    }
}
