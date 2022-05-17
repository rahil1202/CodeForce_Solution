import java.util.Scanner;

public class solution61A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int len = s2.length();
        int[] res = new int[len];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                res[i] = 1;
            else
                res[i] = 0;

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        sc.close();

    }
}