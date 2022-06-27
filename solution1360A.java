import java.util.*;

public class solution1360A {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        while (test-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int ans = (Math.max(Math.max(a, b), Math.min(a, b) * 2));
            System.out.println(ans * ans);
        }
        s.close();
    }
}