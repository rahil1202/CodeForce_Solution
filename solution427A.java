import java.util.Scanner;

public class solution427A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = 0, result = 0;
        while (n-- > 0) {
            int x = sc.nextInt();
            if (x != -1)
                r += x;
            else {
                if (r > 0)
                    r--;
                else
                    result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}