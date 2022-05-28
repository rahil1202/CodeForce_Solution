import java.util.*;

public class solution1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            long c = Math.abs(a - b);
            long ans = c / 10;
            if (c % 10 > 0)
                ans++;
            System.out.println(ans);
        }
        sc.close();
    }
}