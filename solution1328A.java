import java.util.*;

public class solution1328A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a % b == 0)
                System.out.println(0);
            else
                System.out.println(b - (a % b));
        }
        sc.close();
    }
}