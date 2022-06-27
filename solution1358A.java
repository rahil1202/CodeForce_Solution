import java.util.*;

public class solution1358A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a * b) % 2 == 0)
                System.out.println((a * b) / 2);
            else
                System.out.println(((a * b) / 2) + 1);
        }
        sc.close();
    }
}
