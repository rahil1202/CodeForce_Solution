import java.util.*;

public class solution1607A {
    static Scanner sc;

    public static void solve() {
        String n = sc.next();
        String s = sc.next();
        int a[] = new int[26];
        for (int i = 0; i < n.length(); i++)
            a[n.charAt(i) - 'a'] = i + 1;
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            ans += Math.abs(a[s.charAt(i) - 'a'] - a[s.charAt(i + 1) - 'a']);
        }
        System.out.println(ans);
    }

    public static void main(String args[]) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
            solve();
    }
}