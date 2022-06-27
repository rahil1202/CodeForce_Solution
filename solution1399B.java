import java.io.*;
import java.util.*;

public class solution1399B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long min1 = Long.MAX_VALUE;
            long min2 = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] < min1)
                    min1 = a[i];
            }
            long[] b = new long[n];
            for (int j = 0; j < n; j++) {S
                b[j] = sc.nextLong();
                if (b[j] < min2)
                    min2 = b[j];
            }
            long moves = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] - min1 > b[i] - min2)
                    moves += a[i] - min1;
                else
                    moves += b[i] - min2;
            }
            System.out.println(moves);
        }
    }
}