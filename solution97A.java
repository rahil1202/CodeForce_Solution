import java.util.Scanner;

public class solution97A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        for (int i = 0; i < k; i++) {

            if (n % 10 == 0) {
                n = n / 10;
            } else {
                n = n - 1;
            }
        }
        System.out.println(n);
        sc.close();

    }
}