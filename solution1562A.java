import java.util.*;

public class solution1562A {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println(r % Math.max(l, r / 2 + 1));
        }
        in.close();
    }
}