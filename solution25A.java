import java.util.Scanner;

public class solution25A {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = z.nextInt();
        }
        int e = 0, o = 0;
        for (int i = 0; i < a; i++) {
            if (b[i] % 2 == 0)
                e++;
            else
                o++;
        }
        if (e > o) {
            for (int i = 0; i < a; i++) {
                if (b[i] % 2 != 0)
                    System.out.println(i + 1);
            }
        }
        if (o > e) {
            for (int i = 0; i < a; i++) {
                if (b[i] % 2 == 0)
                    System.out.println(i + 1);
            }
        }
        z.close();
    }
}