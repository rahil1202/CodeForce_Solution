
import java.util.Scanner;

public class solution1475A {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            long n = sc.nextLong();
            while (n % 2 == 0) {
                n = n / 2;
            }
            if (n == 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();

    }
}