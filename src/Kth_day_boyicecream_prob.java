import java.util.Scanner;

public class Kth_day_boyicecream_prob {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k  = in.nextInt();
            long[] chocs = new long[n + 1];
            long[] icecream = new long[n + 1];
            chocs[1] = icecream[1] = 1;
            for(int days = 2; days <= n;days++) {
                chocs[days] = chocs[days - 1] + icecream[days - 1];
                icecream[days] = chocs[days - 1];
                if (days % k == 0) {
                    icecream[days] = chocs[days];
                }
            }
            System.out.println(chocs[n] + icecream[n]);
        }

    }
