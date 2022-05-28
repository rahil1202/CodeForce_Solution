import java.util.Scanner;

public class solution1374A {
    public static void main(String args[]) {
        /*
         * Scanner sc = new Scanner(System.in);
         * int test = sc.nextInt();
         * while (test-- > 0) {
         * int x = sc.nextInt();
         * int y = sc.nextInt();
         * int n = sc.nextInt();
         * int temp = n;
         * while (temp % x != y) {
         * temp--;
         * }
         * if (temp % x == y)
         * System.out.println(temp);
         * else if (n % x == y)
         * System.out.println(n);
         * else
         * System.out.println(0);
         * }
         */

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        while (cases-- > 0) {
            long x = scan.nextInt();
            long y = scan.nextInt();
            long n = scan.nextInt();
            long result = 0;
            result = y + (n - y) / x * x;
            System.out.println(result);
        }
        scan.close();

    }
}