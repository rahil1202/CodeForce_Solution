import java.util.*;

public class solution750A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            k += (5 * i);
            if (k > 240)
                break;
            else
                temp++;
        }
        System.out.println(temp);
        sc.close();

    }
}