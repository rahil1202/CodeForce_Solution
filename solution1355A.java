import java.util.Scanner;

public class solution1355A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            long n = sc.nextLong();
            long ans = 0;
            if (n > 2) {
                ans = (n - 1) / 2;
                System.out.println(ans);
            } else {
                System.out.println(0);
            }
            t--;
        }
        sc.close();
    }
}
