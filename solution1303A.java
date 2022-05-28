import java.util.*;

public class solution1303A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int c1 = 0;
            int s1 = 0;
            int s2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1')
                    c1++;
                if (s.charAt(i) == '0' && c1 != 0)
                    s2++;
                if (s.charAt(i) == '1' && c1 != 0) {
                    s1 = s1 + s2;
                    s2 = 0;
                }
            }
            System.out.println(s1);
        }
        sc.close();
    }
}