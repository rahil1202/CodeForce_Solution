import java.util.Scanner;

public class solution1367B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 != i % 2) {
                    if (i % 2 == 0)
                        even++;
                    else
                        odd++;
                }
            }
            if (even == odd)
                System.out.println(even);
            else
                System.out.println(-1);
        }
        sc.close();
    }

}
