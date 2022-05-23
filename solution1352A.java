import java.util.Scanner;

public class solution1352A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test-- > 0) {
            int value = sc.nextInt();
            int total = 0, i = 0;
            int rem[] = new int[6];
            int m = 1;
            for (i = 1; i < 6; i++) {
                rem[i] = value % 10;
                value /= 10;
                if (rem[i] != 0) {
                    total++;
                }

            }
            System.out.println(total);

            for (i = 1; i < 6; i++) {

                if (rem[i] != 0) {
                    System.out.print(rem[i] * m + " ");
                }
                m *= 10;
            }
            System.out.println("");
        }
        sc.close();
    }
}