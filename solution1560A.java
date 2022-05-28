import java.util.Scanner;

public class solution1560A {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        int test = ip.nextInt();
        while (test-- > 0) {
            int n = ip.nextInt();
            for (int i = 1;; i++) {
                if (i % 3 == 0 || i % 10 == 3)
                    continue;
                if (--n == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        ip.close();
    }
}