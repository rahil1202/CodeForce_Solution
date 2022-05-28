import java.util.*;

public class solution1684B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int z = c;
            int y = 2 * z + b;
            int x = y + a;

            System.out.println(x + " " + y + " " + z);
        }
        sc.close();
    }
}
