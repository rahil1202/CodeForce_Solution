import java.util.Scanner;

public class solution318A {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        long n = z.nextLong();
        long k = z.nextLong();
        if (n % 2 == 0) {
            if (k == n / 2)
                System.out.println(n - 1);
            if (k > n / 2)
                System.out.println(2 * (k - n / 2));
            if (k < n / 2)
                System.out.println((2 * k) - 1);
        } else {
            if (k == n / 2 + 1)
                System.out.println(n);
            if (k > n / 2 + 1)
                System.out.println(2 * (k - (n / 2 + 1)));
            if (k < n / 2 + 1)
                System.out.println((2 * k) - 1);
        }
        z.close();
    }

}