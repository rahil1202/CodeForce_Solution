import java.util.*;

public class solution1433A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t-- > 0;) {
            String x = sc.next();
            int n = x.length();
            System.out.println((x.charAt(0) - '1') * 10 + n * (n + 1) / 2);
        }
        sc.close();
    }
}