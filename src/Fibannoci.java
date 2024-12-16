public class Fibannoci {

        public static void main(String[] args) {
            int n = 10; // Number of terms
            System.out.println("Fibonacci Series:");
            printFibonacci(n);
        }

        public static void printFibonacci(int n) {
            if (n <= 0) return;

            int a = 0, b = 1;
            System.out.print(a + " ");
            if (n > 1) {
                System.out.print(b + " ");
            }

            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
    }



