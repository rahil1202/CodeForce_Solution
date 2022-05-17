import java.util.Scanner;

public class solution266A // 266A
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int b=sc.nextInt();
        int sum = 0;
        String s = sc.next();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            int ctr = 0;
            if (c[i] == c[i + 1])
                ctr++;
            sum += ctr;
        }
        System.out.println(sum);
        sc.close();
    }
}