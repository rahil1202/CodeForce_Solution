import java.util.*;

public class solution731A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int a = 97;
        int r = 0, d;
        for (int i = 0; i < s.length(); i++) {
            d = Math.abs(a - ch[i]);
            if (d > 13) {
                d = 26 - d;
            }
            r += d;
            a = ch[i];
        }
        System.out.println(r);
        sc.close();
    }
}
