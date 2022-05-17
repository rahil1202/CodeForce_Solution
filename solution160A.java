import java.util.Arrays;
import java.util.Scanner;

public class solution160A {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int[] a = new int[n];
        int tot = 0;
        for (int i = 0; i < n; i++) {
            a[i] = z.nextInt();
            tot += a[i];
        }
        tot = tot / 2;
        Arrays.sort(a);
        int k = 0, k1 = 0;
        for (int i = n - 1; i > 0; i--) {
            k1 += a[i];
            if (k1 > tot)
                break;
            else
                k++;
        }
        System.out.println(k + 1);
        z.close();
    }
}